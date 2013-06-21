package org.eclipse.fx.ecp.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.ecp.core.ECPProject;

public class SaveProjectHandler {

	@CanExecute
	public boolean canSaveProject(@Optional ECPProject project) {
		return project != null && project.hasDirtyContents();
	}

	@Execute
	public void saveProject(ECPProject project) {
		project.saveContents();
	}

}
