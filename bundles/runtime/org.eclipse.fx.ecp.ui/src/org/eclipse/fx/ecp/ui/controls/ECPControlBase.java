package org.eclipse.fx.ecp.ui.controls;

import javafx.scene.control.Control;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.notify.impl.AdapterImpl;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EStructuralFeature;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.IItemPropertyDescriptor;
import org.eclipse.fx.ecp.ui.ECPControlContext;

public abstract class ECPControlBase extends Control {

	protected final EObject modelElement;
	protected final EStructuralFeature feature;
	protected final EditingDomain editingDomain;
	protected final IItemPropertyDescriptor propertyDescriptor;
	protected final Adapter modelElementAdapter;
	protected final ECPControlContext context;

	public ECPControlBase(IItemPropertyDescriptor propertyDescriptor, ECPControlContext context) {
		this.modelElement = context.getModelElement();
		this.feature = (EStructuralFeature) propertyDescriptor.getFeature(modelElement);
		this.editingDomain = context.getEditingDomain();
		this.propertyDescriptor = propertyDescriptor;
		this.context = context;
		
		modelElementAdapter = createModelElementAdapter();
		
		modelElement.eAdapters().add(modelElementAdapter);
	}

	protected Adapter createModelElementAdapter() {
		return new AdapterImpl() {
			
			@Override
			public void notifyChanged(Notification msg) {
				if (msg.getFeature() == feature)
					update();
			}

		};
	}

	protected abstract void update();

	public void dispose() {
		modelElement.eAdapters().remove(modelElementAdapter);
	}

}
