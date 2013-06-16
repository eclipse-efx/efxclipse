package org.eclipse.fx.ecp.ui.controls;

import javafx.scene.control.Button;
import javafx.scene.control.Control;
import javafx.scene.control.Label;
import javafx.scene.control.SkinBase;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.util.Diagnostic;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class DummyControl extends Control implements ECPControl {

	public DummyControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		getStyleClass().add("dummy-control");
		
//		HBox hBox = new HBox();
//		getChildren().add(hBox);
//		
//		TextField textField = new TextField();
//		hBox.getChildren().add(textField);
//		
//		Button button = new Button("Add");
//		hBox.getChildren().add(button);
		
//		getSkin();
		setSkin(new DummyControlSkin(this));
		// EObject modelElement = context.getModelElement();
		//
		// String displayName = propertyDescriptor.getDisplayName(modelElement);
		// Label label = new Label(displayName);
		// label.getStyleClass().add(IControlConstants.CONTROL_LABEL_CLASS);
		// getChildren().add(label);
		//
		// EStructuralFeature feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		// Object val = modelElement.eGet(feature);
		//
		// TextField textField = new TextField();
		// textField.setText(val.toString());
		// textField.setDisable(true);
		// HBox.setHgrow(textField, Priority.ALWAYS);
		//
		// getChildren().add(textField);
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
	protected String getUserAgentStylesheet() {
		return getClass().getResource("dummy.css").toExternalForm();
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControl createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new DummyControl(itemPropertyDescriptor, context);
		}

	}

	@Override
	public void dispose() {
		// TODO Auto-generated method stub

	}
	
	public class DummyControlSkin extends SkinBase<DummyControl> {

		protected DummyControlSkin(DummyControl control) {
			super(control);
			
			HBox hBox = new HBox();
			getChildren().add(hBox);
			
			TextField textField = new TextField();
			hBox.getChildren().add(textField);
			HBox.setHgrow(textField, Priority.ALWAYS);
			
			Button button = new Button("Add");
			hBox.getChildren().add(button);
		}

	}

}
