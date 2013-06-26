package org.eclipse.fx.ecp.ui.controls.multi;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.IndexRange;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.controls.AutoSelector;

public class EmbeddedNumberFieldControl extends AbstractEmbeddedControl {

	protected TextField textField;
	protected Class<?> instanceClass;

	public EmbeddedNumberFieldControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context, int initialIndex) {
		super(propertyDescriptor, context, initialIndex);
		instanceClass = feature.getEType().getInstanceClass();
		setSkin(new Skin(this));
		update();
	}

	@Override
	protected void update() {
		super.update();

		// only update if index inside bounds
		if (eList.size() > index) {
			Object value = eList.get(index);
			textField.setText(value.toString());
		}
	}

	protected class Skin extends EmbeddedControlSkin {

		protected Skin(EmbeddedNumberFieldControl control) {
			super(control);

			upButton.getStyleClass().add("center-pill");

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

			hBox.getChildren().add(0, textField);
			textField.getStyleClass().add("left-pill");
			HBox.setHgrow(textField, Priority.ALWAYS);

			textField.textProperty().addListener(new ChangeListener<String>() {

				@Override
				public void changed(ObservableValue<? extends String> observableValue, String oldText, String newText) {

				}

			});

			textField.focusedProperty().addListener(new AutoSelector(textField));

			textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

				@Override
				public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
					if (!newFocused) {
						Number oldValue = (Number) eList.get(index);
						String text = textField.getText();
						Number newValue = parse(text);

						// only commit if the value has changed
						if (!Objects.equals(oldValue, newValue)) {
							Command command = SetCommand.create(editingDomain, modelElement, feature, newValue, index);
							if (command.canExecute())
								editingDomain.getCommandStack().execute(command);
						}
					}
				}

			});
		}

	}

	protected boolean validate(String text) {
		if (text.matches("^\\-?[0-9]+\\.?[0-9]*$")) {
			try {
				parse(text);
				return true;
			} catch (NumberFormatException e) {
				// do nothing
			}
		}
		return false;
	}

	protected Number parse(String text) {
		if (instanceClass == BigDecimal.class) {
			return new BigDecimal(text);
		} else if (instanceClass == BigInteger.class) {
			return new BigInteger(text);
		} else if (instanceClass == byte.class || instanceClass == Byte.class) {
			return Byte.parseByte(text);
		} else if (instanceClass == double.class || instanceClass == Double.class) {
			return Double.parseDouble(text);
		} else if (instanceClass == float.class || instanceClass == Float.class) {
			return Float.parseFloat(text);
		} else if (instanceClass == int.class || instanceClass == Integer.class) {
			return Integer.parseInt(text);
		} else if (instanceClass == long.class || instanceClass == Long.class) {
			return Long.parseLong(text);
		} else if (instanceClass == short.class || instanceClass == Short.class) {
			return Short.parseShort(text);
		} else {
			throw new IllegalStateException("Unsupported instance class: " + instanceClass);
		}
	}

}
