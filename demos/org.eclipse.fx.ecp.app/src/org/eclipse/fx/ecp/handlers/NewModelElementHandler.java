package org.eclipse.fx.ecp.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.fx.ecp.dialogs.EClassSelectionDialog;


public class NewModelElementHandler {
	
	@CanExecute
	public boolean canAddNewElement(@Optional ECPProject project) {
		return project != null;
	}

	@Execute
	public void newElement(ECPProject project) {
		EClassSelectionDialog diag = new EClassSelectionDialog(project);
		diag.showAndWait();
	}

}
