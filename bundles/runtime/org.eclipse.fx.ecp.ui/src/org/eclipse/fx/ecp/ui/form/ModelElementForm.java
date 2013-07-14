package org.eclipse.fx.ecp.ui.form;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ecp.ui.ECPControlContext;

public interface ModelElementForm {
	
	void dispose();
	
	interface Factory {
		
		Node createModelElementForm(ECPControlContext modelElementContext);
		
		interface Registry {
			
			Registry INSTANCE = new FormFactoryRegistryImpl();
			
			Factory getFactory(EObject modelElement);

		}
		
	}
	
	
}
