package org.eclipse.fx.ecp.ui.controls;

import java.util.ArrayList;

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

public class EnumControl extends VBox implements Control {

	private ValidationMessage validationMessage;

	public EnumControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

		ChoiceBox<Enumerator> choiceBox = new ChoiceBox<>();

		EClassifier type = feature.getEType();

		EEnum eEnum = (EEnum) type;

		EList<EEnumLiteral> enumLiterals = eEnum.getELiterals();

		ArrayList<Enumerator> values = new ArrayList<Enumerator>();

		if (!feature.isRequired())
			values.add(null);

		for (EEnumLiteral literal : enumLiterals)
			values.add(literal.getInstance());

		choiceBox.getItems().addAll(values);

		SingleSelectionModel<Enumerator> selectionModel = choiceBox.getSelectionModel();

		Enumerator val = (Enumerator) modelElement.eGet(feature);

		selectionModel.select(val);

		getChildren().add(choiceBox);

		selectionModel.selectedItemProperty().addListener(new ChangeListener<Enumerator>() {

			@Override
			public void changed(ObservableValue<? extends Enumerator> observableValue, Enumerator oldValue, Enumerator newValue) {
				Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
				if (command.canExecute())
					editingDomain.getCommandStack().execute(command);
				
				if(newValue == null) {
					validationMessage.setMessage("A value must be selected");
				} else {
					validationMessage.setMessage(null);
				}
			}

		});

		validationMessage = new ValidationMessage();
		getChildren().add(validationMessage);
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
//		if (diagnostic.getSeverity() != Diagnostic.OK) {
//
//			validationMessage.setMessage(diagnostic.getMessage());
//			
////			validationLabel.setText(diagnostic.getMessage());
//
//			// Timeline timeline = new Timeline();
//			//
//			// timeline.getKeyFrames().addAll(
//			// new KeyFrame(Duration.ZERO, new
//			// KeyValue(rectangle.heightProperty(), 0, Interpolator.EASE_BOTH)),
//			// new KeyFrame(Duration.millis(300), new
//			// KeyValue(rectangle.heightProperty(), 50, Interpolator.EASE_BOTH))
//			// );
//			//
//			// timeline.play();
//
//			// ScaleTransition transition = ScaleTransitionBuilder.create()
//			// .node(validationLabel)
//			// .duration(Duration.seconds(2))
//			// .fromY(0)
//			// .toY(1)
//			// .build();
//			// transition.play();
//
//		} else {
//			resetValidation();
//		}
	}

	@Override
	public void resetValidation() {
//		validationLabel.setText(null);
		
	}

	public static class Factory implements Control.Factory {

		@Override
		public Control createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new EnumControl(itemPropertyDescriptor, context);
		}

	}

}
