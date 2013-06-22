package org.eclipse.fx.ecp.ui.controls;

import javafx.application.Platform;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.scene.control.TextField;

public class AutoSelector implements ChangeListener<Boolean> {

	protected final TextField textField;

	public AutoSelector(TextField textField) {
		super();
		this.textField = textField;
	}

	@Override
	public void changed(ObservableValue<? extends Boolean> arg0, Boolean arg1, Boolean arg2) {
		Platform.runLater(new Runnable() {
			
			@Override
			public void run() {
				if (textField.isFocused() && !textField.getText().isEmpty())
					textField.selectAll();
			}
			
		});
	}

}
