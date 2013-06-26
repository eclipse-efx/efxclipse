package org.eclipse.fx.ecp.ui.controls.multi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.command.CompoundCommand;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPUtil;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public abstract class AbstractEmbeddedControl extends ECPControlBase {

	protected HBox hBox;
	protected Button upButton;
	protected Button downButton;
	protected int index;
	protected EList<?> eList;

	public AbstractEmbeddedControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context, int initialIndex) {
		super(propertyDescriptor, context);

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
		if (upButton != null)
			upButton.setDisable(index < 1);

		if (downButton != null)
			downButton.setDisable(index > eList.size() - 2);
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
						Command command = MoveCommand.create(editingDomain, modelElement, feature, eList.get(index), index - 1);
						if (command.canExecute()) {
							editingDomain.getCommandStack().execute(command);
							requestFocus();
						}
					}

				});

				downButton = new Button();
				hBox.getChildren().add(downButton);
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
			hBox.getChildren().add(deleteButton);
			deleteButton.getStyleClass().addAll("remove-button", "right-pill");
			ECPUtil.addMark(deleteButton, "cross");

			deleteButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
//					Command command = RemoveCommand.create(editingDomain, modelElement, feature, eList.get(index));
					
					List<?> itemToBeRemoved = new ArrayList<>(eList);
					List<?> itemToBeReAdded = new ArrayList<>(eList);
					itemToBeReAdded.remove(index);
					
					List<Command> commands = new ArrayList<>();
					commands.add(new RemoveCommand(editingDomain, eList, itemToBeRemoved));
					commands.add(new AddCommand(editingDomain, eList, itemToBeReAdded));
					
					CompoundCommand compoundCommand = new CompoundCommand(commands);
					
					if (compoundCommand.canExecute())
						editingDomain.getCommandStack().execute(compoundCommand);
				}

			});

			if (upButton != null)
				upButton.setDisable(index < 1);

			if (downButton != null)
				downButton.setDisable(index > eList.size() - 2);
		}

	}

}