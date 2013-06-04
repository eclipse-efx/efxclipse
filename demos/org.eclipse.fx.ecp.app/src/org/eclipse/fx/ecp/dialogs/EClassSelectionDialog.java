package org.eclipse.fx.ecp.dialogs;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.edit.domain.EditingDomain;

import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.layout.Pane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class EClassSelectionDialog extends Stage {
	
	ECPProject project;
	EditingDomain editingDomain;
	
	

	public EClassSelectionDialog(ECPProject project, EditingDomain editingDomain) {
		this.project = project;
		this.editingDomain = editingDomain;

		URL location = getClass().getResource("EClassSelectionDialog.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);

		NewModelElementDialogController controller = new NewModelElementDialogController(this, project, editingDomain);

		fxmlLoader.setController(controller);

		Pane root = null;
		try {
			root = (Pane) fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}

		setTitle("New Model Element");

		initModality(Modality.APPLICATION_MODAL);

		Scene scene = new Scene(root);

		setScene(scene);
	}

}
