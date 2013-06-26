package org.eclipse.fx.ecp.handlers;

import java.io.File;
import java.io.IOException;

import javafx.stage.FileChooser;

import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;

public class OpenFileHandler {

	@Execute
	public void openFile(MApplication application, EditingDomain editingDomain) throws IOException {
		FileChooser fileChooser = new FileChooser();
		
		fileChooser.setInitialDirectory(new File("/Users/tors10/Development/org.eclipse.fx/repositories/org.eclipse.efxclipse/demos/org.eclipse.fx.ecp.app/resources/"));
		
		fileChooser.setInitialFileName("project.xmi");

		File file = fileChooser.showOpenDialog(null);
		
		editingDomain.getResourceSet().getResources().clear();
		
		URI uri = URI.createFileURI(file.getAbsolutePath());
		
		Resource resource = editingDomain.getResourceSet().getResource(uri, true);
		
		editingDomain.getCommandStack().flush();
		
		application.getContext().set(Resource.class, resource);
	}

}
