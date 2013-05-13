package org.eclipse.fx.ecp.ui.controls;

import javafx.scene.control.CheckBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.Control;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

@SuppressWarnings("restriction")
public class CheckBoxControl extends HBox implements Control {

	public CheckBoxControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		getStyleClass().add("formControl");
		
		EObject modelElement = context.getModelElement();

		String displayName = propertyDescriptor.getDisplayName(modelElement);
		Label label = new Label(displayName);
		label.getStyleClass().add(IControlConstants.CONTROL_LABEL_CLASS);
		getChildren().add(label);

		EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		Object val = modelElement.eGet(feature);

		CheckBox checkBox = new CheckBox();
		checkBox.setSelected((Boolean) val);

		getChildren().add(checkBox);
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
