package org.eclipse.fx.ecp.ui.controls;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.geometry.Insets;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
import javafx.scene.control.Tooltip;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.util.Diagnostic;
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
	private Map<EStructuralFeature, ControlDecoration> controls = new HashMap<>();
	
	public ModelElementForm(ECPControlContext modelElementContext) {
		this.modelElementContext = modelElementContext;
		setSkin(new Skin(this));
		getStyleClass().add("model-element-form");
	}

	public class Skin extends SkinBase<ModelElementForm> {

		private GridPane gridPane;

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
					gridPane.setPadding(new Insets(20));
					gridPane.setVgap(10);
					gridPane.setHgap(12);

					EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);

					Factory factory = registry.getFactory(Node.class, propertyDescriptor, modelElement);

					if (factory != null) {
						ControlDecoration controlDecoration = new ControlDecoration(feature);
						controls.put(feature, controlDecoration);
						
						ECPControl control = factory.createControl(propertyDescriptor, modelElementContext);
						Node node = (Node) control;
						controlDecoration.getChildren().add(node);
						AnchorPane.setLeftAnchor(node, 0.0);
						AnchorPane.setRightAnchor(node, 0.0);
						
						gridPane.add(controlDecoration, 1, i);
						GridPane.setHgrow(controlDecoration, Priority.ALWAYS);
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
	
	public void validate(Diagnostic diagnostic) {
		for (ControlDecoration controlDecoration : controls.values()) {
			controlDecoration.handleValidation(diagnostic);
		}
//		for (Diagnostic childDiagnostic : diagnostic.getChildren()) {
//			Object feature = childDiagnostic.getData().get(1);
//			ControlDecoration controlDecoration = controls.get(feature);
//			if(controlDecoration != null) {
//				controlDecoration.handleValidation(childDiagnostic);
//			}
//		}
	}

}
