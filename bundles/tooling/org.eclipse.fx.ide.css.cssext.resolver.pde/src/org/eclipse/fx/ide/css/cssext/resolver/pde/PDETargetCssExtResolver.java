package org.eclipse.fx.ide.css.cssext.resolver.pde;

import java.io.IOException;
import java.io.InputStream;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.jar.Manifest;
import java.util.stream.Collectors;

import org.eclipse.core.runtime.NullProgressMonitor;
import org.eclipse.fx.core.Subscription;
import org.eclipse.fx.ide.css.cssext.extapi.registry.CssExtFileWatcher;
import org.eclipse.osgi.service.resolver.BundleDescription;
import org.eclipse.osgi.service.resolver.State;
import org.eclipse.osgi.service.resolver.StateDelta;
import org.eclipse.pde.core.target.ITargetDefinition;
import org.eclipse.pde.core.target.TargetBundle;
import org.eclipse.pde.internal.core.IStateDeltaListener;
import org.eclipse.pde.internal.core.PDECore;
import org.eclipse.pde.internal.core.TargetPlatformHelper;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;

@SuppressWarnings("restriction")
@Component(service=CssExtFileWatcher.class, immediate=true, property={"context=java.lang.Void"})
public class PDETargetCssExtResolver implements CssExtFileWatcher<Void> {

	private Set<URI> cssExtURIs = new HashSet<>();
	private List<Consumer<URI>> addListeners = Collections.synchronizedList(new ArrayList<>());
	private List<Consumer<URI>> removeListeners = Collections.synchronizedList(new ArrayList<>());

	@Override
	public Subscription subscribe(Void context, Consumer<URI> onAdd, Consumer<URI> onRemove) {
		if (onAdd != null) addListeners.add(onAdd);
		if (onRemove != null) removeListeners.add(onRemove);
		return new Subscription() {
			@Override
			public void dispose() {
				if (onAdd != null) addListeners.remove(onAdd);
				if (onRemove != null) removeListeners.remove(onRemove);
			}
		};
	}
	
	@Override
	public String getId() {
		return "pde-target";
	}
	
	private Set<BundleDescription> currentBundles = new HashSet<>();
	
	private Set<URI> findCssExt(String bundleLocation) {
//		System.err.println("find " + bundleLocation);
		String baseLocation = (bundleLocation.endsWith(".jar") ? "jar:" : "") + (bundleLocation.startsWith("file:") ? "" : "file:") + bundleLocation + (bundleLocation.endsWith(".jar") ? "!" : "");
		
		String manifestLocation = baseLocation + "/META-INF/MANIFEST.MF";
		
//		System.err.println(manifestLocation);
		
		String cssExtDefs = null;
		try (InputStream in = new URI(manifestLocation).toURL().openStream()) {
			Manifest mf = new Manifest(in);
			cssExtDefs = mf.getMainAttributes().getValue("CssExt-Definition");
		}
		catch (URISyntaxException | IOException e) {
			e.printStackTrace();
		}
		if (cssExtDefs != null) {
			System.err.println("FOUND " + cssExtDefs + " in " + bundleLocation);
			
			return Arrays.stream(cssExtDefs.split(","))
					.map(cssExtDef -> URI.create(baseLocation + (bundleLocation.endsWith(".jar") ? "" : "/bin" ) + "/" + cssExtDef))
					.filter(PDETargetCssExtResolver::notNull)
					.collect(Collectors.toSet());
		}
		return Collections.emptySet();
	}
	
	private static boolean notNull(Object o) {
		return o != null;
	}
	
	private void checkBundles(Set<BundleDescription> currentBundles) {
		Set<BundleDescription> oldBundles = this.currentBundles;
		
		Set<BundleDescription> removedBundles = new HashSet<>(oldBundles);
		removedBundles.removeAll(currentBundles);
		
		Set<BundleDescription> addedBundles = new HashSet<>(currentBundles);
		addedBundles.removeAll(oldBundles);
		
		for (BundleDescription b : addedBundles) {
			for (URI cssExt : findCssExt(b.getLocation())) {
				cssExtURIs.add(cssExt);
				for (Consumer<URI> onAdd : addListeners) {
					onAdd.accept(cssExt);
				}
			}
		}
		
		for (BundleDescription b : removedBundles) {
			for (URI cssExt : findCssExt(b.getLocation())) {
				cssExtURIs.remove(cssExt);
				for (Consumer<URI> onRemove : removeListeners) {
					onRemove.accept(cssExt);
				}
			}
		}
		
		this.currentBundles = currentBundles;
	}

	@Activate
	protected void activate() {
		try {
			// install listener
			PDECore.getDefault().getModelManager().addStateDeltaListener(new IStateDeltaListener() {

				@Override
				public void stateResolved(StateDelta delta) {
					System.err.println("stateResolved " + delta);
				}

				@Override
				public void stateChanged(State newState) {
					System.err.println("stateChanged " + Arrays.toString(newState.getBundles()));
					checkBundles(new HashSet<>(Arrays.asList(newState.getResolvedBundles())));
				}
			});

			// initial load
			ITargetDefinition target = TargetPlatformHelper.getWorkspaceTargetResolved(new NullProgressMonitor());
			TargetBundle[] bundles = target.getBundles();
			for (TargetBundle b : bundles) {
				for (URI cssExt : findCssExt(b.getBundleInfo().getLocation().toString())) {
					cssExtURIs.add(cssExt);
					for (Consumer<URI> onAdd : addListeners) {
						onAdd.accept(cssExt);
					}
				}
			}
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@Override
	public Set<URI> getCurrent(Void context) {
		return cssExtURIs;
	}

}
