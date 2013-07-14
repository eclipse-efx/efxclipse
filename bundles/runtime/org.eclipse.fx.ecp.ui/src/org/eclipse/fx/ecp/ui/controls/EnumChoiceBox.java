package org.eclipse.fx.ecp.ui.controls;

import java.util.ArrayList;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.common.util.Enumerator;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EEnumLiteral;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class EnumChoiceBox extends ECPControlBase {

	protected ChoiceBox<Enumerator> choiceBox;

	public EnumChoiceBox(IItemPropertyDescriptor propertyDescriptor, final EObject modelElement, final EditingDomain editingDomain) {
		super(propertyDescriptor, modelElement, editingDomain);

		setSkin(new Skin(this));

		final EClassifier type = feature.getEType();
		final EEnum eEnum = (EEnum) type;
		final EList<EEnumLiteral> enumLiterals = eEnum.getELiterals();
		final ArrayList<Enumerator> values = new ArrayList<Enumerator>();

		getStyleClass().add("enum-choice-box");

		if (feature.isUnsettable())
			values.add(null);

		for (EEnumLiteral literal : enumLiterals)
			values.add(literal.getInstance());

		choiceBox.getItems().addAll(values);

		// select the current value before adding the listeners
		update();

		choiceBox.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

			@Override
			public void changed(ObservableValue<? extends Enumerator> observableValue, Enumerator oldValue, Enumerator newValue) {
				final Object currentValue = modelElement.eGet(feature);

				// only execute the command if the value has changed
				if (newValue != currentValue) {
					final Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}
			}

		});

	}

	@Override
	public void update() {
		final Enumerator selectedItem = choiceBox.getSelectionModel().getSelectedItem();
		final Enumerator value = (Enumerator) modelElement.eGet(feature);

		// only update the selection if the value has changed
		if (selectedItem != value)
			choiceBox.getSelectionModel().select(value);
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("ECPControls.css").toExternalForm();
	}

	class Skin extends SkinBase<EnumChoiceBox> {

		Skin(EnumChoiceBox control) {
			super(control);
			
			HBox hBox = new HBox();
			getChildren().add(hBox);
			
			choiceBox = new ChoiceBox<>();
			hBox.getChildren().add(choiceBox);
			HBox.setHgrow(control, Priority.ALWAYS);
		}

	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement, EditingDomain editingDomain) {
			return new EnumChoiceBox(itemPropertyDescriptor, modelElement, editingDomain);
		}

	}

}
