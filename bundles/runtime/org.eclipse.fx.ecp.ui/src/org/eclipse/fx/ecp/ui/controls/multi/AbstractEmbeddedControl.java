package org.eclipse.fx.ecp.ui.controls.multi;

import java.util.ArrayList;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPUtil;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public abstract class AbstractEmbeddedControl extends ECPControlBase {

	protected HBox hBox;
	protected Button downButton;
	protected Button upButton;
	protected Button removeButton;

	protected int index;
	protected EList<?> eList;

	protected Command moveUpCommand;
	protected Command moveDownCommand;
	protected CompoundCommand removeCommand;

	public AbstractEmbeddedControl(IItemPropertyDescriptor propertyDescriptor, EObject modelElement, EditingDomain editingDomain, int initialIndex) {
		super(propertyDescriptor, modelElement, editingDomain);

		index = initialIndex;
		eList = (EList<?>) modelElement.eGet(feature);

		getStyleClass().add("embedded-control");
	}

	public int getIndex() {
		return index;
	}

	public void setIndex(int index) {
		this.index = index;
		update();
	}

	protected void update() {
		if(index >= eList.size())
			return;
		
		if (upButton != null) {
			moveUpCommand = MoveCommand.create(editingDomain, modelElement, feature, eList.get(index), index - 1);
			upButton.setDisable(!moveUpCommand.canExecute());
		}

		if (downButton != null) {
			moveDownCommand = MoveCommand.create(editingDomain, modelElement, feature, eList.get(index), index + 1);
			downButton.setDisable(!moveDownCommand.canExecute());
		}
		
		List<?> itemToBeRemoved = new ArrayList<>(eList);
		List<?> itemToBeReAdded = new ArrayList<>(eList);
		itemToBeReAdded.remove(index);

		List<Command> commands = new ArrayList<>();
		commands.add(new RemoveCommand(editingDomain, eList, itemToBeRemoved));
		commands.add(new AddCommand(editingDomain, eList, itemToBeReAdded));

		removeCommand = new CompoundCommand(commands);
		
		removeButton.setDisable(!removeCommand.canExecute());
	}

	protected class EmbeddedControlSkin extends SkinBase<AbstractEmbeddedControl> {


		protected EmbeddedControlSkin(AbstractEmbeddedControl control) {
			super(control);

			hBox = new HBox();
			getChildren().add(hBox);

			hBox.setFillHeight(true);

			if (feature.isOrdered()) {

				upButton = new Button();
				hBox.getChildren().add(upButton);
				upButton.getStyleClass().addAll("up-button");
				upButton.setMaxHeight(Double.MAX_VALUE);
				ECPUtil.addMark(upButton, "up-arrow");

				upButton.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						editingDomain.getCommandStack().execute(moveUpCommand);
						requestFocus();
					}

				});

				downButton = new Button();
				hBox.getChildren().add(downButton);
				downButton.getStyleClass().addAll("down-button", "center-pill");
				ECPUtil.addMark(downButton, "down-arrow");

				downButton.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						editingDomain.getCommandStack().execute(moveDownCommand);
						// un-focus the button
						requestFocus();
					}

				});

			}

			removeButton = new Button();
			hBox.getChildren().add(removeButton);
			removeButton.getStyleClass().addAll("remove-button", "right-pill");
			ECPUtil.addMark(removeButton, "cross");

			removeButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					editingDomain.getCommandStack().execute(removeCommand);
				}

			});

			if (upButton != null)
				upButton.setDisable(index < 1);

			if (downButton != null)
				downButton.setDisable(index > eList.size() - 2);
		}

	}

}