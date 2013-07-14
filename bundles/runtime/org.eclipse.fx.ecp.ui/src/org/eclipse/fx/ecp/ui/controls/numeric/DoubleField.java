package org.eclipse.fx.ecp.ui.controls.numeric;

import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;
import jidefx.scene.control.field.NumberField;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPControlContext;
import org.eclipse.fx.ecp.ui.controls.ECPControlBase;

public class DoubleField extends ECPControlBase implements ECPControl {

	protected NumberField numberField;
	protected boolean internalUpdate = false;

	public class DoubleFieldSkin extends SkinBase<DoubleField> {

		DoubleFieldSkin(DoubleField control) {
			
			super(control);

			HBox hBox = new HBox();
			getChildren().add(hBox);
			hBox.setFillHeight(true);

			numberField = new NumberField() {
				
				@Override
				protected Number fromString(String arg0) {
					return Double.parseDouble(arg0);
//					return super.fromString(arg0);
				}
				
			};
			
			numberField.setDefaultValue(0.0);
			
			numberField.setDecimalFormat(new DecimalFormat("f"));
			
			hBox.getChildren().add(numberField);

			numberField.valueProperty().addListener(new ChangeListener<Number>() {

				@Override
				public void changed(ObservableValue<? extends Number> arg0, Number oldValue, Number newValue) {
					// only commit if the value has changed
					if (!Objects.equals(oldValue, newValue) && !internalUpdate) {
						Command command = SetCommand.create(editingDomain, modelElement, feature, newValue);
						if (command.canExecute())
							editingDomain.getCommandStack().execute(command);
					}
				}

			});

			update();
		}

	}

	public DoubleField(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);
		setSkin(new DoubleFieldSkin(this));
		getStyleClass().add("spinner");
	}

	@Override
	protected String getUserAgentStylesheet() {
		return getClass().getResource("../ECPControls.css").toExternalForm();
	}

	@Override
	protected void update() {
		Double value = (Double) modelElement.eGet(feature);
		internalUpdate = true;
		numberField.setValue(value);
		internalUpdate = false;
	}

	@Override
	public void dispose() {
		modelElement.eAdapters().remove(modelElementAdapter);
	}
	
	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new DoubleField(itemPropertyDescriptor, context);
		}

	}

}
