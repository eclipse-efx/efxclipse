package org.eclipse.fx.ecp.ui;

import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

@SuppressWarnings("restriction")
public class DummyControlFactory implements Control.Factory {

	@Override
	public Control createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
		return null;
	}

}
