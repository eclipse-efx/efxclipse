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

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import javafx.beans.value.ChangeListener;
import javafx.beans.value.ObservableValue;
import javafx.collections.ListChangeListener;
import javafx.event.EventHandler;
import javafx.scene.control.Control;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.util.observer.ECPProjectContentChangedObserver;
import org.eclipse.emf.ecp.internal.core.util.observer.ECPObserverBusImpl;
import org.eclipse.fx.ecp.dummy.DummyProjectManager;
import org.eclipse.fx.ecp.dummy.DummyWorkspace;
import org.eclipse.fx.ecp.provider.ECPItemProviderAdapterFactory;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.ui.services.PopupMenuService;

@SuppressWarnings("restriction")
public class ModelExplorerPart {

	@Inject
	public ModelExplorerPart(BorderPane parent, ECPProjectManager projectManager_, final MApplication application,
			final ECPModelElementOpener modelElementOpener, PopupMenuService<Control> popupMenuService) {

		final TreeView<Object> treeView = new TreeView<>();

		popupMenuService.registerContextMenu(treeView, "org.eclipse.fx.ecp.app.modelexplorer.popupmenu");

		treeView.setShowRoot(false);

		ECPItemProviderAdapterFactory adapterFactory = new ECPItemProviderAdapterFactory(DummyWorkspace.INSTANCE.getProvider());

		final ECPProjectManager projectManager = new DummyProjectManager();

		final AdapterFactoryTreeItem rootItem = new AdapterFactoryTreeItem(projectManager, treeView, adapterFactory);

		ECPObserverBusImpl.getInstance().register(new ECPProjectContentChangedObserver() {

			@Override
			public Collection<Object> objectsChanged(ECPProject project, Collection<Object> objects) {
				for (TreeItem<Object> child : rootItem.getChildren()) {
					((AdapterFactoryTreeItem) child).updateChildren();
				}
				return objects;
			}

		});

		treeView.setRoot(rootItem);

		treeView.getSelectionModel().selectedItemProperty().addListener(new ChangeListener<TreeItem<Object>>() {

			@Override
			public void changed(ObservableValue<? extends TreeItem<Object>> arg0, TreeItem<Object> arg1, TreeItem<Object> arg2) {
				System.out.println(arg2);
				application.getContext().set(ECPProject.class,
						(arg2 != null && arg2.getValue() instanceof ECPProject) ? (ECPProject) arg2.getValue() : null);

			}

		});

		treeView.getSelectionModel().getSelectedItems().addListener(new ListChangeListener<TreeItem<Object>>() {

			@Override
			public void onChanged(ListChangeListener.Change<? extends TreeItem<Object>> arg0) {
				Set<Object> selectedItems = new HashSet<>();
				for (TreeItem<Object> treeItem : arg0.getList())
					selectedItems.add(treeItem.getValue());
				application.getContext().set("modelExplorer.selectedItems", selectedItems);
			}

		});

		AdapterFactoryTreeCellFactory cellFactory = new AdapterFactoryTreeCellFactory(adapterFactory);

		cellFactory.addCellCreationListener(new CellDragAdapter());

		treeView.setCellFactory(cellFactory);

		treeView.setOnMouseClicked(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent mouseEvent) {
				if (mouseEvent.getButton().equals(MouseButton.PRIMARY) && mouseEvent.getClickCount() == 2) {
					TreeItem<Object> selectedItem = treeView.getSelectionModel().getSelectedItem();
					Object modelElement = selectedItem != null ? selectedItem.getValue() : null;
					if (modelElement instanceof EObject)
						modelElementOpener.openModelElement((EObject) modelElement);
				}
			}

		});

		parent.setCenter(treeView);

	}

}
