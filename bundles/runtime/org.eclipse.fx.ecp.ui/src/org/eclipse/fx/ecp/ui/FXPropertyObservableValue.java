package org.eclipse.fx.ecp.ui;

import javafx.beans.property.Property;
import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;

import org.eclipse.core.databinding.observable.value.AbstractObservableValue;
import org.eclipse.core.databinding.observable.value.ValueDiff;


public class FXPropertyObservableValue<T> extends AbstractObservableValue {

	Property<T> property;
	
	public FXPropertyObservableValue(Property<T> property) {
		this.property = property;
		property.addListener(new ChangeListener<T>() {

			@Override
			public void changed(ObservableValue<? extends T> observableValue, final T oldValue, final T newValue) {
				fireValueChange(new ValueDiff() {
					
					@Override
					public Object getOldValue() {
						return oldValue;
					}
					
					@Override
					public Object getNewValue() {
						return newValue;
					}
					
				});
			}
			
		});
	}

	@Override
	public Object getValueType() {
		return null;
	}

	@Override
	protected Object doGetValue() {
		return property.getValue();
	}

}
