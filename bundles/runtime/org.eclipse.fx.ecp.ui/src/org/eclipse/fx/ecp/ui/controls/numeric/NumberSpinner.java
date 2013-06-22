package org.eclipse.fx.ecp.ui.controls.numeric;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.IndexRange;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPUtil;
import org.eclipse.fx.ecp.ui.controls.AutoSelector;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public abstract class NumberSpinner extends ECPControlBase implements ECPControl {

	private Button decreaseButton;
	private TextField textField;
	private Button increaseButton;

	abstract class NumberSpinnerSkin<C extends Control, T extends Number> extends SkinBase<C> {

		@SuppressWarnings("unchecked")
		NumberSpinnerSkin(C control) {
			super(control);

			HBox hBox = new HBox();
			getChildren().add(hBox);
			hBox.setFillHeight(true);

			decreaseButton = new Button();
			hBox.getChildren().add(decreaseButton);
			decreaseButton.getStyleClass().add("decrease-button");
			decreaseButton.getStyleClass().add("left-pill");
			ECPUtil.addMark(decreaseButton, "minus");
			decreaseButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					T value = (T) modelElement.eGet(feature);
					Command command = SetCommand.create(editingDomain, modelElement, feature, decrease(value));
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			textField = new TextField() {

				@Override
				public void replaceText(int start, int end, String text) {
					String currentText = getText();
					StringBuffer sb = new StringBuffer(currentText);
					sb.replace(start, end, text);
					String tmp = sb.toString();

					if (validate(tmp))
						super.replaceText(start, end, text);
				}

				@Override
				public void replaceSelection(String text) {
					IndexRange selection = getSelection();
					int start = selection.getStart();
					int end = selection.getEnd();
					StringBuffer sb = new StringBuffer(getText());
					sb.replace(start, end, text);
					String tmp = sb.toString();

					if (validate(tmp))
						super.replaceSelection(text);
				}

			};
			hBox.getChildren().add(textField);
			textField.getStyleClass().add("center-pill");
			textField.focusedProperty().addListener(new AutoSelector(textField));
			textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

				@Override
				public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
					if (!newFocused) {
						T oldValue = (T) modelElement.eGet(feature);
						T newValue = parseValue(textField.getText());

						// only commit if the value has changed
						if (oldValue != newValue) {
							Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
							if (command.canExecute())
								editingDomain.getCommandStack().execute(command);
						}
					}
				}

			});

			increaseButton = new Button();
			hBox.getChildren().add(increaseButton);
			increaseButton.getStyleClass().add("increase-button");
			increaseButton.getStyleClass().add("right-pill");
			ECPUtil.addMark(increaseButton, "plus");
			increaseButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					T value = (T) modelElement.eGet(feature);
					Command command = SetCommand.create(editingDomain, modelElement, feature, increase(value));
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			update();
		}

		abstract T decrease(T value);

		abstract T increase(T value);

		abstract T parseValue(String literal);

		abstract boolean validate(String literal);

	}

	public NumberSpinner(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);
		getStyleClass().add("spinner");
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("../ECPControls.css").toExternalForm();
	}

	@Override
	protected void update() {
		Object value = modelElement.eGet(feature);
		textField.setText(value != null ? value.toString() : "0");
	}

	@Override
	public void dispose() {
		modelElement.eAdapters().remove(modelElementAdapter);
	}

}
