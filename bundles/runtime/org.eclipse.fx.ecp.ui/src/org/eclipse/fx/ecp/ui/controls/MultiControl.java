package org.eclipse.fx.ecp.ui.controls;

import java.io.InputStream;
import java.net.URL;
import java.util.List;
import java.util.Objects;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;
import javafx.scene.layout.VBox;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.DeleteCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;
import org.eclipse.fx.ecp.ui.ECPUIPlugin;
import org.osgi.framework.Bundle;

@SuppressWarnings("all")
public class MultiControl extends VBox implements Control {

	private ValidationMessage validationMessage = null;
	private EStructuralFeature feature;
	private EObject modelElement;
	private EditingDomain editingDomain;
	private EList<?> values;
	private VBox controlsBox;

	public MultiControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		modelElement = context.getModelElement();
		editingDomain = context.getEditingDomain();
		feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		values = (EList<?>) modelElement.eGet(feature);

		controlsBox = new VBox();
		getChildren().add(controlsBox);
		controlsBox.setSpacing(4);

		for (int i = 0; i < values.size(); i++) {
			controlsBox.getChildren().add(new ControlWrapper(i));
		}

		getChildren().add(new Button(null, getImage("icons/add.png")));

		modelElement.eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {

				if (Objects.equals(msg.getFeature(), feature)) {

					final int position = msg.getPosition();
					
					switch (msg.getEventType()) {
					case Notification.REMOVE:
						controlsBox.getChildren().remove(position);
						break;
					case Notification.MOVE:
						int oldIndex = ((Integer) msg.getOldValue()).intValue();
						ControlWrapper controlWrapper = (ControlWrapper) controlsBox.getChildren().remove(oldIndex);
						controlsBox.getChildren().add(position, controlWrapper);
						controlWrapper.setIndex(position);
						break;
					}
					
					for (Node node : controlsBox.getChildren()) {
						if(node instanceof ControlWrapper)
							((ControlWrapper) node).updateButtons();
					}

				}

			}

		});

		validationMessage = new ValidationMessage();
		getChildren().add(validationMessage);
	}

	public static ImageView getImage(String resourcePath) {
		Bundle bundle = Platform.getBundle(ECPUIPlugin.PLUGIN_ID);
		Path path = new Path(resourcePath);
		URL url = FileLocator.find(bundle, path, null);
		return new ImageView(url.toExternalForm());
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		if (diagnostic.getSeverity() != Diagnostic.OK) {
			validationMessage.setMessage(diagnostic.getMessage());
		} else {
			resetValidation();
		}
	}

	@Override
	public void resetValidation() {
		validationMessage.setMessage(null);
	}

	public static class Factory implements Control.Factory {

		@Override
		public Control createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new MultiControl(itemPropertyDescriptor, context);
		}

	}

	class ControlWrapper extends HBox {

		private Button upButton;
		private Button downButton;
		private int index;

		public ControlWrapper(int initialIndex) {
			index = initialIndex;
			
			setFillHeight(true);
			TextField label = new TextField(values.get(initialIndex).toString());
			label.setMaxWidth(Double.MAX_VALUE);
			HBox.setHgrow(label, Priority.ALWAYS);
			label.setStyle("-fx-background-radius: 3 0 0 3, 2 0 0 2; -fx-background-insets: 0 0 1 0, 1 1 2 1;");
			getChildren().add(label);

			if (feature.isOrdered()) {

				upButton = new Button(null, getImage("icons/arrow_up.png"));
				getChildren().add(upButton);
				upButton.getStyleClass().add("center-pill");
				upButton.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						Command command = MoveCommand.create(editingDomain, modelElement, feature, values.get(index), index - 1);
						if (command.canExecute())
							editingDomain.getCommandStack().execute(command);
					}

				});

				downButton = new Button(null, getImage("icons/arrow_down.png"));
				downButton.getStyleClass().add("center-pill");
				getChildren().add(downButton);
				downButton.setOnAction(new EventHandler<ActionEvent>() {

					@Override
					public void handle(ActionEvent arg0) {
						Command command = MoveCommand.create(editingDomain, modelElement, feature, values.get(index), index + 1);
						if (command.canExecute())
							editingDomain.getCommandStack().execute(command);
					}

				});

			}

			final Button deleteButton = new Button(null, getImage("icons/delete.png"));
			getChildren().add(deleteButton);
			deleteButton.getStyleClass().add("right-pill");
			deleteButton.setOnAction(new EventHandler<ActionEvent>() {

				@Override
				public void handle(ActionEvent arg0) {
					Command command = RemoveCommand.create(editingDomain, modelElement, feature, values.get(index));
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}

			});
			
			updateButtons();
		}
		

		public void setIndex(int index) {
			this.index = index;
		}

		public void updateButtons() {
			if (upButton != null)
				upButton.setDisable(index < 1);

			if (downButton != null)
				downButton.setDisable(index > values.size() - 2);
		}

	}

}
