package org.eclipse.fx.ecp.ui.controls;

import javafx.beans.property.Property;
import javafx.scene.control.CheckBox;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.emf.databinding.edit.EMFEditFXProperties;

public class CheckBoxControl extends ECPControlBase {

	protected Property<Boolean> property;
	protected CheckBox checkBox;

	public CheckBoxControl(IItemPropertyDescriptor propertyDescriptor, final EObject modelElement, final EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, editingDomain);

		setSkin(new Skin(this));

		getStyleClass().add("formControl");

		property = EMFEditFXProperties.value(editingDomain, modelElement, feature);
		checkBox.selectedProperty().bindBidirectional(property);
	}
	
	@Override
	protected void update() {
		// updates are handled by the property binding
	}

	@Override
	public void dispose() {
		checkBox.selectedProperty().unbindBidirectional(property);
		super.dispose();
	}

	class Skin extends SkinBase<CheckBoxControl> {
		
		Skin(CheckBoxControl control) {
			super(control);
			HBox hBox = new HBox();
			getChildren().add(hBox);

			checkBox = new CheckBox();
			hBox.getChildren().add(checkBox);
		}
		
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement, EditingDomain editingDomain) {
			return new CheckBoxControl(itemPropertyDescriptor, modelElement, editingDomain);
		}

	}

}
