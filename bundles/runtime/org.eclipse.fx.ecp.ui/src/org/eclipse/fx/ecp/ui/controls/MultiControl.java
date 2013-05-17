package org.eclipse.fx.ecp.ui.controls;

import java.net.URL;
import java.util.Objects;

import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.InputMethodEvent;
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
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.command.MoveCommand;
import org.eclipse.emf.edit.command.RemoveCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;
import org.eclipse.fx.ecp.ui.ECPUIPlugin;
import org.eclipse.fx.emf.databinding.edit.EMFEditFXProperties;
import org.eclipse.fx.emf.databinding.edit.EMFEditFXProperties.EListItemProperty;
import org.osgi.framework.Bundle;

@SuppressWarnings("all")
public class MultiControl extends VBox implements Control {

	private ValidationMessage validationMessage = null;
	private EStructuralFeature feature;
	private EObject modelElement;
	private EditingDomain editingDomain;
	private EList<?> values;
	private VBox controlsBox;
	private Button addButton;
	private TextField addTextField;
	private Command addCommand;
	private final ECPControlContext context;

	public MultiControl(final EStructuralFeature feature, final ECPControlContext context) {
		this.feature = feature;
		this.context = context;
		modelElement = context.getModelElement();
		editingDomain = context.getEditingDomain();
		values = (EList<?>) modelElement.eGet(feature);

		setSpacing(4);

		controlsBox = new VBox();
		getChildren().add(controlsBox);
		controlsBox.setSpacing(4);

		for (int i = 0; i < values.size(); i++) {
			controlsBox.getChildren().add(new ControlWrapper(i));
		}
		
		HBox hBox = new HBox();
		getChildren().add(hBox);
		
		addTextField = new TextField();
		hBox.getChildren().add(addTextField);
//		addTextField.setText(feature.getDefaultValue().toString());
		addTextField.setPromptText("Enter a value");
		addTextField.setStyle("-fx-background-radius: 3 0 0 3, 2 0 0 2; -fx-background-insets: 0 0 1 0, 1 1 2 1;");
		addTextField.setMaxWidth(Double.MAX_VALUE);
		HBox.setHgrow(addTextField, Priority.ALWAYS);
		addTextField.textProperty().addListener(new ChangeListener<String>() {

			@Override
			public void changed(ObservableValue<? extends String> arg0, String arg1, String arg2) {
				updateAddButton();
			}


		});
		
		addButton = new Button(null, getImage("icons/add.png"));
		hBox.getChildren().add(addButton);
		addButton.getStyleClass().add("right-pill");
		addButton.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent arg0) {
				if(addCommand != null && addCommand.canExecute()) {
					editingDomain.getCommandStack().execute(addCommand);
					addTextField.setText(null);
					addTextField.requestFocus();
				}
			}

		});

		modelElement.eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {

				if (Objects.equals(msg.getFeature(), feature)) {

					final int position = msg.getPosition();

					final ObservableList<Node> children = controlsBox.getChildren();

					switch (msg.getEventType()) {
					case Notification.REMOVE:
						children.remove(position);
						break;
					case Notification.MOVE:
						int oldIndex = ((Integer) msg.getOldValue()).intValue();
						ControlWrapper controlWrapper = (ControlWrapper) children.remove(oldIndex);
						children.add(position, controlWrapper);
						controlWrapper.setIndex(position);
						break;
					case Notification.ADD:
						controlsBox.getChildren().add(new ControlWrapper(position));
					}

					for (int i = 0; i < children.size(); i++)
						((ControlWrapper) children.get(i)).setIndex(i);

					updateButtons(children);

					updateAddButton();
				}

			}

		});
		
		updateAddButton();

		validationMessage = new ValidationMessage();
		getChildren().add(validationMessage);
	}

	private void updateAddButton() {
		addCommand = AddCommand.create(editingDomain, modelElement, feature, addTextField.getText());
		addButton.setDisable(!addCommand.canExecute());
	}

	private void updateButtons(final ObservableList<Node> children) {
		for (Node node : children)
			((ControlWrapper) node).updateButtons();
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
		public Control createControl(Property<?> property, EStructuralFeature feature, ECPControlContext context) {
			return new MultiControl(feature, context);
		}

	}

	class ControlWrapper extends HBox {

		private Button upButton;
		private Button downButton;
		private int index;

		public ControlWrapper(int initialIndex) {
			index = initialIndex;

			setFillHeight(true);
			Object value = values.get(initialIndex);
			
			org.eclipse.fx.ecp.ui.Control.Factory factory = Control.Factory.Registry.INSTANCE.getFactory(feature, modelElement, false);
			
			
//			TextField label = new TextField();
			
			try {
				Property<?> property = EMFEditFXProperties.listItem(editingDomain, modelElement, feature, initialIndex);
				Node control = (Node) factory.createControl(property, feature, context);
				getChildren().add(control);
//				label.textProperty().bindBidirectional((Property<String>) property);
			} catch (Exception e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
//			if(value != null)
//				label.setText(value.toString());
//			label.setPromptText("Please enter a value");
//			label.setMaxWidth(Double.MAX_VALUE);
//			HBox.setHgrow(label, Priority.ALWAYS);
//			label.setStyle("-fx-background-radius: 3 0 0 3, 2 0 0 2; -fx-background-insets: 0 0 1 0, 1 1 2 1;");
//			getChildren().add(label);

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
