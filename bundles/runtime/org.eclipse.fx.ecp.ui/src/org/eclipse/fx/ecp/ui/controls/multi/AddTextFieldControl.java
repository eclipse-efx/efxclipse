package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;

public class AddTextFieldControl extends TextField {
	
	final private SimpleObjectProperty<Object> objectProperty = new SimpleObjectProperty<>();
	public final static Object ILLEGAL_VALUE = new Object();

	public AddTextFieldControl(EStructuralFeature feature, ECPControlContext context) {
		
		final EDataTypeValueHandler valueHandler = new EDataTypeValueHandler((EDataType) feature.getEType());

		textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String oldText, String newText) {
				String message = valueHandler.isValid(newText);
				
				if(message == null) {
					Object value = valueHandler.toValue(newText);
					objectProperty.set(value);
				} else {
					objectProperty.set(ILLEGAL_VALUE);
				}
			}
			
		});
		
	}
	
	public Property<?> valueProperty() {
		return objectProperty;
	}

}
