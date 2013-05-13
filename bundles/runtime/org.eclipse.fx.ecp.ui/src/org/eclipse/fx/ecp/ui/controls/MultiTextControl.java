package org.eclipse.fx.ecp.ui.controls;

import java.util.List;

import javafx.collections.FXCollections;
import javafx.scene.control.ListView;
import javafx.scene.layout.VBox;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;

@SuppressWarnings("restriction")
public class MultiTextControl extends VBox implements Control {

	private ValidationMessage validationMessage = null;

	public MultiTextControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		getStyleClass().add("multiTextControl");

		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

		ListView<Object> listView = new ListView<>();

		List<Object> values = (List<Object>) modelElement.eGet(feature);

		listView.setItems(FXCollections.observableList(values));

		getChildren().add(listView);

		listView.setDisable(true);

		validationMessage = new ValidationMessage();
		getChildren().add(validationMessage);
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			validationMessage.setMessage(diagnostic.getMessage());
		} else {
			resetValidation();
		}
	}

	@Override
	public void resetValidation() {
		validationMessage.setMessage(null);
	}

	public static class Factory implements Control.Factory {

		@Override
		public Control createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new MultiTextControl(itemPropertyDescriptor, context);
		}

	}

}
