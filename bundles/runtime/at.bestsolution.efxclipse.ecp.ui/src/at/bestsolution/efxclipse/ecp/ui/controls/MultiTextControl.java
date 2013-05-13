package at.bestsolution.efxclipse.ecp.ui.controls;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.FXCollections;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.ListView;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class MultiTextControl extends HBox {

	public MultiTextControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		getStyleClass().add("multiTextControl");
		
		String displayName = propertyDescriptor.getDisplayName(modelElement);
		Label label = new Label(displayName);
		label.getStyleClass().add(IControlConstants.CONTROL_LABEL_CLASS);
		getChildren().add(label);

		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		
		

		ListView<String> listView = new ListView<>();
		
		List<String> values = (List<String>) modelElement.eGet(feature);
		
		listView.setItems(FXCollections.observableList(values));
		
		getChildren().add(listView);
		
		listView.setDisable(true);
		
		HBox.setHgrow(listView, Priority.ALWAYS);
	}

}
