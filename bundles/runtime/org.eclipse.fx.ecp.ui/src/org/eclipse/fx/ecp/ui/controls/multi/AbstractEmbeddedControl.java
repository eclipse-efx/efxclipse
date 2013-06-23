package org.eclipse.fx.ecp.ui.controls.multi;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
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
import org.eclipse.fx.ecp.ui.ECPUtil;

public abstract class AbstractEmbeddedControl extends HBox implements EmbeddedControl {

	protected Button upButton;
	protected Button downButton;
	protected int index;
	protected EStructuralFeature feature;
	protected EList<?> eList;
	protected EditingDomain editingDomain;
	protected EObject modelElement;

	public AbstractEmbeddedControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context, int initialIndex) {
		
		getStyleClass().add("embedded-control");
		
		index = initialIndex;
		modelElement = context.getModelElement();
		editingDomain = context.getEditingDomain();
		feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		eList = (EList<?>) modelElement.eGet(feature);

		setFillHeight(true);

		if (feature.isOrdered()) {

			upButton = new Button();
			getChildren().add(upButton);
			upButton.getStyleClass().addAll("up-button");
			upButton.setMaxHeight(Double.MAX_VALUE);
			ECPUtil.addMark(upButton, "up-arrow");
			
			upButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					Command command = MoveCommand.create(editingDomain, modelElement, feature, eList.get(index), index - 1);
					if (command.canExecute()) {
						editingDomain.getCommandStack().execute(command);
						requestFocus();
					}
				}

			});

			downButton = new Button();
			getChildren().add(downButton);
			downButton.getStyleClass().addAll("down-button", "center-pill");
			ECPUtil.addMark(downButton, "down-arrow");
			
			downButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					Command command = MoveCommand.create(editingDomain, modelElement, feature, eList.get(index), index + 1);
					if (command.canExecute()) {
						editingDomain.getCommandStack().execute(command);
						// un-focus the button
						requestFocus();
					}
				}

			});

		}

		final Button deleteButton = new Button();
		getChildren().add(deleteButton);
		deleteButton.getStyleClass().addAll("remove-button", "right-pill");
		ECPUtil.addMark(deleteButton, "cross");
		
		deleteButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Command command = RemoveCommand.create(editingDomain, modelElement, feature, eList.get(index));
				if (command.canExecute())
					editingDomain.getCommandStack().execute(command);
			}

		});

		if (upButton != null)
			upButton.setDisable(index < 1);
		
		if (downButton != null)
			downButton.setDisable(index > eList.size() - 2);
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
		update();
	}

	protected void update() {
		if (upButton != null)
			upButton.setDisable(index < 1);
		
		if (downButton != null)
			downButton.setDisable(index > eList.size() - 2);
	}

}