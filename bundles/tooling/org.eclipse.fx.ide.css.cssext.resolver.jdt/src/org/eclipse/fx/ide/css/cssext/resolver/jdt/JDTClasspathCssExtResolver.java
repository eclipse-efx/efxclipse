package org.eclipse.fx.ide.css.cssext.resolver.jdt;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.function.Consumer;
import java.util.jar.Manifest;
import java.util.stream.Collectors;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResource;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.core.runtime.URIUtil;
import org.eclipse.fx.core.Subscription;
import org.eclipse.fx.ide.css.cssext.extapi.registry.CssExtFileWatcher;
import org.eclipse.jdt.core.ElementChangedEvent;
import org.eclipse.jdt.core.IClasspathEntry;
import org.eclipse.jdt.core.IJavaElementDelta;
import org.eclipse.jdt.core.IJavaProject;
import org.eclipse.jdt.core.IPackageFragmentRoot;
import org.eclipse.jdt.core.JavaCore;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(service=CssExtFileWatcher.class, immediate=true, property={"context=org.eclipse.core.resources.IProject"})
public class JDTClasspathCssExtResolver implements CssExtFileWatcher<IProject> {

	private Map<IProject, List<Consumer<URI>>> addListener = new HashMap<>();
	private Map<IProject, List<Consumer<URI>>> removeListener = new HashMap<>();
	private Map<IProject, Set<URI>> cssExtURIs = new HashMap<>();
	
	
	@Override
	public String getId() {
		return "jdt-classpath";
	}
	
	private Set<URI> findAllCssExtFiles(IProject context) {
		Set<URI> result = new HashSet<>();
		try {
			if (context.hasNature(JavaCore.NATURE_ID)) {
				IJavaProject project = JavaCore.create(context);
				IClasspathEntry[] resolvedClasspath = project.getResolvedClasspath(true);
				
				for (IClasspathEntry e : resolvedClasspath) {
					System.err.println("entry " + e.getPath());
					if (e.getEntryKind() == IClasspathEntry.CPE_LIBRARY) {
						System.err.println("CPE_LIBRARY -> jar?");
						System.err.println(" -> " + e.getPath());
						
						if (!e.getPath().toString().endsWith(".jar")) {
							System.err.println("not supported.");
							continue;
						}
						
						try {
							URI jarURI = URIUtil.fromString("file:" + e.getPath().toString());
							
							String baseURI = e.getPath().toString().endsWith(".jar") ? "jar:" + jarURI.toString() + "!" : jarURI.toString();
							
							URI manifestURI = new URI(baseURI + "/META-INF/MANIFEST.MF");
							
							Manifest mf = null;
							String cssExtDefs = null;
							try (InputStream data = manifestURI.toURL().openStream()) {
								mf = new Manifest(data);
								cssExtDefs = mf.getMainAttributes().getValue("CssExt-Definition");
							}
							catch (IOException ex) {
								ex.printStackTrace();
							}
							
							if (cssExtDefs != null) {
								System.err.println("FOUND " + cssExtDefs);
								for (String cssExtDef : cssExtDefs.split(",")) {
									try {
										URI extURI = new URI(baseURI + "/" + cssExtDef.trim());
										System.err.println(" -> " + extURI);
										result.add(extURI);
									}
									catch (URISyntaxException ex) {
										ex.printStackTrace();
									}
								}
							}
						}
						catch (URISyntaxException ex) {
							ex.printStackTrace();
						}
						
					}
					else if (e.getEntryKind() == IClasspathEntry.CPE_PROJECT) {
						System.err.println("CPE_PROJECT");
						System.err.println(" -> " + e.getOutputLocation());
					}
				}
				
			}
		}
		catch (CoreException e) {
			e.printStackTrace();
		}
		
		return result;
	}
	
	private void onElementChange(ElementChangedEvent event) {
		System.err.println("on catchall change " + event);
		
		IJavaElementDelta delta = event.getDelta();
		for (IJavaElementDelta child : delta.getAffectedChildren()) {
			if (child.getElement() instanceof IJavaProject) {
				IJavaProject p = (IJavaProject) child.getElement();
				IProject project = p.getProject();
				System.err.println("Project " + p.getElementName() + " Change");
				if ((child.getFlags() & IJavaElementDelta.F_RESOLVED_CLASSPATH_CHANGED) == IJavaElementDelta.F_RESOLVED_CLASSPATH_CHANGED) {
					System.err.println(" -> classpath change");
					
					for (IJavaElementDelta cc : child.getAffectedChildren()) {
						if ((cc.getFlags() & IJavaElementDelta.F_ADDED_TO_CLASSPATH) == IJavaElementDelta.F_ADDED_TO_CLASSPATH ||
								cc.getKind() == IJavaElementDelta.ADDED) {
							System.err.println("  added " + cc.getElement());
							
							if (cc.getElement() instanceof IPackageFragmentRoot) {
								IPackageFragmentRoot f = (IPackageFragmentRoot) cc.getElement();
								for (URI uri : findCssExt(f)) {
									Set<URI> set = cssExtURIs.get(project);
									if (set != null) {
										set.add(uri);
										for (Consumer<URI> l : addListener.get(project)) {
											l.accept(uri);
										}
									}
								}
							}
							
						}
						if ((cc.getFlags() & IJavaElementDelta.F_REMOVED_FROM_CLASSPATH) == IJavaElementDelta.F_REMOVED_FROM_CLASSPATH ||
								cc.getKind() == IJavaElementDelta.REMOVED) {
							System.err.println("  removed " + cc.getElement());
							
							if (cc.getElement() instanceof IPackageFragmentRoot) {
								IPackageFragmentRoot f = (IPackageFragmentRoot) cc.getElement();
								for (URI uri : findCssExt(f)) {
									Set<URI> set = cssExtURIs.get(project);
									if (set != null) {
										set.remove(uri);
										for (Consumer<URI> l : removeListener.get(project)) {
											l.accept(uri);
										}
									}
								}
							}
						}
					}
					
				}
			}
			
		}
	}
	
	private Set<URI> findCssExt(IPackageFragmentRoot f) {
		System.err.println("external: " + f.isExternal());
		System.err.println("path: " + f.getPath());
		
		String baseURI;
		if (f.isExternal()) {
			baseURI = "file:" + f.getPath().toString();
		}
		else {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IResource res = root.findMember(f.getPath());
			baseURI = "file:" + res.getLocation().toString();
		}
		
		if (f.isArchive()) {
			baseURI = "jar:" + baseURI.toString() + "!";
		}
		
		final String fBaseURI = baseURI;
		
		System.err.println("baseURI = " + baseURI);
		
		String manifestURI = baseURI + "/META-INF/MANIFEST.MF";
		
		System.err.println("manifestURI = " + manifestURI);
		
		String cssExtDefs = null;
		try (InputStream in = new URI(manifestURI).toURL().openStream()) {
			Manifest mf = new Manifest(in);
			cssExtDefs = mf.getMainAttributes().getValue("CssExt-Definition");
		}
		catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
		if (cssExtDefs != null) {
			System.err.println("FOUND " + cssExtDefs + " in " + manifestURI);
			
			return Arrays.stream(cssExtDefs.split(","))
					.map(cssExtDef -> URI.create(fBaseURI + (f.isArchive() ? "" : "/bin" ) + "/" + cssExtDef))
					.collect(Collectors.toSet());
		}
		return Collections.emptySet();
	}
	
	@Activate
	protected void activate() {
		JavaCore.addElementChangedListener(this::onElementChange);
	}

	@Deactivate
	protected void deactivate() {
		JavaCore.removeElementChangedListener(this::onElementChange);
	}

	private void init(IProject context) {
		if (!cssExtURIs.containsKey(context)) {
			try {
				if (context.hasNature(JavaCore.NATURE_ID)) {
					addListener.put(context, new ArrayList<>());
					removeListener.put(context, new ArrayList<>());
					cssExtURIs.put(context, new HashSet<>());
					
					// populate
					cssExtURIs.get(context).addAll(findAllCssExtFiles(context));
				}
			}
			catch (CoreException e) {
				e.printStackTrace();
			}
		}
	}
	
	@Override
	public Subscription subscribe(IProject context, Consumer<URI> onAdd, Consumer<URI> onRemove) {
		init(context);
		addListener.get(context).add(onAdd);
		removeListener.get(context).add(onRemove);
		
		return new Subscription() {
			@Override
			public void dispose() {
				addListener.get(context).remove(onAdd);
				removeListener.get(context).remove(onRemove);
				
			}
		};
	}
	
	@Override
	public Set<URI> getCurrent(IProject context) {
		init(context);
		return cssExtURIs.get(context);
	}

}
