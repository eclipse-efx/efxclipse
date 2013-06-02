package org.eclipse.fx.ecp.ui.controls.multi;

import java.util.Collection;

import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Label;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.emf.edit.ui.dnd.LocalTransfer;

public class ReferenceDropControl extends HBox {

	protected Command addCommand;
	final protected EditingDomain editingDomain;
	final protected EReference reference;
	final protected EObject modelElement;
	final protected Label label;

	public ReferenceDropControl(final EditingDomain editingDomain, final EReference feature, final EObject modelElement) {
		this.editingDomain = editingDomain;
		this.reference = feature;
		this.modelElement = modelElement;

		label = new Label("Drop Items here");
		getChildren().add(label);
		label.getStyleClass().add("reference-drop-label");
		
		StackPane cssNode = new StackPane();
        cssNode.getStyleClass().add("mark");
        label.setGraphic(new Group(cssNode));

		label.setOnDragOver(new EventHandler<DragEvent>() {

			@Override
			public void handle(DragEvent event) {
				Object object = LocalTransfer.INSTANCE.getObject();
				Command command = object instanceof Collection<?> ? AddCommand.create(editingDomain, modelElement, reference,
						(Collection<?>) object) : AddCommand.create(editingDomain, modelElement, reference, object);
				if (command.canExecute()) {
					addCommand = command;
					event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
				} else {
					addCommand = null;
				}
			}

		});

		label.setOnDragDropped(new EventHandler<DragEvent>() {

			@Override
			public void handle(DragEvent arg0) {
				if (addCommand != null)
					editingDomain.getCommandStack().execute(addCommand);
			}

		});

	}

}
