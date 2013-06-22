package org.eclipse.fx.ecp.ui.controls;

import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextField;
import javafx.scene.layout.VBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class TextFieldControl extends ECPControlBase {

	protected TextField textField;
	protected EDataTypeValueHandler valueHandler;

	public TextFieldControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);
		
		setSkin(new Skin(this));
		
		valueHandler = new EDataTypeValueHandler((EDataType) feature.getEType());

		textField.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> observableValue, String oldText, String newText) {
				final String message = valueHandler.isValid(newText);
				ObservableList<String> styleClass = textField.getStyleClass();
				if (message == null) {
					styleClass.remove("invalid");
				} else {
					if (!styleClass.contains("invalid"))
						styleClass.add("invalid");
				}
			}

		});

		textField.focusedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldFocused, Boolean newFocused) {
				if (!newFocused) {
					Object oldValue = modelElement.eGet(feature);
					String text = textField.getText();
					String message = valueHandler.isValid(text);

					if (message == null) {
						Object newValue = valueHandler.toValue(text);

						// only commit if the value has changed
						if (!Objects.equals(oldValue, newValue)) {
							Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
							if (command.canExecute())
								editingDomain.getCommandStack().execute(command);
						}
					} else {
						System.err.println(message);
					}
				}
			}

		});

		update();
	}

	@Override
	protected void update() {
		Object value = modelElement.eGet(feature);
		textField.setText(valueHandler.toString(value));
	}

	class Skin extends SkinBase<TextFieldControl> {
		
		Skin(TextFieldControl control) {
			super(control);
			
			VBox vBox = new VBox();
			getChildren().add(vBox);
			
			textField = new TextField();
			vBox.getChildren().add(textField);
		}
		
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new TextFieldControl(itemPropertyDescriptor, context);
		}

	}

	/**
	 * A delegate for handling validation and conversion for data type values.
	 */
	protected static class EDataTypeValueHandler {
		protected EDataType eDataType;

		public EDataTypeValueHandler(EDataType eDataType) {
			this.eDataType = eDataType;
		}

		public String isValid(Object object) {
			Object value;
			try {
				value = eDataType.getEPackage().getEFactoryInstance().createFromString(eDataType, (String) object);
			} catch (Exception exception) {
				String message = exception.getClass().getName();
				int index = message.lastIndexOf('.');
				if (index >= 0) {
					message = message.substring(index + 1);
				}
				if (exception.getLocalizedMessage() != null) {
					message = message + ": " + exception.getLocalizedMessage();
				}
				return message;
			}
			Diagnostic diagnostic = Diagnostician.INSTANCE.validate(eDataType, value);
			if (diagnostic.getSeverity() == Diagnostic.OK) {
				return null;
			} else {
				return (diagnostic.getChildren().get(0)).getMessage().replaceAll("'", "''").replaceAll("\\{", "'{'"); // }}
			}
		}

		public String isValid(String text) {
			return isValid((Object) text);
		}

		public Object toValue(String string) {
			return EcoreUtil.createFromString(eDataType, string);
		}

		public String toString(Object value) {
			String result = EcoreUtil.convertToString(eDataType, value);
			return result == null ? "" : result;
		}

	}

}
