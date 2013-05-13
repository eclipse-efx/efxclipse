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
package at.bestsolution.efxclipse.ecp;

import java.util.Collection;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.control.ListCell;
import javafx.scene.control.ListView;
import javafx.scene.image.ImageView;
import javafx.scene.layout.BorderPane;
import javafx.util.Callback;

import javax.inject.Inject;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.ECPRepositoryManager;

@SuppressWarnings("restriction")
public class RepositoryBrowserPart {

	@Inject
	public RepositoryBrowserPart(BorderPane parent, final MApplication application, ECPRepositoryManager repositoryManager) {

		ListView<ECPRepository> listView = new ListView<>();

		listView.setCellFactory(new Callback<ListView<ECPRepository>, ListCell<ECPRepository>>() {

			@Override
			public ListCell<ECPRepository> call(ListView<ECPRepository> arg0) {
				return new ListCell<ECPRepository>() {
					@Override
					protected void updateItem(ECPRepository repository, boolean empty) {
						super.updateItem(repository, empty);
						if (repository != null) {
							setText(repository.getName());
							setGraphic(new ImageView("platform:/plugin/at.bestsolution.efxclipse.ecp.app/icons/repository.gif"));
						}
					}
				};
			}
		});

		Collection<ECPRepository> repositories = repositoryManager.getRepositories();

		ObservableList<ECPRepository> repositoriesList = FXCollections.observableArrayList(repositories);

		listView.setItems(repositoriesList);

		parent.setCenter(listView);

	}

}
