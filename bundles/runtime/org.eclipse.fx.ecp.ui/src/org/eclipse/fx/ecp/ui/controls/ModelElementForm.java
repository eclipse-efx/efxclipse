package org.eclipse.fx.ecp.ui.controls;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.AdapterFactoryItemDelegator;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPControl.Factory;
import org.eclipse.fx.ecp.ui.ECPControl.Factory.Registry;

public class ModelElementForm extends Control {

	ECPControlContext modelElementContext;
	
	public ModelElementForm(ECPControlContext modelElementContext) {
		this.modelElementContext = modelElementContext;
		setSkin(new Skin(this));
		getStyleClass().add("model-element-form");
	}

	public class Skin extends SkinBase<ModelElementForm> {

		private GridPane gridPane;
		private Map<EStructuralFeature, ECPControl> controls = new HashMap<>();

		protected Skin(ModelElementForm modelElementForm) {
			super(modelElementForm);

			gridPane = new GridPane();
			getChildren().add(gridPane);
			gridPane.getStyleClass().add("grid");

			EObject modelElement = modelElementContext.getModelElement();
			ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);
			AdapterFactoryItemDelegator adapterFactoryItemDelegator = new AdapterFactoryItemDelegator(adapterFactory);

			List<IItemPropertyDescriptor> propertyDescriptors = adapterFactoryItemDelegator.getPropertyDescriptors(modelElement);

			if (propertyDescriptors != null) {

				Registry registry = ECPControl.Factory.Registry.INSTANCE;

				int i = 1;
				for (IItemPropertyDescriptor propertyDescriptor : propertyDescriptors) {

					String displayName = propertyDescriptor.getDisplayName(modelElement);
					Label label = new Label(displayName);
					label.getStyleClass().add("control-label");
					GridPane.setValignment(label, VPos.TOP);
					gridPane.add(label, 0, i);

					EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

					Factory factory = registry.getFactory(Node.class, propertyDescriptor, modelElement);

					if (factory != null) {
						ECPControl control = factory.createControl(propertyDescriptor, modelElementContext);
						Node node = (Node) control;
						gridPane.add(node, 1, i);
						GridPane.setHgrow(node, Priority.ALWAYS);
						controls.put(feature, control);
					}

					i++;
				}

			}

		}

	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("ECPControls.css").toExternalForm();
	}

}
