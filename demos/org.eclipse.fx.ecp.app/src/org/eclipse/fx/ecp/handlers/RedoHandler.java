package org.eclipse.fx.ecp.handlers;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.emf.edit.domain.EditingDomain;

public class RedoHandler {
	
	@CanExecute
	public boolean canRedo() {
		// TODO get this from current selection / active part
		EditingDomain editingDomain = null; //DummyWorkspace.INSTANCE.getEditingDomain();
		return editingDomain.getCommandStack().canRedo();
	}
	
	@Execute
	public void redo() {
		// TODO get this from current selection / active part
		EditingDomain editingDomain = null; //DummyWorkspace.INSTANCE.getEditingDomain();
		editingDomain.getCommandStack().redo();
	}
	
}
