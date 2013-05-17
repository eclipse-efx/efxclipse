package org.eclipse.fx.ecp.ui.controls;


import javafx.beans.property.Property;
import javafx.scene.control.TextField;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.fx.ecp.ui.Control;

@SuppressWarnings("restriction")
public class DummyControl extends TextField implements Control {

	public DummyControl(Property<?> property, ECPControlContext context) {
		setText(property.getValue().toString());
		setDisable(true);
	}
	
	@Override
	public void handleValidation(Diagnostic diagnostic) {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void resetValidation() {
		// TODO Auto-generated method stub
	}
	
	public static class Factory implements Control.Factory {

		@Override
		public Control createControl(Property<?> property, EStructuralFeature feature, ECPControlContext context) {
			return new DummyControl(property, context);
		}
		
	}

}
