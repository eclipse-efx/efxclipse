package org.eclipse.fx.ecp.ui.controls.multi;

import java.util.Objects;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.Priority;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;

public class EmbeddedCheckboxControl extends AbstractEmbeddedControl {

	protected CheckBox checkBox;

	public EmbeddedCheckboxControl(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context, int initialIndex) {
		super(propertyDescriptor, context, initialIndex);

		setSkin(new Skin(this));

		checkBox.selectedProperty().addListener(new ChangeListener<Boolean>() {

			@Override
			public void changed(ObservableValue<? extends Boolean> observableValue, Boolean oldSelected, Boolean newSelected) {
				Boolean oldValue = (Boolean) eList.get(index);

				// only commit if the value has changed
				if (!Objects.equals(oldValue, newSelected)) {
					Command command = SetCommand.create(editingDomain, modelElement, feature, newSelected, index);
					if (command.canExecute())
						editingDomain.getCommandStack().execute(command);
				}
			}

		});

		setIndex(initialIndex);
	}

	@Override
	protected void update() {
		super.update();
		
		// only update if index inside bounds
		if(eList.size() > index) {
			Boolean value = (Boolean) eList.get(index);
			checkBox.setSelected(value);
		}
	}

	protected class Skin extends EmbeddedControlSkin {

		protected Skin(EmbeddedCheckboxControl control) {
			super(control);
			checkBox = new CheckBox();
			hBox.getChildren().add(0, checkBox);
			checkBox.setMaxWidth(Double.MAX_VALUE);
			HBox.setHgrow(checkBox, Priority.ALWAYS);
		}

	}

}
