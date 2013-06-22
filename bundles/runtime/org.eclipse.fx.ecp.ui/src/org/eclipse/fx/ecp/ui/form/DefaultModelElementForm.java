package org.eclipse.fx.ecp.ui.form;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
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
import org.eclipse.fx.ecp.ui.ECPControl.Factory.Registry;
import org.eclipse.fx.ecp.ui.controls.ControlDecoration;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class DefaultModelElementForm extends Control implements ModelElementForm {

	ECPControlContext modelElementContext;
	private Map<EStructuralFeature, ControlDecoration> controls = new HashMap<>();

	public DefaultModelElementForm(ECPControlContext modelElementContext) {
		this.modelElementContext = modelElementContext;
		setSkin(new Skin(this));
		getStyleClass().add("model-element-form");
	}

	public class Skin extends SkinBase<DefaultModelElementForm> {

		private GridPane gridPane;

		protected Skin(DefaultModelElementForm modelElementForm) {
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
					ECPControl.Factory factory = registry.getFactory(propertyDescriptor, modelElement);

					if (factory != null) {
						ECPControlBase control = factory.createControl(propertyDescriptor, modelElementContext);
						AnchorPane.setLeftAnchor(control, 0.0);
						AnchorPane.setRightAnchor(control, 0.0);

						ControlDecoration controlDecoration = new ControlDecoration(feature, control);
						controls.put(feature, controlDecoration);

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
		return getClass().getResource("../controls/ECPControls.css").toExternalForm();
	}


	@Override
	public void dispose() {
		for (ControlDecoration controlDecoration : controls.values()) {
			controlDecoration.dispose();
		}
	}

	@Override
	public void handleValidation(Diagnostic diagnostic) {
		for (ControlDecoration controlDecoration : controls.values())
			controlDecoration.handleValidation(diagnostic);		
	}

	public static class Factory implements ModelElementForm.Factory {

		@Override
		public Node createModelElementForm(ECPControlContext modelElementContext) {
			return new DefaultModelElementForm(modelElementContext);
		}

	}

}
