package org.eclipse.fx.ide.css.cssext.extapi.scope;

import org.eclipse.emf.ecore.EObject;

public interface ProjectScopeProvider {
	public Scope getScope(EObject context);
}
