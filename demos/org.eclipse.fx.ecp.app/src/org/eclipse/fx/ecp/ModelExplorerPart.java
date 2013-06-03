/******************************************************************************* 
 * Copyright (c) 2012 TESIS DYNAware GmbH and others. 
 * All rights reserved. This program and the accompanying materials 
 * are made available under the terms of the Eclipse Public License v1.0 
 * which accompanies this distribution, and is available at 
 * http://www.eclipse.org/legal/epl-v10.html 
 * 
 * Contributors: 
 *     Torsten Sommer <torsten.sommer@tesis.de> - initial API and implementation 
 *******************************************************************************/
package org.eclipse.fx.ecp;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.control.Cell;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

import javax.inject.Inject;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.fx.ecp.dummy.DummyProjectManager;
import org.eclipse.fx.ecp.dummy.DummyWorkspace;
import org.eclipse.fx.ecp.provider.ECPItemProviderAdapterFactory;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;

@SuppressWarnings("restriction")
public class ModelExplorerPart {

//	static class ModelElementTreeItem extends TreeItem<Object> {
//		ModelElementTreeItem(Object item, InternalProvider provider) {
//			super(item);
//			InternalChildrenList childrenList = new ChildrenListImpl(item);
//			provider.fillChildren(null, item, childrenList);
//			for (Object child : childrenList.getChildren()) {
//				getChildren().add(new ModelElementTreeItem(child, provider));
//			}
//		}
//	}

	@Inject
	public ModelExplorerPart(BorderPane parent, ECPProjectManager projectManager, final ECPModelElementOpener modelElementOpener) {

		final TreeView<Object> treeView = new TreeView<>();

		treeView.setShowRoot(false);

		ECPItemProviderAdapterFactory adapterFactory = new ECPItemProviderAdapterFactory(DummyWorkspace.INSTANCE.getProvider());

		projectManager = new DummyProjectManager();
		
		AdapterFactoryTreeItem rootItem = new AdapterFactoryTreeItem(projectManager, treeView, adapterFactory);

		treeView.setRoot(rootItem);

		AdapterFactoryTreeCellFactory cellFactory = new AdapterFactoryTreeCellFactory(adapterFactory);

		cellFactory.addCellCreationListener(new CellDragAdapter());

		cellFactory.addCellUpdateListener(new ICellUpdateListener() {

			@Override
			public void updateItem(Cell<?> cell, Object item, boolean empty) {

				final ContextMenu contextMenu = new ContextMenu();
				cell.setContextMenu(contextMenu);
				MenuItem menuItem = new MenuItem("new element");
				contextMenu.getItems().add(menuItem);
				
				menuItem.setOnAction(new EventHandler<ActionEvent>() {
					
					@Override
					public void handle(ActionEvent arg0) {
						Stage dialog = new Stage();
						dialog.initModality(Modality.APPLICATION_MODAL);
//						dialog.initStyle(StageStyle.UTILITY);
						
						VBox group = new VBox();
						
						Text text = new Text(25, 25, "Hello World!");
						group.getChildren().add(text);
						
						TreeView<Object> treeView2 = new TreeView<>();
						group.getChildren().add(treeView2);
						treeView2.setShowRoot(false);
						
						ItemProvider rootItem = new ItemProvider();
						
						for (String nsURI : Registry.INSTANCE.keySet()) {
							EPackage ePackage = Registry.INSTANCE.getEPackage(nsURI);
							rootItem.getChildren().add(ePackage);
						}
						
						ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory();
						composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
						composedAdapterFactory.addAdapterFactory(new ComposedAdapterFactory(ComposedAdapterFactory.Descriptor.Registry.INSTANCE));
						
						treeView2.setRoot(new AdapterFactoryTreeItem(rootItem, treeView, composedAdapterFactory));
						AdapterFactoryTreeCellFactory treeCellFactory = new AdapterFactoryTreeCellFactory(composedAdapterFactory);
						treeView2.setCellFactory(treeCellFactory);
						
						Scene scene = new Scene(group);
						dialog.setScene(scene);
						dialog.showAndWait();
					}
					
				});
				
//				contextMenu.setOnShowing(new EventHandler<WindowEvent>() {
//
//					@Override
//					public void handle(WindowEvent arg0) {
//						// TODO Auto-generated method stub
//
//					}
//
//				});
			}

		});

		treeView.setCellFactory(cellFactory);

		treeView.setOnMouseClicked(new EventHandler<MouseEvent>() {
			@Override
			public void handle(MouseEvent mouseEvent) {
				if (mouseEvent.getButton().equals(MouseButton.PRIMARY)) {
					if (mouseEvent.getClickCount() == 2) {
						System.out.println("Double clicked");
						TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
						Object modelElement = selectedItem.getValue();
						if(modelElement instanceof EObject)
							modelElementOpener.openModelElement((EObject) modelElement);
					}
				}
			}
		});

		parent.setCenter(treeView);

	}

}
