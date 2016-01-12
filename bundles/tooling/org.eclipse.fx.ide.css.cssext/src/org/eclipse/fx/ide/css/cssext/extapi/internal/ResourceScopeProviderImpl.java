package org.eclipse.fx.ide.css.cssext.extapi.internal;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssext.extapi.scope.ProjectScopeProvider;
import org.eclipse.fx.ide.css.cssext.extapi.scope.ResourceScope;
import org.eclipse.fx.ide.css.cssext.extapi.scope.ResourceScopeProvider;
import org.eclipse.xtext.resource.XtextResource;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Reference;

@Component
public class ResourceScopeProviderImpl implements ResourceScopeProvider {

	private ProjectScopeProvider projectScopeProvider;
	@Reference
	protected void setProjectScopeProvider(ProjectScopeProvider p) { projectScopeProvider = p; }
	protected void unsetProjectScopeProvider(ProjectScopeProvider p) { }


	private Map<URI, ResourceScope> cachedScopes = Collections.synchronizedMap(new HashMap<>());

	private URI getResourceURI(EObject context) {
		return context.eResource().getURI();
	}

	private ResourceScope createResourceScope(EObject context) {
		ResourceScope scope = new ResourceScope(projectScopeProvider.getScope(context), (XtextResource) context.eResource());
		scope.init();
		return scope;
	}

	@Override
	public ResourceScope getScope(EObject context) {
		URI resourceURI = getResourceURI(context);
		ResourceScope scope = cachedScopes.get(resourceURI);
		if (scope == null) {
			scope = createResourceScope(context);
			cachedScopes.put(resourceURI, scope);
		}
		return scope;
	}



}
