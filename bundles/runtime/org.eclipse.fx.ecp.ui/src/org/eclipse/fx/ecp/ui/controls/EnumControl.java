package org.eclipse.fx.ecp.ui.controls;

import java.util.ArrayList;
import java.util.Collection;

import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SingleSelectionModel;
import javafx.scene.layout.VBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;

@SuppressWarnings("restriction")
public class EnumControl extends ChoiceBox<Enumerator> implements Control {

	public EnumControl(final Property<Enumerator> property, Collection<Enumerator> values, ECPControlContext context) {

		getItems().addAll(values);

		SingleSelectionModel<Enumerator> selectionModel = getSelectionModel();

		selectionModel.select(property.getValue());

		selectionModel.selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

			@Override
			public void changed(ObservableValue<? extends Enumerator> observableValue, Enumerator oldValue, Enumerator newValue) {
				property.setValue(newValue);
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
			EClassifier type = feature.getEType();
			EEnum eEnum = (EEnum) type;
			EList<EEnumLiteral> enumLiterals = eEnum.getELiterals();
			ArrayList<Enumerator> values = new ArrayList<Enumerator>();

			if (!feature.isRequired())
				values.add(null);

			for (EEnumLiteral literal : enumLiterals)
				values.add(literal.getInstance());

			return new EnumControl((Property<Enumerator>) property, values, context);
		}

	}

}
