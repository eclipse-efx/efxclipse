package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPUtil;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class TextFieldAddControl extends ECPControlBase {

	protected TextField addTextField;
	protected Button addButton;
	protected Command addCommand;
	protected EDataTypeValueHandler valueHandler = new EDataTypeValueHandler((EDataType) feature.getEType());

	public TextFieldAddControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);

		setSkin(new Skin(this));

		update();
	}

	protected void doAdd() {
		if (addCommand != null && addCommand.canExecute()) {
			editingDomain.getCommandStack().execute(addCommand);
			addTextField.selectAll();
			addTextField.requestFocus();
		}
	}

	@Override
	protected void update() {
		String text = addTextField.textProperty().getValue();
		String message = valueHandler.isValid(text);

		ObservableList<String> styleClass = addTextField.getStyleClass();

		if (message == null) {
			Object value = valueHandler.toValue(text);
			addCommand = AddCommand.create(editingDomain, modelElement, feature, value);
			styleClass.remove("error");
		} else {
			addCommand = null;
			if (!styleClass.contains("error"))
				styleClass.add("error");
		}

		addButton.setDisable(addCommand == null || !addCommand.canExecute());
	}

	protected class Skin extends SkinBase<TextFieldAddControl> {
		
		protected Skin(TextFieldAddControl control) {
			super(control);
			
			HBox hBox = new HBox();
			getChildren().add(hBox);

			addTextField = new TextField();
			hBox.getChildren().add(addTextField);
			addTextField.setText(feature.getDefaultValueLiteral());
			addTextField.getStyleClass().add("left-pill");
			HBox.setHgrow(addTextField, Priority.ALWAYS);

			addTextField.textProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					update();
				}

			});

			addTextField.focusedProperty().addListener(new ChangeListener<Boolean>() {

				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					if (arg2) {
						addTextField.requestFocus();
						addTextField.selectAll();
					}
				}

			});

			addButton = new Button();
			hBox.getChildren().add(addButton);
			addButton.setMaxHeight(Double.MAX_VALUE);
			addButton.getStyleClass().addAll("right-pill", "text-field-add-button");
			ECPUtil.addMark(addButton, "plus");

			addButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					doAdd();
				}

			});

			addTextField.setOnKeyPressed(new EventHandler<KeyEvent>() {
				public void handle(final KeyEvent keyEvent) {
					if (keyEvent.getCode() == KeyCode.ENTER) {
						doAdd();
						keyEvent.consume();
					}
				}
			});
		}
		
	}

}
