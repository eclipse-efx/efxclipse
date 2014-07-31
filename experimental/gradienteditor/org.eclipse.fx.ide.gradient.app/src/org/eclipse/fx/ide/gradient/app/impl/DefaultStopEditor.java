package org.eclipse.fx.ide.gradient.app.impl;

import javafx.beans.property.Property;
import javafx.beans.property.SimpleObjectProperty;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.util.Callback;
import javafx.util.converter.DoubleStringConverter;

import org.eclipse.core.databinding.UpdateValueStrategy;
import org.eclipse.core.databinding.conversion.Converter;
import org.eclipse.core.databinding.observable.value.IObservableValue;
import org.eclipse.core.databinding.observable.value.WritableValue;
import org.eclipse.emf.databinding.EMFDataBindingContext;
import org.eclipse.emf.databinding.EMFProperties;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.core.databinding.AdapterFactory;
import org.eclipse.fx.core.databinding.ObservableWritableValue;
import org.eclipse.fx.emf.databinding.edit.EMFEditFXProperties;
import org.eclipse.fx.ide.gradient.app.StopEditor;
import org.eclipse.fx.ide.gradient.app.util.GradientConverter;
import org.eclipse.fx.ide.gradient.model.gradient.FxColor;
import org.eclipse.fx.ide.gradient.model.gradient.FxStop;
import org.eclipse.fx.ide.gradient.model.gradient.GradientFactory;
import org.eclipse.fx.ide.gradient.model.gradient.GradientPackage;
import org.eclipse.fx.ide.gradient.model.gradient.RgbFxColor;

public class DefaultStopEditor extends GridPane implements StopEditor {
	private final IObservableValue selectedStop = new WritableValue();

	private ListView<FxStop> stops;
	private Button bAdd;
	private Button bUp;
	private Button bDown;
	private Button bRemove;
	private ColorPicker colorPicker;
	private TextField offset;

	public DefaultStopEditor() {
		setHgap(10);
		setVgap(10);
		setPadding(new Insets(0, 10, 0, 10));
		initUI();
	}

	private void initUI() {
		stops = new ListView<>();
		add(stops, 0, 0, 1, 5);
		stops.setCellFactory(new Callback<ListView<FxStop>, ListCell<FxStop>>() {
			@Override
			public ListCell<FxStop> call(ListView<FxStop> list) {
				return new ColorRectCell();
			}
		});

		bAdd = new Button();
		bAdd.setText("Add");
		bAdd.setMinWidth(0.3);
		add(bAdd, 1, 0);
		bUp = new Button();
		bUp.setText("Up");
		add(bUp, 1, 1);
		bDown = new Button();
		bDown.setText("Down");
		add(bDown, 1, 2);
		bRemove = new Button();
		bRemove.setText("Remove");
		add(bRemove, 1, 3);

		colorPicker = new ColorPicker();
		add(colorPicker, 2, 0);

		offset = new TextField();
		add(offset, 2, 1);
	}

	@Override
	public Pane getControl() {
		return this;
	}

	@Override
	public void bind(EditingDomain editingDomain, ObservableList<FxStop> data) {
		stops.setItems(data);
		if (!data.isEmpty()) {
			selectedStop.setValue(data.get(0));
			// colorVal.setValue(GradientConverter.convertColor(data.get(0).getColor()));
		}
		stops.getSelectionModel().selectedItemProperty()
				.addListener(new ChangeListener<FxStop>() {
					@Override
					public void changed(
							ObservableValue<? extends FxStop> observable,
							FxStop oldValue, FxStop newValue) {
						if (oldValue!= null)
						System.err.println("old " + oldValue.getOffset());
						if (newValue!= null)
						System.err.println("new " + newValue.getOffset());

						selectedStop.setValue(newValue);
					}
				});

		bAdd.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				FxStop newStop = GradientFactory.eINSTANCE.createFxStop();
				newStop.setOffset(1.33);
				RgbFxColor c = GradientFactory.eINSTANCE.createRgbFxColor();
				c.setBlue(1);
				c.setGreen(0);
				c.setOpacity(1);
				c.setRed(0);
				newStop.setColor(c);
				data.add(newStop);
				stops.getSelectionModel().select(newStop);
			}
		});

		bRemove.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				FxStop toDel = stops.getSelectionModel().getSelectedItem();
				if (toDel != null) {
					if (toDel == data.get(0)) {
						stops.getSelectionModel().selectNext();
					} else {
						stops.getSelectionModel().selectPrevious();
					}
					data.remove(toDel);
				}
			}
		});

		bUp.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				FxStop sel = stops.getSelectionModel().getSelectedItem();
				data.toString();
			}
		});
		bDown.setOnAction(new EventHandler<ActionEvent>() {
			@Override
			public void handle(ActionEvent t) {
				FxStop sel = stops.getSelectionModel().getSelectedItem();
				data.toString();
			}
		});
		bindOffset(editingDomain);
		bindColorPicker();
	}

	private void bindColorPicker() {
		IObservableValue colorVal = new WritableValue();
		IObservableValue fxcolorVal = EMFProperties.value(
				GradientPackage.Literals.FX_STOP__COLOR).observeDetail(
				selectedStop);

		UpdateValueStrategy t2m = new UpdateValueStrategy();
		t2m.setConverter(new Converter(Color.class, FxColor.class) {
			@Override
			public Object convert(Object fromObject) {
				System.err.println("convert t 2 m "
						+ GradientConverter.convertRgbColor((Color) fromObject));
				return GradientConverter.convertRgbColor((Color) fromObject);
			}
		});
		UpdateValueStrategy m2t = new UpdateValueStrategy();
		m2t.setConverter(new Converter(FxColor.class, Color.class) {
			@Override
			public Object convert(Object fromObject) {
				System.err.println("convert m 2 t "
						+ GradientConverter.convertColor((FxColor) fromObject));
				return GradientConverter.convertColor((FxColor) fromObject);
			}
		});
		new EMFDataBindingContext().bindValue(colorVal, fxcolorVal, t2m, m2t);

		Property<Color> colorProperty = new SimpleObjectProperty<Color>();
		ObservableWritableValue<Color> adapted = AdapterFactory.<Color> adapt(colorVal);
		colorProperty.bind(adapted);

		adapted.addListener(new ChangeListener<Color>() {
			@Override
			public void changed(ObservableValue<? extends Color> observable,
					Color oldValue, Color newValue) {
				System.err.println("old color: " + oldValue);
				System.err.println("new color: " + newValue);

			}
		});
		
		colorProperty.addListener(new ChangeListener<Color>() {
			@Override
			public void changed(ObservableValue<? extends Color> observable,
					Color oldValue, Color newValue) {
				System.err.println("colorProperty old color: " + oldValue);
				System.err.println("colorProperty new color: " + newValue);
			}
		});

		colorPicker.valueProperty().bindBidirectional(colorProperty);
		
		colorPicker.valueProperty().addListener(new ChangeListener<Color>() {
			@Override
			public void changed(ObservableValue<? extends Color> observable,
					Color oldValue, Color newValue) {
				System.err.println("colorPicker old color: " + oldValue);
				System.err.println("colorPicker new color: " + newValue);
				// FIXME binding does not work here
				colorProperty.setValue(newValue);
			}
		});
		
//		colorPicker.setOnAction(new EventHandler<ActionEvent>() {
//			@Override
//			public void handle(ActionEvent t) {
//				stops.getCellFactory().call(stops).updateListView(stops);
//			}
//		});
	}

	private void bindOffset(EditingDomain editingDomain) {
		Property<Double> offsetProperty = EMFEditFXProperties.value(
				editingDomain, (EObject) selectedStop.getValue(),
				GradientPackage.Literals.FX_STOP__OFFSET);
		offset.textProperty().bindBidirectional(offsetProperty,
				new DoubleStringConverter());
	}

	static class ColorRectCell extends ListCell<FxStop> {
		@Override
		public void updateItem(FxStop item, boolean empty) {
			super.updateItem(item, empty);
			Rectangle rect = new Rectangle(20, 20);
			if (item != null) {
				rect.setFill(GradientConverter.convertColor(item.getColor()));
				setGraphic(rect);
				setText(item.getOffset() + ""); //$NON-NLS-1$
			} else {
				setGraphic(null);
				setText(null); //$NON-NLS-1$
			}
		}
	}
}
