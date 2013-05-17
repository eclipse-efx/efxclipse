package org.eclipse.fx.ecp.ui.controls;

import javafx.beans.property.Property;
import javafx.scene.control.CheckBox;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.fx.ecp.ui.Control;

public class CheckBoxControl extends CheckBox implements Control {

	public CheckBoxControl(Property<Boolean> property, ECPControlContext context) {
		selectedProperty().bindBidirectional(property);
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
			return new CheckBoxControl((Property<Boolean>) property, context);
		}
		
	}

}
