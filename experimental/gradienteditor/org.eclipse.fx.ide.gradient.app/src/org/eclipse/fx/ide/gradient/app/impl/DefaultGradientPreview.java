package org.eclipse.fx.ide.gradient.app.impl;

import java.util.Arrays;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ObservableValue;
import javafx.geometry.Insets;
import javafx.scene.layout.GridPane;
import javafx.scene.paint.Paint;
import javafx.scene.shape.Rectangle;

import org.eclipse.emf.ecore.change.util.ChangeRecorder;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.ide.gradient.app.util.GradientConverter;
import org.eclipse.fx.ide.gradient.model.gradient.FxGradient;

public class DefaultGradientPreview extends GridPane {
	private Rectangle rect;

	public DefaultGradientPreview() {
		setHgap(10);
		setVgap(10);
		setPadding(new Insets(0, 10, 0, 10));
		initUI();
	}

	private void initUI() {
		// TODO flex size
		
		rect = new Rectangle(200, 200);
		add(rect, 0, 0);
	}

	public void bind(EditingDomain editingDomain, FxGradient gradient) {

		Property<Paint> v = new SimpleObjectProperty<Paint>();
		Paint convertedGradient = GradientConverter.convertGradient(gradient);
		v.setValue(convertedGradient);
		rect.fillProperty().bindBidirectional(v);

		ChangeRecorder cr = new ChangeRecorder();
		cr.beginRecording(Arrays.asList(gradient));
	}
}
