package at.bestsolution.efxclipse.ecp.dialogs;

import java.io.IOException;
import java.net.URL;

import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EReference;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.ListView;
import javafx.scene.layout.Pane;
import javafx.stage.Stage;

public class ReferenceSelectionDialog extends Stage {

	EObject modelElement;
	EReference reference;
	
	public ReferenceSelectionDialog(EObject modelElement, EReference reference) {
		this.modelElement = modelElement;
		this.reference = reference;
		
		URL location = getClass().getResource("ReferenceSelectionDialog.fxml");
		FXMLLoader fxmlLoader = new FXMLLoader(location);
		
//		controller = new DetailsViewController();

		Controller controller = new Controller();
		
		fxmlLoader.setController(controller);

		Pane root = null;
		try {
			root = (Pane) fxmlLoader.load();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		Scene scene = new Scene(root);

		setScene(scene);
	}
	
	class Controller {
		
		@FXML
		ListView<?> listView;

		public void init() {
			ComposedAdapterFactory adapterFactory = new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE);

			
			
			System.out.println();
		}
		
		
		
	}

}
