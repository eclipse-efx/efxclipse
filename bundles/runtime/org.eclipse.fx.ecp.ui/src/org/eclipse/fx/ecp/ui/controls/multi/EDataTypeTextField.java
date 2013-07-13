package org.eclipse.fx.ecp.ui.controls.multi;

import java.math.BigInteger;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

import javafx.scene.control.IndexRange;
import javafx.scene.control.TextField;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.util.EcoreUtil;

public class EDataTypeTextField extends TextField {

	final static Set<Class<?>> INTEGRAL_TYPES = new HashSet<>();

	static {
		Collections.addAll(INTEGRAL_TYPES, Integer.class, int.class, Short.class, short.class, Long.class, long.class, BigInteger.class);
	}

	final EDataType dataType;
	final String regex;

	public EDataTypeTextField(EDataType dataType) {
		this.dataType = dataType;
		Class<?> instanceClass = dataType.getInstanceClass();

		if (instanceClass == String.class || instanceClass == Boolean.class || instanceClass == boolean.class) {
			regex = ".*";
		} else if (instanceClass == Character.class || instanceClass == char.class) {
			regex = "^.?$";
		} else if (INTEGRAL_TYPES.contains(instanceClass)) {
			regex = "^\\-?[0-9]*$";
		} else {
			regex = "^\\-?[0-9]+\\.?[0-9]*$";
		}
	}

	@Override
	public void replaceText(int start, int end, String text) {
		String currentText = getText();
		StringBuffer sb = new StringBuffer(currentText != null ? currentText : "");
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

	private boolean validate(String tmp) {
		return tmp.matches(regex);
	}

	public Object getValue() {
		return EcoreUtil.createFromString(dataType, getText());
	}

	public void setValue(Object value) {
		String result = EcoreUtil.convertToString(dataType, value);
		setText(result == null ? "" : result);
	}

}