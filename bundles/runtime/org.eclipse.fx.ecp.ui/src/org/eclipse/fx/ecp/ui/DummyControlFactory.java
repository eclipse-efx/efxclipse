package org.eclipse.fx.ecp.ui;

import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

@SuppressWarnings("restriction")
public class DummyControlFactory implements ECPControl.Factory {

	@Override
	public ECPControl createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
		return null;
	}

}
