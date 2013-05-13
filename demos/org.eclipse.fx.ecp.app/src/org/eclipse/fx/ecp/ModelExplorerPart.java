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

import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.layout.BorderPane;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.internal.core.util.ChildrenListImpl;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.ecp.spi.core.util.InternalChildrenList;
import org.eclipse.fx.ecp.dummy.DummyWorkspace;
import org.eclipse.fx.ecp.provider.ECPItemProviderAdapterFactory;
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
	public ModelExplorerPart(BorderPane parent, final MApplication application, ECPProjectManager projectManager) {

		TreeView<Object> treeView = new TreeView<>();

//		TreeItem<Object> root = new TreeItem<Object>();
//
//		for (final ECPProject project : projectManager.getProjects()) {
//
//			final InternalProvider provider = (InternalProvider) project.getProvider();
//
//			TreeItem<Object> projectTreeItem = new TreeItem<Object>(project);
//
//			for (Object element : project.getElements()) {
//				TreeItem<Object> elementTreeItem = new ModelElementTreeItem(element, provider);
//				projectTreeItem.getChildren().add(elementTreeItem);
//			}
//
//			root.getChildren().add(projectTreeItem);
//		}
//
//		treeView.setRoot(root);
		treeView.setShowRoot(false);

//		treeView.setCellFactory(new Callback<TreeView<Object>, TreeCell<Object>>() {
//
//			@Override
//			public TreeCell<Object> call(TreeView<Object> arg0) {
//				return new TreeCell<Object>() {
//
//					@Override
//					protected void updateItem(Object item, boolean empty) {
//						super.updateItem(item, empty);
//						if (item instanceof ECPProject) {
//							ECPProject project = (ECPProject) item;
//							setText(project.getName());
//						} else if (item != null) {
//							ComposedAdapterFactory adapterFactory = DummyWorkspace.INSTANCE.getAdapterFactory();
//							IItemLabelProvider labelProvider = (IItemLabelProvider) adapterFactory.adapt(item, IItemLabelProvider.class);
//							if (labelProvider != null)
//								setText(labelProvider.getText(item));
//							else
//								setText(item.toString());
//						} else {
//							setText(null);
//						}
//					}
//
//				};
//			}
//
//		});
		
		//ComposedAdapterFactory adapterFactory = DummyWorkspace.INSTANCE.getAdapterFactory();
		
		ECPItemProviderAdapterFactory adapterFactory = new ECPItemProviderAdapterFactory(DummyWorkspace.INSTANCE.getProvider());
		
		AdapterFactoryTreeItem rootItem = new AdapterFactoryTreeItem(projectManager, treeView, adapterFactory);
		
		treeView.setRoot(rootItem);
		
		treeView.setCellFactory(new AdapterFactoryTreeCellFactory(adapterFactory));

		parent.setCenter(treeView);

	}

}
