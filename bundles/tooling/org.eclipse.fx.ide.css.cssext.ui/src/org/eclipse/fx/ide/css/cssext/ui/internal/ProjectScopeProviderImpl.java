package org.eclipse.fx.ide.css.cssext.ui.internal;

import java.net.URI;
import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.eclipse.core.resources.IProject;
import org.eclipse.core.resources.IResourceChangeEvent;
import org.eclipse.core.resources.IResourceDelta;
import org.eclipse.core.resources.IResourceDeltaVisitor;
import org.eclipse.core.resources.IWorkspaceRoot;
import org.eclipse.core.resources.ResourcesPlugin;
import org.eclipse.core.runtime.CoreException;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssext.extapi.scope.GlobalScope;
import org.eclipse.fx.ide.css.cssext.extapi.scope.ProjectScopeProvider;
import org.eclipse.fx.ide.css.cssext.extapi.scope.Scope;
import org.eclipse.fx.ide.css.cssext.ui.ProjectScope;
import org.eclipse.xtext.resource.XtextResourceSet;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

import com.google.inject.Injector;

@Component
public class ProjectScopeProviderImpl implements ProjectScopeProvider {

	private GlobalScope globalScope;

	private Map<IProject, Scope> cachedScopes = Collections.synchronizedMap(new HashMap<>());

	private void onResourceChanged(IResourceChangeEvent event) {
		// TODO: delete project from cache if removed
		System.err.println("onResourceCHange" + event);
		try {
			event.getDelta().accept(new IResourceDeltaVisitor() {
				@Override
				public boolean visit(IResourceDelta delta) throws CoreException {
					if (delta.getKind() == IResourceDelta.REMOVED) {
						System.err.println("REMOVED ");
						if (delta.getResource() instanceof IProject) {
							System.err.println("project " + delta.getResource());
							IProject removedProject = (IProject) delta.getResource();
							cachedScopes.remove(removedProject);
						}
					}


					return true;
				}
			});
		} catch (CoreException e) {
			e.printStackTrace();
		}

	}

	@Activate
	protected void activate() {
		ResourcesPlugin.getWorkspace().addResourceChangeListener(this::onResourceChanged);
	}

	@Deactivate
	protected void deactivate() {
		ResourcesPlugin.getWorkspace().removeResourceChangeListener(this::onResourceChanged);
	}


	private static Pattern PLATFORM_RESOURCE_PATTERN = Pattern.compile("platform:/resource/([^/]+).*");

	private IProject getProject(EObject context) {
		URI uri = URI.create(context.eResource().getURI().toString());
		Matcher matcher = PLATFORM_RESOURCE_PATTERN.matcher(uri.toString());
		if (matcher.matches()) {
			IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
			IProject project = root.getProject(matcher.group(1));
			System.err.println(" -> currentProject " + project);
			return project;
		}
		else {
			System.err.println("cannot determine project from uri " + uri + " -> no project scope exists");
			return null;
		}
	}

	private XtextResourceSet createXtextResourceSet() {
		Injector injector = CssextActivator.getInstance().getInjector(CssextActivator.ORG_ECLIPSE_FX_IDE_CSS_CSSEXT_CSSEXTDSL);
		return injector.getInstance(XtextResourceSet.class);
	}

	private Scope createProjectScope(EObject context) {
		if (globalScope == null) {
			globalScope = new GlobalScope(createXtextResourceSet());
			globalScope.init();
		}
		IProject project = getProject(context);
		if (project == null) return null;
		ProjectScope scope = new ProjectScope(globalScope, createXtextResourceSet(), project);
		scope.init();

		return scope;
	}

	@Override
	public Scope getScope(EObject context) {
		IProject project = getProject(context);
		Scope scope = cachedScopes.get(project);
		if (scope == null) {
			scope = createProjectScope(context);
			if (scope != null) cachedScopes.put(project, scope);
		}
		if (scope == null) {
			return globalScope;
		}
		return scope;
	}

}
