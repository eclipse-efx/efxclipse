/**
 *  Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 *  All rights reserved. This program and the accompanying materials 
 *  are made available under the terms of the Eclipse Public License v1.0 
 *  which accompanies this distribution, and is available at 
 *  http://www.eclipse.org/legal/epl-v10.html 
 *  
 *  Contributors: 
 *      Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation
 */
package org.eclipse.fx.emf.databinding.edit;

import javafx.beans.property.ObjectPropertyBase;
import javafx.beans.property.Property;

import org.eclipse.emf.common.command.Command;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.command.SetCommand;
import org.eclipse.emf.edit.domain.EditingDomain;

public class EMFEditFXProperties {

	/**
	 * Returns a {@link Property} for the given {@link EStructuralFeature}
	 * 
	 * @param editingDomain the editing domain
	 * @param feature the feature instance the property is created for
	 * @return a value property for the given {@link EStructuralFeature}
	 */
	public static <T> Property<T> value(EditingDomain editingDomain, EObject eObject, EStructuralFeature feature) {
		return new EObjectProperty<>(editingDomain, eObject, feature);
	}

	public static <T> EListItemProperty<T> listItem(EditingDomain editingDomain, EObject eObject, EStructuralFeature feature, int index) {
		return new EListItemProperty<>(editingDomain, eObject, feature, index);
	}

	private static class EObjectProperty<T> extends ObjectPropertyBase<T> {

		final private EObject eObject;
		final private EStructuralFeature feature;
		final private EditingDomain editingDomain;

		private EObjectProperty(EditingDomain editingDomain, EObject eObject, EStructuralFeature feature) {
			super();
			this.eObject = eObject;
			this.feature = feature;
			this.editingDomain = editingDomain;

			eObject.eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					fireValueChangedEvent();
				}
			});
		}

		@Override
		public void setValue(T newValue) {
			Command command = SetCommand.create(editingDomain, eObject, feature, newValue);
			if (command.canExecute())
				editingDomain.getCommandStack().execute(command);
		}

		@Override
		@SuppressWarnings("unchecked")
		public T getValue() {
			return (T) eObject.eGet(feature);
		}

		@Override
		public Object getBean() {
			return eObject;
		}

		@Override
		public String getName() {
			return feature.getName();
		}

	}

	public static class EListItemProperty<T> extends ObjectPropertyBase<T> {

		final private EObject eObject;
		final private EStructuralFeature feature;
		final private EditingDomain editingDomain;
		final private EList<T> eList;
		private int index;

		@SuppressWarnings("unchecked")
		private EListItemProperty(EditingDomain editingDomain, final EObject eObject, final EStructuralFeature feature, int initialIndex) {
			super();
			this.eObject = eObject;
			this.feature = feature;
			this.editingDomain = editingDomain;
			this.eList = (EList<T>) eObject.eGet(feature);
			this.index = initialIndex;

			eObject.eAdapters().add(new AdapterImpl() {
				@Override
				public void notifyChanged(Notification msg) {
					if (msg.getFeature() == feature) {

						switch (msg.getEventType()) {
						case Notification.ADD:
							break;
						case Notification.MOVE: {
							int oldIndex = ((Integer) msg.getOldValue()).intValue();
							int position = msg.getPosition();
							if (oldIndex == index) 
								index = position;
							else if (oldIndex > index && position <= index)
								index++;
							else if (oldIndex < index && position >= index)
								index--;
							break;
						}
						case Notification.REMOVE:
							int position = msg.getPosition();
							if (index == position) {
								index = -1;
								eObject.eAdapters().remove(this);
							} else if (index > position) {
								index--;
							}
							break;
						case Notification.ADD_MANY:
							throw new RuntimeException("ADD_MANY is currently not supported");
						case Notification.REMOVE_MANY:
							throw new RuntimeException("REMOVE_MANY is currently not supported");
						}

						fireValueChangedEvent();

					}

				}
			});
		}

		@Override
		public void setValue(T newValue) {
			Command command = SetCommand.create(editingDomain, eObject, feature, newValue, index);
			if (command.canExecute())
				editingDomain.getCommandStack().execute(command);
		}

		@Override
		public T getValue() {
			if (index >= 0 && index <= eList.size())
				return (T) eList.get(index);
			else
				return null;
		}

		@Override
		public Object getBean() {
			return eObject;
		}

		@Override
		public String getName() {
			return feature.getName();
		}

		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}

	}

}
