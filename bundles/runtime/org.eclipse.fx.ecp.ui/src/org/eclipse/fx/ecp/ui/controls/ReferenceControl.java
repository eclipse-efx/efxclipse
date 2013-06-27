package org.eclipse.fx.ecp.ui.controls;

import java.util.Collection;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
import javafx.scene.control.Tooltip;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.BorderPane;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPUtil;
import org.eclipse.fx.emf.edit.ui.dnd.LocalTransfer;

public class ReferenceControl extends ECPControlBase {

	protected final EReference reference;
	protected final AdapterImpl valueAdapter;

	protected BorderPane borderPane;
	protected Hyperlink hyperlink;
	protected Button unsetButton;
	protected Command setCommand;
	protected Command unsetCommand;
	protected Label label;

	public ReferenceControl(IItemPropertyDescriptor propertyDescriptor, final ECPControlContext context) {
		super(propertyDescriptor, context);
		reference = (EReference) feature;

		setSkin(new Skin(this));

		hyperlink.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Object value = modelElement.eGet(reference);
				if (value instanceof EObject)
					context.openInNewContext((EObject) value);
			}

		});

		EventHandler<DragEvent> dragEventHandler = new EventHandler<DragEvent>() {

			@Override
			public void handle(DragEvent event) {
				Object object = LocalTransfer.INSTANCE.getObject();

				if (object instanceof Collection<?>) {
					Collection<?> collection = (Collection<?>) object;
					object = collection.size() == 1 ? collection.iterator().next() : null;
				}

				Command command = SetCommand.create(editingDomain, modelElement, reference, object);
				if (command.canExecute()) {
					setCommand = command;
					event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
				} else {
					setCommand = null;
				}
			}

		};

		label.setOnDragOver(dragEventHandler);
		hyperlink.setOnDragOver(dragEventHandler);

		EventHandler<DragEvent> dropEventHandler = new EventHandler<DragEvent>() {

			@Override
			public void handle(DragEvent arg0) {
				if (setCommand != null)
					editingDomain.getCommandStack().execute(setCommand);
			}

		};

		label.setOnDragDropped(dropEventHandler);
		hyperlink.setOnDragDropped(dropEventHandler);

		valueAdapter = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				update();
			}

		};

		update();
	}

	@Override
	protected void update() {
		Object value = modelElement.eGet(reference);

		if (unsetButton != null) {
			unsetCommand = SetCommand.create(editingDomain, modelElement, reference, SetCommand.UNSET_VALUE);
			unsetButton.setDisable(value == null || !unsetCommand.canExecute());
		}

		if (value instanceof EObject) {
			EObject eObject = (EObject) value;
			// TODO remove adapter from previous value
			eObject.eAdapters().add(valueAdapter);

			String text = ECPUtil.getText(value);
			hyperlink.setText(text);

			Node graphic = ECPUtil.getGraphic(value);
			hyperlink.setGraphic(graphic);

			borderPane.setLeft(hyperlink);
		} else {
			borderPane.setLeft(label);
		}

	}

	class Skin extends SkinBase<ReferenceControl> {

		Skin(ReferenceControl control) {
			super(control);

			borderPane = new BorderPane();
			getChildren().add(borderPane);

			label = new Label("Drop " + feature.getEType().getName() + " here");
			label.getStyleClass().add("reference-drop-label");

			hyperlink = new Hyperlink();

			if (reference.isUnsettable()) {
				unsetButton = new Button();
				borderPane.setRight(unsetButton);
				unsetButton.getStyleClass().add("unset-reference-button");
				ECPUtil.addMark(unsetButton, "cross");

				Tooltip tooltip = new Tooltip("Remove reference");
				unsetButton.setTooltip(tooltip);

				unsetButton.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						if (unsetCommand.canExecute())
							editingDomain.getCommandStack().execute(unsetCommand);
					}

				});
			}
		}

	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new ReferenceControl(itemPropertyDescriptor, context);
		}

	}

}
