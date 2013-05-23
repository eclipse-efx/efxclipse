package org.eclipse.fx.ecp.ui.controls.multi;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.Diagnostician;
import org.eclipse.emf.ecore.util.EcoreUtil;

/**
 * A delegate for handling validation and conversion for data type values.
 */
class EDataTypeValueHandler {
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