package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.SkinBase;
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
import org.eclipse.fx.ecp.ui.controls.AutoSelector;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class TextFieldAddControl extends ECPControlBase {

	protected EDataTypeTextField textField;
	protected Button button;
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
			textField.selectAll();
			textField.requestFocus();
		}
	}

	@Override
	protected void update() {
		String text = textField.textProperty().getValue();
		String message = valueHandler.isValid(text);

		ObservableList<String> styleClass = textField.getStyleClass();

		if (message == null) {
			Object value = valueHandler.toValue(text);
			addCommand = AddCommand.create(editingDomain, modelElement, feature, value);
			styleClass.remove("error");
		} else {
			addCommand = null;
			if (!styleClass.contains("error"))
				styleClass.add("error");
		}

		button.setDisable(addCommand == null || !addCommand.canExecute());
	}

	protected class Skin extends SkinBase<TextFieldAddControl> {
		
		protected Skin(TextFieldAddControl control) {
			super(control);
			
			HBox hBox = new HBox();
			getChildren().add(hBox);

			textField = new EDataTypeTextField((EDataType) feature.getEType());
			hBox.getChildren().add(textField);
			textField.getStyleClass().add("left-pill");
			
			textField.focusedProperty().addListener(new AutoSelector(textField));
			
			textField.setText(feature.getDefaultValueLiteral());

			HBox.setHgrow(textField, Priority.ALWAYS);

			textField.textProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
					update();
				}

			});

			textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

				@Override
				public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
					if (arg2) {
						textField.requestFocus();
						textField.selectAll();
					}
				}

			});

			button = new Button();
			hBox.getChildren().add(button);
			button.setMaxHeight(Double.MAX_VALUE);
			button.getStyleClass().addAll("right-pill", "text-field-add-button");
			ECPUtil.addMark(button, "plus");

			button.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					doAdd();
				}

			});

			textField.setOnKeyPressed(new EventHandler<KeyEvent>() {
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
