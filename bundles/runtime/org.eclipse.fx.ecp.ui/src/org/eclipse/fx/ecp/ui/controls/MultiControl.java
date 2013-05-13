package org.eclipse.fx.ecp.ui.controls;

import java.io.InputStream;
import java.net.URL;
import java.util.List;

import javafx.geometry.Pos;
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
import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.Control;
import org.eclipse.fx.ecp.ui.ECPUIPlugin;
import org.osgi.framework.Bundle;

@SuppressWarnings("all")
public class MultiControl extends VBox implements Control {

	private ValidationMessage validationMessage = null;

	public MultiControl(IItemPropertyDescriptor propertyDescriptor,
			ECPControlContext context) {
		final EObject modelElement = context.getModelElement();
		final EditingDomain editingDomain = context.getEditingDomain();

		getStyleClass().add("multiTextControl");

		final EStructuralFeature feature = (EStructuralFeature) propertyDescriptor
				.getFeature(modelElement);

		List<Object> values = (List<Object>) modelElement.eGet(feature);

//		setAlignment(Pos.BASELINE_RIGHT);
		
		for (Object object : values) {
			HBox hBox = new HBox();
			TextField label = new TextField(object.toString());
			label.setMaxWidth(Double.MAX_VALUE);
			HBox.setHgrow(label, Priority.ALWAYS);
			hBox.getChildren().add(label);
			hBox.getChildren().add(new Button(null, getImage("icons/arrow_up.png")));
			hBox.getChildren().add(new Button(null, getImage("icons/arrow_down.png")));
			hBox.getChildren().add(new Button(null, getImage("icons/delete.png")));
			getChildren().add(hBox);
		}
		
		getChildren().add(new Button(null, getImage("icons/add.png")));

		validationMessage = new ValidationMessage();
		getChildren().add(validationMessage);
	}

	public ImageView getImage(String resourcePath) {
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
		public Control createControl(
				IItemPropertyDescriptor itemPropertyDescriptor,
				ECPControlContext context) {
			return new MultiControl(itemPropertyDescriptor, context);
		}

	}

}
