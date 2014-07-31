package org.eclipse.fx.ide.gradient.app;

import javafx.collections.ObservableList;
import javafx.scene.layout.Pane;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.ide.gradient.model.gradient.FxStop;

public interface StopEditor {
	Pane getControl();
	
	void bind(EditingDomain editingDomain, ObservableList<FxStop> stops);
}
