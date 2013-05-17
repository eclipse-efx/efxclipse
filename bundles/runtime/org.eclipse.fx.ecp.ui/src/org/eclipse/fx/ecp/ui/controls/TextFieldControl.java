package org.eclipse.fx.ecp.ui.controls;

import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.fx.ecp.ui.Control;

@SuppressWarnings("restriction")
public class TextFieldControl extends TextField implements Control {

	public TextFieldControl(final Property<Object> property, EStructuralFeature feature, ECPControlContext context) {

		final EDataTypeValueHandler valueHandler = new EDataTypeValueHandler((EDataType) feature.getEType());

		setText(valueHandler.toString(property.getValue()));

		property.addListener(new ChangeListener<Object>() {

			@Override
			public void changed(ObservableValue<? extends Object> arg0, Object arg1, Object arg2) {
				String text = valueHandler.toString(arg2);
				setText(text);
			}

		});

		textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				try {
					Object value = valueHandler.toValue(arg2);
					property.setValue(value);
				} catch (NumberFormatException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}

		});
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {

	}

	@Override
	public void resetValidation() {

	}

	public static class Factory implements Control.Factory {

		@Override
		public Control createControl(Property<?> property, EStructuralFeature feature, ECPControlContext context) {
			return new TextFieldControl((Property<Object>) property, feature, context);
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
