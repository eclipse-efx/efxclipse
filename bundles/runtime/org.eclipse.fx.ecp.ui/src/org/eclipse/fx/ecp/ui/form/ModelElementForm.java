package org.eclipse.fx.ecp.ui.form;

import javafx.scene.Node;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.edit.ECPControlContext;

public interface ModelElementForm {
	
	void handleValidation(Diagnostic diagnostic);

	void dispose();
	
	interface Factory {
		
		Node createModelElementForm(ECPControlContext modelElementContext);
		
		interface Registry {
			
			Registry INSTANCE = new FormFactoryRegistryImpl();
			
			Factory getFactory(EObject modelElement);

		}
		
	}
	
	
}
