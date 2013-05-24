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

import javafx.event.EventHandler;
import javafx.scene.control.Cell;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.stage.WindowEvent;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.internal.core.util.ChildrenListImpl;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.ecp.spi.core.util.InternalChildrenList;
import org.eclipse.fx.ecp.dummy.DummyWorkspace;
import org.eclipse.fx.ecp.provider.ECPItemProviderAdapterFactory;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryCellFactory.ICellCreationListener;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;

@SuppressWarnings("restriction")
public class ModelExplorerPart {

	static class ModelElementTreeItem extends TreeItem<Object> {
		ModelElementTreeItem(Object item, InternalProvider provider) {
			super(item);
			InternalChildrenList childrenList = new ChildrenListImpl(item);
			provider.fillChildren(null, item, childrenList);
			for (Object child : childrenList.getChildren()) {
				getChildren().add(new ModelElementTreeItem(child, provider));
			}
		}
	}

	@Inject
	public ModelExplorerPart(BorderPane parent, final MApplication application, ECPProjectManager projectManager,
			final EModelService modelService, final EPartService partService, final ECPModelElementOpener modelElementOpener) {

		final TreeView<Object> treeView = new TreeView<>();

		// treeView.setShowRoot(false);

		ECPItemProviderAdapterFactory adapterFactory = new ECPItemProviderAdapterFactory(DummyWorkspace.INSTANCE.getProvider());

		AdapterFactoryTreeItem rootItem = new AdapterFactoryTreeItem(projectManager, treeView, adapterFactory);

		treeView.setRoot(rootItem);

		AdapterFactoryTreeCellFactory cellFactory = new AdapterFactoryTreeCellFactory(adapterFactory);

//		cellFactory.addCellCreationListener(new ICellCreationListener() {
//
//			@Override
//			public void cellCreated(Cell<?> cell) {
//				// TODO Auto-generated method stub
//			}
//
//		});

//		cellFactory.addCellUpdateListener(new ICellUpdateListener() {
//
//			@Override
//			public void updateItem(Cell<?> cell, Object item, boolean empty) {
//				System.out.println(cell + " updated");
//
//				final ContextMenu contextMenu = new ContextMenu();
//				cell.setContextMenu(contextMenu);
//				contextMenu.getItems().add(new MenuItem());
//				contextMenu.setOnShowing(new EventHandler<WindowEvent>() {
//
//					@Override
//					public void handle(WindowEvent arg0) {
//						// TODO Auto-generated method stub
//
//					}
//
//				});
//			}
//
//		});

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
							modelElementOpener.openModelElement((EObject) modelElement, application, modelService, partService);
					}
				}
			}
		});

		parent.setCenter(treeView);

	}

}
