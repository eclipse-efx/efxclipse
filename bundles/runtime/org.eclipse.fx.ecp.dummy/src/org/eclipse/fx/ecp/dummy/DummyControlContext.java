package org.eclipse.fx.ecp.dummy;

import org.eclipse.core.databinding.DataBindingContext;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.ecp.edit.ECPControlContext;
import org.eclipse.emf.edit.domain.EditingDomain;

public class DummyControlContext implements ECPControlContext {
	
	EObject modelElement;
	
	public DummyControlContext(EObject modelElement) {
		super();
		this.modelElement = modelElement;
	}

	@Override
	public DataBindingContext getDataBindingContext() {
		throw new UnsupportedOperationException();
	}

	@Override
	public EditingDomain getEditingDomain() {
		return DummyWorkspace.INSTANCE.getEditingDomain();
	}

	@Override
	public void addModelElement(EObject eObject, EReference eReference) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EObject getModelElement() {
		return modelElement;
	}

	@Override
	public EObject getNewElementFor(EReference eReference) {
		throw new UnsupportedOperationException();
	}

	@Override
	public EObject getExistingElementFor(EReference eReference) {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean isRunningAsWebApplication() {
		return false;
	}

	@Override
	public void openInNewContext(EObject eObject) {
		throw new UnsupportedOperationException();
	}

}
