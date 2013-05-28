package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.StackPane;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class TextFieldAddControl extends HBox {
	
	final private TextField addTextField;
	private Button addButton;
	private Command addCommand;
	final private EditingDomain editingDomain;
	final private EStructuralFeature feature;
	final private EObject modelElement;
	final private EDataTypeValueHandler valueHandler;

	public TextFieldAddControl(final EditingDomain editingDomain, final EStructuralFeature feature, EObject modelElement) {
		this.editingDomain = editingDomain;
		this.feature = feature;
		this.modelElement = modelElement;
		valueHandler = new EDataTypeValueHandler((EDataType) feature.getEType());

		addTextField = new TextField();
		getChildren().add(addTextField);
		addTextField.setPromptText("Enter a value");
		addTextField.getStyleClass().add("left-pill");
		HBox.setHgrow(addTextField, Priority.ALWAYS);

		addTextField.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				updateAddButton();
			}

		});

		addButton = new Button();
		getChildren().add(addButton);
		addButton.setMaxHeight(Double.MAX_VALUE);
		addButton.getStyleClass().addAll("right-pill", "text-field-add-button");
		
		StackPane addMark = new StackPane();
        addMark.getStyleClass().add("mark");
        addButton.setGraphic(new Group(addMark));
        
		addButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if (addCommand != null && addCommand.canExecute()) {
					editingDomain.getCommandStack().execute(addCommand);
					addTextField.setText(null);
					addTextField.requestFocus();
				}
			}

		});
		
		modelElement.eAdapters().add(new AdapterImpl() {
			
			@Override
			public void notifyChanged(Notification msg) {
				if(msg.getFeature() == feature)
					updateAddButton();
			}
			
		});
		
		updateAddButton();
	}
	
	private void updateAddButton() {
		String text = addTextField.textProperty().getValue();
		String message = valueHandler.isValid(text);

		if (message == null) {
			Object value = valueHandler.toValue(text);
			addCommand = AddCommand.create(editingDomain, modelElement, feature, value);
		} else {
			addCommand = null;
		}
		
		addButton.setDisable(addCommand == null || !addCommand.canExecute());
	}

}
