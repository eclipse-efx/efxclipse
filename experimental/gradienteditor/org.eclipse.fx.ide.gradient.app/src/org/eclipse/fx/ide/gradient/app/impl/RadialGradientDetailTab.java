package org.eclipse.fx.ide.gradient.app.impl;

import javafx.beans.property.Property;
import javafx.scene.control.CheckBox;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.Slider;
import javafx.scene.control.Tab;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.util.converter.NumberStringConverter;

import org.eclipse.core.databinding.observable.list.IObservableList;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.core.databinding.AdapterFactory;
import org.eclipse.fx.emf.databinding.edit.EMFEditFXProperties;
import org.eclipse.fx.ide.gradient.app.StopEditor;
import org.eclipse.fx.ide.gradient.model.gradient.FxCycleMethod;
import org.eclipse.fx.ide.gradient.model.gradient.FxRadialGradient;
import org.eclipse.fx.ide.gradient.model.gradient.GradientPackage;

import com.sun.javafx.collections.ImmutableObservableList;

public class RadialGradientDetailTab extends Tab {
	private StopEditor stopEditor = null;
	private DefaultGradientPreview preview = null;
	private TextField centerX;
	private TextField centerY;
	private TextField focusAngle;
	private TextField focusDistance;
	private TextField radius;
	private CheckBox proportional;
	private ComboBox<FxCycleMethod> cycleMethod;

	private Slider sCenterX;
	private Slider sCenterY;
	private Slider sFocusAngle;
	private Slider sFocusDistance;

	public void initUI() {
		setClosable(false);
		setText("Radial");
		
		
		
		GridPane contentPane = new GridPane();
		setContent(contentPane);

		preview = new DefaultGradientPreview();
		contentPane.add(preview, 0, 0);
		GridPane detailPane = new GridPane();
		contentPane.add(detailPane, 0, 1);
		stopEditor = new DefaultStopEditor();
		contentPane.add(stopEditor.getControl(), 1,0, 1, 2);

		Label lCenterX = new Label();
		lCenterX.setText("Center X");
		detailPane.add(lCenterX, 0, 1);

		centerX = new TextField();
		detailPane.add(centerX, 1, 1);

		sCenterX = new Slider();
		sCenterX.setMin(0);
		sCenterX.setMax(1);
		detailPane.add(sCenterX, 2, 1);

		Label lCenterY = new Label();
		lCenterY.setText("Center Y");
		detailPane.add(lCenterY, 0, 2);

		centerY = new TextField();
		detailPane.add(centerY, 1, 2);

		sCenterY = new Slider();
		sCenterY.setMin(0);
		sCenterY.setMax(1);
		detailPane.add(sCenterY, 2, 2);

		Label lFocusAngle = new Label();
		lFocusAngle.setText("Focus Angle");
		detailPane.add(lFocusAngle, 0, 3);

		focusAngle = new TextField();
		detailPane.add(focusAngle, 1, 3);

		sFocusAngle = new Slider();
		sFocusAngle.setMin(0);
		sFocusAngle.setMax(360); // in degrees
		detailPane.add(sFocusAngle, 2, 3);

		Label lFocusDistance = new Label();
		lFocusDistance.setText("Focus Distance");
		detailPane.add(lFocusDistance, 0, 4);

		focusDistance = new TextField();
		detailPane.add(focusDistance, 1, 4);

		sFocusDistance = new Slider();
		sFocusDistance.setMin(-1);
		sFocusDistance.setMax(1);
		detailPane.add(sFocusDistance, 2, 4);

		Label lRadius = new Label();
		lRadius.setText("Radius");
		detailPane.add(lRadius, 0, 5);

		radius = new TextField();
		detailPane.add(radius, 1, 5);

		proportional = new CheckBox();
		proportional.setText("Proportional");
		detailPane.add(proportional, 1, 6);

		Label lCycleMethod = new Label();
		lCycleMethod.setText("Cycle Method");
		detailPane.add(lCycleMethod, 0, 7);

		cycleMethod = new ComboBox<>();
		detailPane.add(cycleMethod, 1, 7);
		cycleMethod.setItems(new ImmutableObservableList<FxCycleMethod>(
				FxCycleMethod.values()));
	}

	public void bind(EditingDomain editingDomain, FxRadialGradient gradient) {
		Property<Number> propertyCenterX = EMFEditFXProperties.value(
				editingDomain, gradient,
				GradientPackage.Literals.FX_RADIAL_GRADIENT__CENTER_X);
		centerX.textProperty().bindBidirectional(propertyCenterX,
				new NumberStringConverter());
		Property<Number> propertyCenterY = EMFEditFXProperties.value(
				editingDomain, gradient,
				GradientPackage.Literals.FX_RADIAL_GRADIENT__CENTER_Y);
		centerY.textProperty().bindBidirectional(propertyCenterY,
				new NumberStringConverter());
		Property<Number> propertyFocusAngle = EMFEditFXProperties.value(
				editingDomain, gradient,
				GradientPackage.Literals.FX_RADIAL_GRADIENT__FOCUS_ANGLE);
		focusAngle.textProperty().bindBidirectional(propertyFocusAngle,
				new NumberStringConverter());
		Property<Number> propertyFocusDistance = EMFEditFXProperties.value(
				editingDomain, gradient,
				GradientPackage.Literals.FX_RADIAL_GRADIENT__FOCUS_DISTANCE);
		focusDistance.textProperty().bindBidirectional(propertyFocusDistance,
				new NumberStringConverter());
		Property<Number> propertyRadius = EMFEditFXProperties.value(
				editingDomain, gradient,
				GradientPackage.Literals.FX_RADIAL_GRADIENT__RADIUS);
		radius.textProperty().bindBidirectional(propertyRadius,
				new NumberStringConverter());

		IObservableValue v = new WritableValue();
		v.setValue(gradient);
		IObservableList stopList = EMFProperties.list(
				GradientPackage.Literals.FX_GRADIENT__STOPS).observeDetail(v);
		stopEditor.bind(editingDomain, AdapterFactory.adapt(stopList));
		preview.bind(editingDomain, gradient);
		// TODO bind cyclemethod, proportional

		sCenterX.valueProperty().bindBidirectional(propertyCenterX);
		sCenterY.valueProperty().bindBidirectional(propertyCenterY);
		sFocusAngle.valueProperty().bindBidirectional(propertyFocusAngle);
		sFocusDistance.valueProperty().bindBidirectional(propertyFocusDistance);
	}
}
