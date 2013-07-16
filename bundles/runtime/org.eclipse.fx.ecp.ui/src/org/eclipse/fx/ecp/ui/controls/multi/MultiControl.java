package org.eclipse.fx.ecp.ui.controls.multi;

import java.net.URL;
import java.util.Collection;

import javafx.collections.ObservableList;
import javafx.event.EventHandler;
import javafx.scene.Node;
import javafx.scene.control.SkinBase;
import javafx.scene.image.ImageView;
import javafx.scene.input.DragEvent;
import javafx.scene.input.TransferMode;
import javafx.scene.layout.VBox;

import org.eclipse.core.runtime.FileLocator;
import org.eclipse.core.runtime.Path;
import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EDataType;
import org.eclipse.emf.ecore.EEnum;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;
import org.eclipse.fx.ecp.ui.ECPUIPlugin;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;
import org.eclipse.fx.emf.edit.ui.dnd.LocalTransfer;
import org.osgi.framework.Bundle;

@SuppressWarnings("all")
public class MultiControl extends ECPControlBase {

	protected EList<Object> values;
	protected VBox controlsBox;
	protected ECPControlBase addControl;
	protected Command addReferenceCommand;
	protected ECPModelElementOpener modelElementOpener;

	class Skin extends SkinBase<MultiControl> {

		protected Skin(MultiControl multiControl) {
			super(multiControl);
		}

	}

	public MultiControl(final IItemPropertyDescriptor propertyDescriptor, final EObject modelElement, final EditingDomain editingDomain, ECPModelElementOpener modelElementOpener) {
		super(propertyDescriptor, modelElement, editingDomain);
		this.modelElementOpener = modelElementOpener;
		
		setSkin(new Skin(this));

		values = (EList<Object>) modelElement.eGet(feature);

		VBox vBox = new VBox();
		getChildren().add(vBox);
		vBox.setSpacing(4);

		controlsBox = new VBox();
		vBox.getChildren().add(controlsBox);

		// TODO move to css
		controlsBox.setSpacing(4);

		for (int i = 0; i < values.size(); i++) {
			controlsBox.getChildren().add(createEmbeddedControl(propertyDescriptor, modelElement, editingDomain, i));
		}

		if (feature.getEType() instanceof EEnum) {
			vBox.getChildren().add(addControl = new EnumAddControl(propertyDescriptor, modelElement, editingDomain));
		} else if (feature.getEType() instanceof EDataType) {
			vBox.getChildren().add(addControl = new TextFieldAddControl(propertyDescriptor, modelElement, editingDomain));
		} else if (feature.getEType() instanceof EObject) {
			vBox.getChildren().add(addControl = new ReferenceAddControl(propertyDescriptor, modelElement, editingDomain));

			setOnDragOver(new EventHandler<DragEvent>() {

				@Override
				public void handle(DragEvent event) {
					Object object = LocalTransfer.INSTANCE.getObject();
					Command command = object instanceof Collection<?> ? AddCommand.create(editingDomain, modelElement, feature,
							(Collection<?>) object) : AddCommand.create(editingDomain, modelElement, feature, object);
					if (command.canExecute()) {
						addReferenceCommand = command;
						event.acceptTransferModes(TransferMode.COPY_OR_MOVE);
					} else {
						addReferenceCommand = null;
					}
				}

			});

			setOnDragDropped(new EventHandler<DragEvent>() {

				@Override
				public void handle(DragEvent arg0) {
					if (addReferenceCommand != null)
						editingDomain.getCommandStack().execute(addReferenceCommand);
				}

			});
		}
		
	}

	@Override
	public void dispose() {
		// dispose the embedded controls
		for (Node control : controlsBox.getChildren())
			((AbstractEmbeddedControl) control).dispose();

		// and the add-control
		addControl.dispose();

		super.dispose();
	}

	@Override
	protected AdapterImpl createModelElementAdapter() {

		return new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {

				if (msg.getFeature() == feature) {

					final int position = msg.getPosition();

					ObservableList<Node> children = controlsBox.getChildren();
					switch (msg.getEventType()) {
					case Notification.ADD:
						controlsBox.getChildren().add(createEmbeddedControl(propertyDescriptor, modelElement, editingDomain, position));
						break;
					case Notification.REMOVE: {
						AbstractEmbeddedControl control = (AbstractEmbeddedControl) children.get(position);
						control.dispose();
						children.remove(control);
					}
						break;
					case Notification.MOVE:
					case Notification.SET:
					case Notification.UNSET:
						break;
					case Notification.ADD_MANY:
						while (children.size() < values.size())
							children.add(createEmbeddedControl(propertyDescriptor, modelElement, editingDomain, 0));
						break;
					case Notification.REMOVE_MANY:
						while (children.size() > values.size()) {
							AbstractEmbeddedControl control = (AbstractEmbeddedControl) children.get(0);
							control.dispose();
							children.remove(control);
						}
						break;
					default:
						throw new UnsupportedOperationException();
					}

					for (int i = 0; i < children.size(); i++) {
						Node node = children.get(i);
						if (node instanceof AbstractEmbeddedControl)
							((AbstractEmbeddedControl) node).setIndex(i);
					}

				}

			}

		};

	}

	private AbstractEmbeddedControl createEmbeddedControl(final IItemPropertyDescriptor propertyDescriptor,
			final EObject modelElement, final EditingDomain editingDomain, int i) {

		if (feature instanceof EReference) {
			return new EmbeddedReferenceControl(propertyDescriptor, modelElement, editingDomain, i, modelElementOpener);
		} else if (feature.getEType() instanceof EEnum) {
			return new EmbeddedEnumControl(propertyDescriptor, modelElement, editingDomain, i);
		} else {
			Class<?> instanceClass = feature.getEType().getInstanceClass();
			if (Boolean.class.isAssignableFrom(instanceClass)) {
				return new EmbeddedCheckboxControl(propertyDescriptor, modelElement, editingDomain, i);
			} else if (Number.class.isAssignableFrom(instanceClass)
					|| (instanceClass.isPrimitive() && instanceClass != boolean.class && instanceClass != char.class)) {
				return new EmbeddedNumberFieldControl(propertyDescriptor, modelElement, editingDomain, i);
			} else {
				return new EmbeddedTextFieldControl(propertyDescriptor, modelElement, editingDomain, i);
			}
		}

	}

	public static ImageView getImage(String resourcePath) {
		Bundle bundle = Platform.getBundle(ECPUIPlugin.PLUGIN_ID);
		Path path = new Path(resourcePath);
		URL url = FileLocator.find(bundle, path, null);
		return new ImageView(url.toExternalForm());
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, EObject modelElement, EditingDomain editingDomain, ECPModelElementOpener modelElementOpener) {
			return new MultiControl(itemPropertyDescriptor, modelElement, editingDomain, modelElementOpener);
		}

	}

	@Override
	protected void update() {
		// TODO Auto-generated method stub
	}

}
