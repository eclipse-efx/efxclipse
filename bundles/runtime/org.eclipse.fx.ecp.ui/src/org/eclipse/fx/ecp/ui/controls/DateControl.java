package org.eclipse.fx.ecp.ui.controls;

import java.time.LocalDate;
import java.util.Date;
import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.DatePicker;
import javafx.scene.control.SkinBase;
import javafx.scene.layout.HBox;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControl;

public class DateControl extends ECPControlBase {

	private DatePicker datePicker;

	public DateControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		super(propertyDescriptor, context);
		
		setSkin(new Skin(this));

		datePicker.valueProperty().addListener(new ChangeListener<LocalDate>() {

			@Override
			public void changed(ObservableValue<? extends LocalDate> observableValue, LocalDate oldDate, LocalDate newDate) {
				// only commit if the value has changed
				if (!Objects.equals(oldDate, newDate)) {
					@SuppressWarnings("deprecation")
					Date date = new Date(newDate.getYear(), newDate.getMonthValue(), newDate.getDayOfMonth());
					Command command = SetCommand.create(editingDomain, modelElement, feature, date);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}
			}

		});

		update();
	}

	@Override
	public void update() {
		Date date = (Date) modelElement.eGet(feature);
		if(date == null)
			date = new Date();
		@SuppressWarnings("deprecation")
		LocalDate localDate = LocalDate.of(date.getYear(), date.getMonth(), date.getDate());
		datePicker.valueProperty().set(localDate);
	}

	private final class Skin extends SkinBase<DateControl> {
		private Skin(DateControl control) {
			super(control);
			HBox hBox = new HBox();
			getChildren().add(hBox);
			
			datePicker = new DatePicker();
			hBox.getChildren().add(datePicker);
		}
	}

	public static class Factory implements ECPControl.Factory {

		@Override
		public ECPControlBase createControl(IItemPropertyDescriptor itemPropertyDescriptor, ECPControlContext context) {
			return new DateControl(itemPropertyDescriptor, context);
		}

	}

}
