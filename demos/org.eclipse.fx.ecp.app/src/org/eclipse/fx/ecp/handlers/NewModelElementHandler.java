package org.eclipse.fx.ecp.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.ecp.dialogs.EClassSelectionDialog;

public class NewModelElementHandler {

	protected Resource resource;
	protected EditingDomain editingDomain;

	@CanExecute
	public boolean canAddNewElement(@Optional Resource resource, @Optional EditingDomain editingDomain) {
		this.resource = resource;
		this.editingDomain = editingDomain;
		return resource != null && editingDomain != null;
	}

	@Execute
	public void newElement() {
		EClassSelectionDialog diag = new EClassSelectionDialog(resource, editingDomain);
		diag.showAndWait();
	}

}
