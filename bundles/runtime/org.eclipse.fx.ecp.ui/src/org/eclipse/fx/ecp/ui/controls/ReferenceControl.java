package org.eclipse.fx.ecp.ui.controls;

import java.util.Collection;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Tooltip;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.controls.multi.MarkButton;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryCellFactory;
import org.eclipse.fx.emf.edit.ui.dnd.LocalTransfer;

public class ReferenceControl extends HBox implements ECPControl {

	protected final Hyperlink hyperlink;
	protected final EObject modelElement;
	protected final EReference reference;
	protected final AdapterImpl valueAdapter;
	protected final Button unsetButton;
	protected final EditingDomain editingDomain;
	protected Command setCommand;
	protected Command unsetCommand;
	protected final AdapterImpl modelElementAdapter;

	public ReferenceControl(IItemPropertyDescriptor propertyDescriptor, final ECPControlContext context) {

		modelElement = context.getModelElement();
		reference = (EReference) propertyDescriptor.getFeature(modelElement);
		editingDomain = context.getEditingDomain();

		hyperlink = new Hyperlink();
		getChildren().add(hyperlink);
		hyperlink.setMaxWidth(Double.MAX_VALUE);
		HBox.setHgrow(hyperlink, Priority.ALWAYS);
		hyperlink.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				Object value = modelElement.eGet(reference);
				if (value instanceof EObject)
					context.openInNewContext((EObject) value);
			}

		});

		hyperlink.setOnDragOver(new EventHandler<DragEvent>() {


			@Override
			public void handle(DragEvent event) {
				Object object = LocalTransfer.INSTANCE.getObject();
				
				if(object instanceof Collection<?>) {
					Collection<?> collection = (Collection<?>) object;
					object = collection.size() == 1 ? collection.iterator().next() : null;
				}
				
				Command command = SetCommand.create(editingDomain, modelElement, reference, object);
				if(command.canExecute()) {
					setCommand = command;
					event.acceptTransferModes(TransferMode.COPY_OR_MOVE);

//					event.acceptTransferModes(TransferMode.LINK);
//					event.acceptTransferModes(TransferMode.ANY);
					System.out.println("accepted2");
				} else {
					setCommand = null;
				}
			}

		});
		
		hyperlink.setOnDragDropped(new EventHandler<DragEvent>() {

			@Override
			public void handle(DragEvent arg0) {
				if(setCommand != null)
					editingDomain.getCommandStack().execute(setCommand);
			}
			
		});

		if (reference.isUnsettable()) {
			unsetButton = new MarkButton("cross");
			getChildren().add(unsetButton);
			unsetButton.getStyleClass().add("unset-reference-button");
			Tooltip tooltip = new Tooltip("Remove reference");
			unsetButton.setTooltip(tooltip);
			unsetButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					if (unsetCommand.canExecute())
						editingDomain.getCommandStack().execute(unsetCommand);
				}

			});

		} else {
			unsetButton = null;
		}

		final EReference feature = (EReference) propertyDescriptor.getFeature(modelElement);

		modelElementAdapter = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == feature)
					update();
			}

		};

		modelElement.eAdapters().add(modelElementAdapter);

		valueAdapter = new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				update();
			}

		};

		update();
	}

	private void update() {
		ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

		Object value = modelElement.eGet(reference);

		if (unsetButton != null) {
			unsetCommand = SetCommand.create(editingDomain, modelElement, reference, SetCommand.UNSET_VALUE);
			unsetButton.setDisable(value == null || !unsetCommand.canExecute());
		}

		if (value instanceof EObject) {

			EObject eObject = (EObject) value;

			eObject.eAdapters().add(valueAdapter);

			IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(value, IItemLabelProvider.class);

			if (labelProvider != null) {
				String text = labelProvider.getText(value);
				hyperlink.setText(text);

				Object image = labelProvider.getImage(value);
				Node graphic = AdapterFactoryCellFactory.graphicFromObject(image);
				hyperlink.setGraphic(graphic);
				return;
			}

		}

		hyperlink.setText(null);
		hyperlink.setGraphic(null);
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControl createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new ReferenceControl(itemPropertyDescriptor, context);
		}

	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		// TODO Auto-generated method stub
	}

	@Override
	public void resetValidation() {
		// TODO Auto-generated method stub
	}

	@Override
	public void dispose() {
		modelElement.eAdapters().remove(modelElementAdapter);
	}

}
