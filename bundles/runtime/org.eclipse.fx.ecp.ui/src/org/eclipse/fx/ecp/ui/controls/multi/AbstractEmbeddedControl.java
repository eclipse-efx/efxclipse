package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public abstract class AbstractEmbeddedControl extends Control {

	protected Button upButton;
	protected Button downButton;
	protected int index;
	protected HBox hBox;
	protected EStructuralFeature feature;
	protected EList<?> eList;
	protected EditingDomain editingDomain;

	public AbstractEmbeddedControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context, int initialIndex) {
		index = initialIndex;
		final EObject modelElement = context.getModelElement();
		editingDomain = context.getEditingDomain();
		feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		eList = (EList<?>) modelElement.eGet(feature);

		hBox = new HBox();
		getChildren().add(hBox);

		hBox.setFillHeight(true);

		if (feature.isOrdered()) {

			upButton = new Button();
			hBox.getChildren().add(upButton);
			upButton.getStyleClass().addAll("moveUpButton", "center-pill");
			upButton.setOnAction(new EventHandler<ActionEvent>() {


				@Override
				public void handle(ActionEvent arg0) {
					Command command = MoveCommand.create(editingDomain, modelElement, feature, eList.get(index), index - 1);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

			downButton = new Button();
			downButton.getStyleClass().addAll("moveDownButton", "center-pill");
			hBox.getChildren().add(downButton);
			downButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					Command command = MoveCommand.create(editingDomain, modelElement, feature, eList.get(index), index + 1);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});

		}

		final Button deleteButton = new Button();
		getChildren().add(deleteButton);
		deleteButton.getStyleClass().addAll("deleteButton", "right-pill");
		deleteButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Command command = RemoveCommand.create(editingDomain, modelElement, feature, eList.get(index));
				if (command.canExecute())
					editingDomain.getCommandStack().execute(command);
			}

		});

		updateButtons();
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
		update();
	}

	public void updateButtons() {
		if (upButton != null)
			upButton.setDisable(index < 1);

		if (downButton != null)
			downButton.setDisable(index > eList.size() - 2);
	}

	protected abstract void update();

}