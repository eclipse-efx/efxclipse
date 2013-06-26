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

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

import javafx.collections.ListChangeListener;
import javafx.event.EventHandler;
import javafx.scene.control.Control;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

import org.eclipse.e4.core.contexts.IEclipseContext;
import org.eclipse.e4.core.contexts.RunAndTrack;
import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.ECPProviderRegistry;
import org.eclipse.emf.ecp.core.exceptions.ECPProjectWithNameExistsException;
import org.eclipse.emf.edit.domain.AdapterFactoryEditingDomain;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.eclipse.fx.emf.edit.ui.dnd.EditingDomainCellDropAdapter;
import org.eclipse.fx.ui.services.PopupMenuService;

public class ResourceExplorerPart {

	protected final TreeView<Object> treeView;
	protected final ComposedAdapterFactory adapterFactory = org.eclipse.fx.ecp.ui.ECPUtil.DEFAULT_ADAPTER_FACTORY;

	@Inject
	public ResourceExplorerPart(BorderPane parent, ECPProjectManager projectManager, final MApplication application,
			final ECPModelElementOpener modelElementOpener, PopupMenuService<Control> popupMenuService, ECPProviderRegistry providerRegistry)
			throws ECPProjectWithNameExistsException {

		
		treeView = new TreeView<>();


		popupMenuService.registerContextMenu(treeView, "org.eclipse.fx.ecp.app.modelexplorer.popupmenu");

		treeView.setShowRoot(false);

		BasicCommandStack commandStack = new BasicCommandStack();


		EditingDomain editingDomain = new AdapterFactoryEditingDomain(adapterFactory, commandStack, new HashMap<Resource, Boolean>());

		application.getContext().set(EditingDomain.class, editingDomain);

		// Path path =
		// Paths.get("/Users/tors10/Development/org.eclipse.fx/repositories/org.eclipse.efxclipse/demos/org.eclipse.fx.ecp.app/resources/project.xmi");
		//
		// try {
		// WatchService watchService =
		// FileSystems.getDefault().newWatchService();
		//
		// path.register(
		// watchService,
		// StandardWatchEventKinds.ENTRY_MODIFY,
		// StandardWatchEventKinds.ENTRY_DELETE);
		// } catch (IOException e) {
		// // TODO Auto-generated catch block
		// e.printStackTrace();
		// }

		Resource resource = editingDomain
				.getResourceSet()
				.getResource(
						URI.createFileURI("/Users/tors10/Development/org.eclipse.fx/repositories/org.eclipse.efxclipse/demos/org.eclipse.fx.ecp.app/resources/project.xmi"),
						true);

		application.getContext().set(Resource.class, resource);

		final AdapterFactoryTreeItem rootItem = new AdapterFactoryTreeItem(resource, treeView, adapterFactory);

		treeView.setRoot(rootItem);

		treeView.getSelectionModel().getSelectedItems().addListener(new ListChangeListener<TreeItem<Object>>() {

			@Override
			public void onChanged(ListChangeListener.Change<? extends TreeItem<Object>> arg0) {
				Set<Object> selectedItems = new HashSet<>();
				for (TreeItem<Object> treeItem : arg0.getList())
					// TODO check for null
					selectedItems.add(treeItem.getValue());
				application.getContext().set("modelExplorer.selectedItems", selectedItems);
			}

		});

		AdapterFactoryTreeCellFactory cellFactory = new AdapterFactoryTreeCellFactory(adapterFactory);
		cellFactory.addCellCreationListener(new CellDragAdapter());
		cellFactory.addCellCreationListener(new EditingDomainCellDropAdapter(editingDomain));
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

		application.getContext().runAndTrack(new RunAndTrack() {
			
			@Override
			public boolean changed(IEclipseContext context) {
				Resource resource = context.get(Resource.class);
				final AdapterFactoryTreeItem rootItem = new AdapterFactoryTreeItem(resource, treeView, adapterFactory);
				treeView.setRoot(rootItem);
				return true;
			}
			
		});
		
		parent.setCenter(treeView);
	}

}
