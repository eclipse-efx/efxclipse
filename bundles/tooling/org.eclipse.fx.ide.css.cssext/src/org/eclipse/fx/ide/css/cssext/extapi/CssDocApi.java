package org.eclipse.fx.ide.css.cssext.extapi;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssext.extapi.scope.Scope;

public interface CssDocApi {
	String getDocHead(Scope resource, EObject o);
	String getDocumentation(Scope resource, EObject o);
}
