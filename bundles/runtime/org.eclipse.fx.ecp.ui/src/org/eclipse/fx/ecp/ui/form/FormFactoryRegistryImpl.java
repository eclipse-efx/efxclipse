package org.eclipse.fx.ecp.ui.form;

import org.eclipse.emf.ecore.EObject;

public class FormFactoryRegistryImpl implements ModelElementForm.Factory.Registry {
	
	final ModelElementForm.Factory defaultFactory = new DefaultModelElementForm.Factory();

	@Override
	public ModelElementForm.Factory getFactory(EObject modelElement) {
		return defaultFactory;
	}

}
