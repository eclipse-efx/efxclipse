package org.eclipse.fx.ecp.ui.controls;

import java.util.Date;
import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;
import jidefx.scene.control.field.DateField;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;
import org.eclipse.fx.ecp.ui.ECPControlContext;

public class DateControl extends ECPControlBase {

	protected DateField dateField;
	protected boolean internalUpdate = false;

	public DateControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);

		setSkin(new Skin(this));

		dateField.valueProperty().addListener(new ChangeListener<Date>() {

			@Override
			public void changed(ObservableValue<? extends Date> observableValue, Date oldDate, Date newDate) {
				// only commit if the value has changed and it's not an internal update
				if (!Objects.equals(oldDate, newDate) && !internalUpdate) {
					Command command = SetCommand.create(editingDomain, modelElement, feature, newDate);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}
			}

		});

		update();
	}

	@Override
	public void update() {
		Date newDate = (Date) modelElement.eGet(feature);

		if (newDate == null)
			newDate = new Date();

		// set the date only if the value has changed
		if (!Objects.equals(newDate, dateField.getValue())) {
			internalUpdate = true;
			dateField.setValue(newDate);
			internalUpdate = false;
		}
	}

	protected class Skin extends SkinBase<DateControl> {

		private Skin(DateControl control) {
			super(control);
			HBox hBox = new HBox();
			getChildren().add(hBox);
			dateField = DateField.createDateField();
			dateField.setPopupButtonVisible(true);
			hBox.getChildren().add(dateField);
		}

	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new DateControl(itemPropertyDescriptor, context);
		}

	}

}
