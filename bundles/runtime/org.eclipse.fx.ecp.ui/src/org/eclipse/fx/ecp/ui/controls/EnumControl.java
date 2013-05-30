package org.eclipse.fx.ecp.ui.controls;

import java.util.ArrayList;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
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
import org.eclipse.fx.ecp.ui.Control;

public class EnumControl extends ChoiceBox<Enumerator> implements Control {

	protected final EObject modelElement;
	protected final EStructuralFeature feature;
	protected final AdapterImpl modelElementAdapter;

	public EnumControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
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


		getSelectionModel().selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

			@Override
			public void changed(ObservableValue<? extends Enumerator> observableValue, Enumerator oldValue, Enumerator newValue) {
				Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
				if (command.canExecute())
					editingDomain.getCommandStack().execute(command);
			}

		});
		
		modelElementAdapter = new AdapterImpl() {
			
			@Override
			public void notifyChanged(Notification msg) {
				if(msg.getFeature() == feature)
					update();
			}
			
		};
		
		modelElement.eAdapters().add(modelElementAdapter);

		update();
	}

	public void update() {
		Enumerator value = (Enumerator) modelElement.eGet(feature);
		getSelectionModel().select(value);
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
	}

	@Override
	public void resetValidation() {

	}

	public static class Factory implements Control.Factory {

		@Override
		public Control createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new EnumControl(itemPropertyDescriptor, context);
		}

	}

	@Override
	public void dispose() {
		modelElement.eAdapters().remove(modelElementAdapter);		
	}

}
