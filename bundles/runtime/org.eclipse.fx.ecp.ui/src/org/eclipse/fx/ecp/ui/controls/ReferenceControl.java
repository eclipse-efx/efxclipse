package org.eclipse.fx.ecp.ui.controls;

import java.net.URL;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Hyperlink;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
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
import org.eclipse.fx.ecp.ui.Control;
import org.eclipse.fx.ecp.ui.controls.multi.MarkButton;

public class ReferenceControl extends HBox implements Control {

	protected final Hyperlink hyperlink;
	protected final EObject modelElement;
	protected final EReference reference;
	protected final AdapterImpl valueAdapter;
	protected final Button unsetButton;
	protected final EditingDomain editingDomain;
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

		Button editButton = new MarkButton();
		getChildren().add(editButton);
		editButton.getStyleClass().addAll("set-reference-button", "left-pill");

		if (reference.isUnsettable()) {
			unsetButton = new MarkButton();
			getChildren().add(unsetButton);
			unsetButton.getStyleClass().addAll("unset-reference-button", "right-pill");
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

				URL image = (URL) labelProvider.getImage(value);
				ImageView imageView = new ImageView(image.toExternalForm());
				hyperlink.setGraphic(imageView);
				return;
			}

		}

		hyperlink.setText(null);
		hyperlink.setGraphic(null);
	}

	public static class Factory implements Control.Factory {

		@Override
		public Control createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
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
