package org.eclipse.fx.ecp.ui.controls;

import javafx.beans.property.Property;
import javafx.scene.Node;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.VBox;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.emf.databinding.edit.EMFEditFXProperties;

public class CheckBoxControl extends VBox implements ECPControl {

	protected final Property<Boolean> property;
	protected final CheckBox checkBox;

	public CheckBoxControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		getStyleClass().add("formControl");

		EObject modelElement = context.getModelElement();

		EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

		checkBox = new CheckBox();
		getChildren().add(checkBox);

		property = EMFEditFXProperties.value(context.getEditingDomain(), modelElement, feature);
		checkBox.selectedProperty().bindBidirectional(property);
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		// TODO Auto-generated method stub
	}

	@Override
	public void resetValidation() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public void dispose() {
		checkBox.selectedProperty().unbindBidirectional(property);		
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public Node createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new CheckBoxControl(itemPropertyDescriptor, context);
		}

	}

}
