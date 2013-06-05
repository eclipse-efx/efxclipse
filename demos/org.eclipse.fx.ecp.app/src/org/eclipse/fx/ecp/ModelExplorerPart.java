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

import java.net.URL;
import java.util.Collection;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.Cell;
import javafx.scene.control.ContextMenu;
import javafx.scene.control.MenuItem;
import javafx.scene.control.TreeCell;
import javafx.scene.control.TreeItem;
import javafx.scene.control.TreeView;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseButton;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.core.runtime.Platform;
import org.eclipse.emf.ecore.EClassifier;
import org.eclipse.emf.ecore.ENamedElement;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.EPackage;
import org.eclipse.emf.ecore.EPackage.Registry;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.util.observer.ECPProjectContentChangedObserver;
import org.eclipse.emf.ecp.internal.core.util.observer.ECPObserverBusImpl;
import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.emf.edit.provider.ComposedAdapterFactory;
import org.eclipse.emf.edit.provider.ItemProvider;
import org.eclipse.emf.edit.provider.ReflectiveItemProviderAdapterFactory;
import org.eclipse.fx.ecp.dialogs.EClassSelectionDialog;
import org.eclipse.fx.ecp.dummy.DummyProjectManager;
import org.eclipse.fx.ecp.dummy.DummyWorkspace;
import org.eclipse.fx.ecp.provider.ECPItemProviderAdapterFactory;
import org.eclipse.fx.ecp.ui.ECPModelElementOpener;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryCellFactory.ICellUpdateListener;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeCellFactory;
import org.eclipse.fx.emf.edit.ui.AdapterFactoryTreeItem;
import org.eclipse.fx.emf.edit.ui.dnd.CellDragAdapter;
import org.osgi.framework.Bundle;

@SuppressWarnings("restriction")
public class ModelExplorerPart {

	// static class ModelElementTreeItem extends TreeItem<Object> {
	// ModelElementTreeItem(Object item, InternalProvider provider) {
	// super(item);
	// InternalChildrenList childrenList = new ChildrenListImpl(item);
	// provider.fillChildren(null, item, childrenList);
	// for (Object child : childrenList.getChildren()) {
	// getChildren().add(new ModelElementTreeItem(child, provider));
	// }
	// }
	// }

	@Inject
	public ModelExplorerPart(BorderPane parent, ECPProjectManager projectManager_, final ECPModelElementOpener modelElementOpener) {

		final TreeView<Object> treeView = new TreeView<>();

		treeView.setShowRoot(false);

		ECPItemProviderAdapterFactory adapterFactory = new ECPItemProviderAdapterFactory(DummyWorkspace.INSTANCE.getProvider());

		final ECPProjectManager projectManager = new DummyProjectManager();

		final AdapterFactoryTreeItem rootItem = new AdapterFactoryTreeItem(projectManager, treeView, adapterFactory);
		
		ECPObserverBusImpl.getInstance().register(new ECPProjectContentChangedObserver() {
			
			@Override
			public Collection<Object> objectsChanged(ECPProject project, Collection<Object> objects) {
				for (TreeItem<Object> child : rootItem.getChildren()) {
					((AdapterFactoryTreeItem)child).updateChildren();
				}
				return objects;
			}
			
		});

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
						// dialog.initStyle(StageStyle.UTILITY);

						VBox group = new VBox();

						Text text = new Text(25, 25, "Hello World!");
						group.getChildren().add(text);

						TreeView<ENamedElement> treeView2 = new TreeView<>();
						group.getChildren().add(treeView2);
						treeView2.setShowRoot(false);

						ItemProvider rootItem = new ItemProvider();

						TreeItem<ENamedElement> root = new TreeItem<>();

						Bundle bundle = Platform.getBundle("org.eclipse.fx.ecp.app");
						URL entry = bundle.getEntry("icons/EPackage.gif");
						Image image = new Image(entry.toExternalForm());
						
						ComposedAdapterFactory composedAdapterFactory = new ComposedAdapterFactory();
						composedAdapterFactory.addAdapterFactory(new ReflectiveItemProviderAdapterFactory());
						composedAdapterFactory.addAdapterFactory(new ComposedAdapterFactory(
								ComposedAdapterFactory.Descriptor.Registry.INSTANCE));

						for (String nsURI : Registry.INSTANCE.keySet()) {
							EPackage ePackage = Registry.INSTANCE.getEPackage(nsURI);
							rootItem.getChildren().add(ePackage);
							TreeItem<ENamedElement> ePackageItem = new TreeItem<ENamedElement>(ePackage, new ImageView(image));
							root.getChildren().add(ePackageItem);

							for (EClassifier eClassifier : ePackage.getEClassifiers()) {
								ePackageItem.getChildren().add(new TreeItem<ENamedElement>(eClassifier));
							}

						}

						treeView2.setRoot(ECPUtil.getConcreteClasses());

						treeView2.setCellFactory(new Callback<TreeView<ENamedElement>, TreeCell<ENamedElement>>() {

							@Override
							public TreeCell<ENamedElement> call(TreeView<ENamedElement> arg0) {
								TreeCell<ENamedElement> treeCell = new TreeCell<ENamedElement>() {
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

								return treeCell;
							}

						});

						// treeView2.setRoot(new AdapterFactoryTreeItem(rootItem, treeView,
						// composedAdapterFactory));

						// AdapterFactoryTreeCellFactory treeCellFactory = new
						// AdapterFactoryTreeCellFactory(composedAdapterFactory);
						// treeView2.setCellFactory(treeCellFactory);

//						Scene scene = new Scene(group);						
//						dialog.setScene(scene);
//						dialog.showAndWait();
						
						ECPProject proj = projectManager.getProjects().iterator().next();
						EditingDomain editingDomain = DummyWorkspace.INSTANCE.getEditingDomain();
						
						EClassSelectionDialog diag = new EClassSelectionDialog(proj, editingDomain);
						diag.showAndWait();
					}

				});

				// contextMenu.setOnShowing(new EventHandler<WindowEvent>() {
				//
				// @Override
				// public void handle(WindowEvent arg0) {
				// // TODO Auto-generated method stub
				//
				// }
				//
				// });
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
						if (modelElement instanceof EObject)
							modelElementOpener.openModelElement((EObject) modelElement);
					}
				}
			}
		});

		parent.setCenter(treeView);

	}

}
