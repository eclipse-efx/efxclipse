package org.eclipse.fx.ecp.dialogs;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.stage.Stage;
import javafx.util.Callback;

import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.edit.command.AddCommand;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.ecp.ECPUtil;

public class NewModelElementDialogController {

	@FXML
	TreeView<ENamedElement> treeView;

	@FXML
	Button createButton;

	Stage stage;
	ECPProject project;

	public NewModelElementDialogController(Stage stage, ECPProject project) {
		super();
		this.stage = stage;
		this.project = project;
	}

	@FXML
	public void initialize() {
		treeView.setRoot(ECPUtil.getConcreteClasses());

		treeView.setCellFactory(new Callback<TreeView<ENamedElement>, TreeCell<ENamedElement>>() {

			@Override
			public TreeCell<ENamedElement> call(TreeView<ENamedElement> treeView) {

				return new TreeCell<ENamedElement>() {

					@Override
					protected void updateItem(ENamedElement namedElement, boolean empty) {
						super.updateItem(namedElement, empty);

						if (empty) {
							setText(null);
							setGraphic(null);
						} else {
							setText(namedElement.getName());
							setGraphic(getTreeItem().getGraphic());
						}
					}

				};

			}

		});

		treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<ENamedElement>>() {

			@Override
			public void changed(ObservableValue<? extends TreeItem<ENamedElement>> arg0, TreeItem<ENamedElement> arg1,
					TreeItem<ENamedElement> arg2) {
				createButton.setDisable(!(arg2.getValue() instanceof EClass));
			}

		});

		treeView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				if (mouseEvent.getButton().equals(MouseButton.PRIMARY) && mouseEvent.getClickCount() == 2)
					doCreate();
			}
		});
	}

	@FXML
	public void doCancel() {
		stage.close();
	}

	@FXML
	public void doCreate() {
		
		TreeItem<ENamedElement> selectedItem = treeView.getSelectionModel().getSelectedItem();
		
		if (selectedItem != null && selectedItem.getValue() instanceof EClass) {
			EClass eClass = (EClass) selectedItem.getValue();
			EPackage ePackage = eClass.getEPackage();
			EObject instance = ePackage.getEFactoryInstance().create(eClass);
			EditingDomain editingDomain = project.getEditingDomain();
			
			AddCommand command = new AddCommand(editingDomain, project.getContents(), instance);
			if (command.canExecute())
				editingDomain.getCommandStack().execute(command);
			
			stage.close();
		}
		
	}

}