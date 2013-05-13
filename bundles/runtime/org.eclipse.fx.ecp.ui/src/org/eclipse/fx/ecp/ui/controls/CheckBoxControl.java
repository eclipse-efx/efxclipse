package org.eclipse.fx.ecp.ui.controls;

import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;

@SuppressWarnings("restriction")
public class CheckBoxControl extends VBox implements Control {

	public CheckBoxControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		getStyleClass().add("formControl");
		
		EObject modelElement = context.getModelElement();

		EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		Object val = modelElement.eGet(feature);

		CheckBox checkBox = new CheckBox();
		checkBox.setSelected((Boolean) val);

		getChildren().add(checkBox);
		
		getChildren().add(new ValidationMessage());
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
		public Control createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new CheckBoxControl(itemPropertyDescriptor, context);
		}
		
	}

}
