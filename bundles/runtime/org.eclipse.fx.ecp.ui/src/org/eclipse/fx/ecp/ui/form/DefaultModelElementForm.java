package org.eclipse.fx.ecp.ui.form;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Supplier;

import javafx.animation.Transition;
import javafx.beans.property.ObjectProperty;
import javafx.geometry.Insets;
import javafx.geometry.Point2D;
import javafx.geometry.Pos;
import javafx.geometry.VPos;
import javafx.scene.Node;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Priority;
import jidefx.animation.AnimationType;
import jidefx.animation.AnimationUtils;
import jidefx.scene.control.decoration.DecorationPane;
import jidefx.scene.control.decoration.DecorationUtils;
import jidefx.scene.control.decoration.Decorator;
import jidefx.scene.control.decoration.MutableDecorator;

import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecore.util.Diagnostician;
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
	private Map<EStructuralFeature, ValidationDecoration> controls = new HashMap<>();

	public DefaultModelElementForm(final ECPControlContext modelElementContext) {
		this.modelElementContext = modelElementContext;
		setSkin(new Skin(this));
		getStyleClass().add("model-element-form");

		modelElementContext.getModelElement().eAdapters().add(new AdapterImpl() {

			@Override
			public void notifyChanged(Notification msg) {
				validate();
			}

		});

		validate();
	}

	protected void validate() {
		Diagnostic diagnostic = Diagnostician.INSTANCE.validate(modelElementContext.getModelElement());
		for (ValidationDecoration controlDecoration : controls.values())
			controlDecoration.handleValidation(diagnostic);
	}

	public class Skin extends SkinBase<DefaultModelElementForm> {

		private GridPane gridPane;

		protected Skin(DefaultModelElementForm modelElementForm) {
			super(modelElementForm);

			gridPane = new GridPane();
			getChildren().add(new DecorationPane(gridPane));
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
						gridPane.add(control, 1, i);

						GridPane.setHgrow(control, Priority.ALWAYS);

						ValidationDecoration validationDecorator = new ValidationDecoration(control, feature);
//						DecorationUtils.install(control, validationDecorator);

						// AnchorPane.setLeftAnchor(control, 0.0);
						// AnchorPane.setRightAnchor(control, 0.0);
						//
						// ControlDecoration controlDecoration = new ControlDecoration(feature, control);
						 controls.put(feature, validationDecorator);

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
//		for (ControlDecoration controlDecoration : controls.values()) {
//			controlDecoration.dispose();
//		}
	}

	public static class Factory implements ModelElementForm.Factory {

		@Override
		public Node createModelElementForm(ECPControlContext modelElementContext) {
			return new DefaultModelElementForm(modelElementContext);
		}

	}

	public static class ValidationDecorator extends MutableDecorator<Node> {

		Image infoImage = new Image(Decorator.class.getResourceAsStream("overlay_info.png"));
		Image warningImage = new Image(Decorator.class.getResourceAsStream("overlay_warning.png"));
		Image errorImage = new Image(Decorator.class.getResourceAsStream("overlay_error.png"));

		public ValidationDecorator() {
			ImageView imageView = new ImageView(errorImage);
			Label label = new Label(null, imageView);
			nodeProperty().set(label);
			
			label.setOpacity(0);

			posProperty().set(Pos.TOP_LEFT);

			Transition transition = AnimationUtils.createTransition(label, AnimationType.BOUNCE_IN);
			
			transitionProperty().set(transition);
			
			paddingProperty().set(new Insets(0));
		}

	}

}
