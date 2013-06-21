package org.eclipse.fx.ecp.ui.controls;

import java.util.ArrayList;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.Node;
import javafx.scene.control.ChoiceBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
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
import org.eclipse.fx.ecp.ui.ECPControl;

public class EnumChoiceBox extends ChoiceBox<Enumerator> implements ECPControl {

	protected final EObject modelElement;
	protected final EStructuralFeature feature;
	protected final AdapterImpl modelElementAdapter;

	public EnumChoiceBox(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		modelElement = context.getModelElement();
		feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

		final EditingDomain editingDomain = context.getEditingDomain();
		final EClassifier type = feature.getEType();
		final EEnum eEnum = (EEnum) type;
		final EList<EEnumLiteral> enumLiterals = eEnum.getELiterals();
		final ArrayList<Enumerator> values = new ArrayList<Enumerator>();

		getStyleClass().add("enum-choice-box");

		if (feature.isUnsettable())
			values.add(null);

		for (EEnumLiteral literal : enumLiterals)
			values.add(literal.getInstance());

		getItems().addAll(values);

		getChildren();

		// select the current value before adding the listeners
		update();

		getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

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

		modelElementAdapter = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == feature)
					update();
			}

		};

		modelElement.eAdapters().add(modelElementAdapter);
	}

	public void update() {
		final Enumerator selectedItem = getSelectionModel().getSelectedItem();
		final Enumerator value = (Enumerator) modelElement.eGet(feature);

		// only update the selection if the value has changed
		if (selectedItem != value)
			getSelectionModel().select(value);
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("ECPControls.css").toExternalForm();
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public Node createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new EnumChoiceBox(itemPropertyDescriptor, context);
		}

	}

	@Override
	public void dispose() {
		modelElement.eAdapters().remove(modelElementAdapter);
	}

}
