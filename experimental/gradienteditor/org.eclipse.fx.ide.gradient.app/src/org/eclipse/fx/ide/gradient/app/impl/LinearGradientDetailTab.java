package org.eclipse.fx.ide.gradient.app.impl;

import javafx.beans.property.Property;
import javafx.beans.value.ObservableValue;
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
import org.eclipse.fx.ide.gradient.model.gradient.FxLinearGradient;
import org.eclipse.fx.ide.gradient.model.gradient.GradientPackage;

import com.sun.javafx.collections.ImmutableObservableList;

public class LinearGradientDetailTab extends Tab {
	private StopEditor stopEditor = null;
	private DefaultGradientPreview preview = null;

	private TextField startX;
	private TextField endX;
	private TextField startY;
	private TextField endY;
	private ComboBox<FxCycleMethod> cycleMethod;

	private Slider sStartX;
	private Slider sEndX;
	private Slider sStartY;
	private Slider sEndY;

	public void initUI() {
		setClosable(false);
		setText("Linear");

		GridPane contentPane = new GridPane();
		setContent(contentPane);

		preview = new DefaultGradientPreview();
		contentPane.add(preview, 0, 0);
		GridPane detailPane = new GridPane();
		contentPane.add(detailPane, 0, 1);
		stopEditor = new DefaultStopEditor();
		contentPane.add(stopEditor.getControl(), 1, 0, 1, 2);

		Label lStartX = new Label();
		lStartX.setText("Start X");
		detailPane.add(lStartX, 0, 1);

		startX = new TextField();
		detailPane.add(startX, 1, 1);

		sStartX = new Slider();
		sStartX.setMin(0);
		sStartX.setMax(1);
		detailPane.add(sStartX, 2, 1);

		Label lEndX = new Label();
		lEndX.setText("End X");
		detailPane.add(lEndX, 0, 2);

		endX = new TextField();
		detailPane.add(endX, 1, 2);

		sEndX = new Slider();
		sEndX.setMin(0);
		sEndX.setMax(1);
		detailPane.add(sEndX, 2, 2);

		Label lStartY = new Label();
		lStartY.setText("Start Y");
		detailPane.add(lStartY, 0, 3);

		startY = new TextField();
		detailPane.add(startY, 1, 3);

		sStartY = new Slider();
		sStartY.setMin(0);
		sStartY.setMax(1);
		detailPane.add(sStartY, 2, 3);

		Label lEndY = new Label();
		lEndY.setText("End Y");
		detailPane.add(lEndY, 0, 4);

		endY = new TextField();
		detailPane.add(endY, 1, 4);

		sEndY = new Slider();
		sEndY.setMin(0);
		sEndY.setMax(1);
		detailPane.add(sEndY, 2, 4);

		Label lCycleMethod = new Label();
		lCycleMethod.setText("Cycle Method");
		detailPane.add(lCycleMethod, 0, 5);

		cycleMethod = new ComboBox<>();
		detailPane.add(cycleMethod, 1, 5);
		cycleMethod.setItems(new ImmutableObservableList<FxCycleMethod>(
				FxCycleMethod.values()));

	}

	public void bind(EditingDomain editingDomain, FxLinearGradient gradient) {
		Property<Number> propertyStartX = EMFEditFXProperties.value(
				editingDomain, gradient,
				GradientPackage.Literals.FX_LINEAR_GRADIENT__START_X);
		startX.textProperty().bindBidirectional(propertyStartX,
				new NumberStringConverter());
		Property<Number> propertyStartY = EMFEditFXProperties.value(
				editingDomain, gradient,
				GradientPackage.Literals.FX_LINEAR_GRADIENT__START_Y);
		startY.textProperty().bindBidirectional(propertyStartY,
				new NumberStringConverter());
		Property<Number> propertyEndX = EMFEditFXProperties.value(
				editingDomain, gradient,
				GradientPackage.Literals.FX_LINEAR_GRADIENT__END_X);
		endX.textProperty().bindBidirectional(propertyEndX,
				new NumberStringConverter());
		Property<Number> propertyEndY = EMFEditFXProperties.value(
				editingDomain, gradient,
				GradientPackage.Literals.FX_LINEAR_GRADIENT__END_Y);
		endY.textProperty().bindBidirectional(propertyEndY,
				new NumberStringConverter());

		IObservableValue v = new WritableValue();
		v.setValue(gradient);
		IObservableList stopList = EMFProperties.list(
				GradientPackage.Literals.FX_GRADIENT__STOPS).observeDetail(v);
		stopEditor.bind(editingDomain, AdapterFactory.adapt(stopList));
		preview.bind(editingDomain, gradient);

		// TODO bind cyclemethod, proportional

		// IObservableValue mProp = EMFProperties.value(
		// GradientPackage.Literals.FX_GRADIENT__CYCLE_METHOD).observe(
		// gradient);
		// IObservableValue vProp =
		// JFXUIProperties.singleViewSelection().observe(
		// cycleMethod);
		// new EMFDataBindingContext().bindValue(vProp, mProp);

		sStartX.valueProperty().bindBidirectional(propertyStartX);
		sEndX.valueProperty().bindBidirectional(propertyEndX);
		sStartY.valueProperty().bindBidirectional(propertyStartY);
		sEndY.valueProperty().bindBidirectional(propertyEndY);
	}
}
