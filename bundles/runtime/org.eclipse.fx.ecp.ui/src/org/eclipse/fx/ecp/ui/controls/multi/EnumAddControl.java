package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class EnumAddControl extends HBox {

	final private ChoiceBox<Enumerator> choiceBox;
	final private Button addButton;
	final private EditingDomain editingDomain;
	final private EStructuralFeature feature;
	final private EObject modelElement;
	private Command addCommand;

	public EnumAddControl(final EditingDomain editingDomain, final EStructuralFeature feature, EObject modelElement) {
		this.editingDomain = editingDomain;
		this.feature = feature;
		this.modelElement = modelElement;

		EClassifier type = feature.getEType();

		EEnum eEnum = (EEnum) type;

		EList<EEnumLiteral> enumLiterals = eEnum.getELiterals();

		choiceBox = new ChoiceBox<Enumerator>();
		getChildren().add(choiceBox);
		choiceBox.getStyleClass().add("left-pill");
		HBox.setHgrow(choiceBox, Priority.ALWAYS);
		
		for (EEnumLiteral literal : enumLiterals)
			choiceBox.getItems().add(literal.getInstance());

		SingleSelectionModel<Enumerator> selectionModel = choiceBox.getSelectionModel();
		
		selectionModel.select(0);
		
		selectionModel.selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

			@Override
			public void changed(ObservableValue<? extends Enumerator> arg0, Enumerator arg1, Enumerator arg2) {
				updateAddButton();
			}

		});

		addButton = new MarkButton();
		getChildren().add(addButton);
		addButton.getStyleClass().addAll("right-pill", "add-enum-button");
		addButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				editingDomain.getCommandStack().execute(addCommand);
				choiceBox.requestFocus();
			}

		});

		modelElement.eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == feature)
					updateAddButton();
			}

		});

		updateAddButton();
	}

	private void updateAddButton() {
		Enumerator selectedItem = choiceBox.getSelectionModel().getSelectedItem();
		addCommand = AddCommand.create(editingDomain, modelElement, feature, selectedItem);
		addButton.setDisable(!addCommand.canExecute());
	}

}
