package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ChoiceBox;

import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;

public class AddEnumControl extends ChoiceBox<Enumerator> {
	
	final private SimpleObjectProperty<Object> objectProperty = new SimpleObjectProperty<>();
	public final static Object ILLEGAL_VALUE = new Object();

	public AddEnumControl(EStructuralFeature feature, ECPControlContext context) {
		
		EClassifier type = feature.getEType();

		EEnum eEnum = (EEnum) type;

		EList<EEnumLiteral> enumLiterals = eEnum.getELiterals();
		
		if (!feature.isRequired())
			getItems().add(null);

		for (EEnumLiteral literal : enumLiterals)
			getItems().add(literal.getInstance());
		
		getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

			@Override
			public void changed(ObservableValue<? extends Enumerator> arg0, Enumerator arg1, Enumerator arg2) {
				objectProperty.set(arg2);
			}
			
		});
		
	}
	
	public Property<?> objectValueProperty() {
		return objectProperty;
	}

}
