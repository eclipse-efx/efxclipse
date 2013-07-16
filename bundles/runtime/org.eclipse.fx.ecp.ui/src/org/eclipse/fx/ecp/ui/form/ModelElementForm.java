package org.eclipse.fx.ecp.ui.form;

import javafx.scene.Node;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;

public interface ModelElementForm {
	
	void dispose();
	
	interface Factory {
		
		Node createModelElementForm(EObject modelElement, EditingDomain editingDomain, ECPModelElementOpener modelElementOpener);
		
		interface Registry {
			
			Registry INSTANCE = new FormFactoryRegistryImpl();
			
			Factory getFactory(EObject modelElement);

		}
		
	}
	
	
}
