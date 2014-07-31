package org.eclipse.fx.ide.gradient.app;

import javafx.beans.value.ObservableValue;
import javafx.scene.layout.Pane;

import org.eclipse.emf.edit.domain.EditingDomain;
import org.eclipse.fx.ide.gradient.model.gradient.FxGradient;
import org.eclipse.fx.ide.gradient.model.gradient.FxStop;

public interface GradientViewer {
	Pane getControl();
	
	void bind(EditingDomain editingDomain, ObservableValue<FxGradient> gradient);
}
