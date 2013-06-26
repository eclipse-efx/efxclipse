package org.eclipse.fx.ecp.handlers;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import org.eclipse.e4.core.di.annotations.CanExecute;
import org.eclipse.e4.core.di.annotations.Execute;
import org.eclipse.e4.core.di.annotations.Optional;
import org.eclipse.emf.common.command.BasicCommandStack;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.edit.domain.EditingDomain;

public class SaveHandler {

	protected EditingDomain editingDomain;

	@CanExecute
	public boolean canSaveProject(@Optional EditingDomain editingDomain) {
		this.editingDomain = editingDomain;

		if (editingDomain != null)
			return ((BasicCommandStack) editingDomain.getCommandStack()).isSaveNeeded();

		return false;
	}

	@Execute
	public void saveProject() throws IOException {
		// Save only resources that have actually changed.
		final Map<Object, Object> saveOptions = new HashMap<Object, Object>();
		saveOptions.put(Resource.OPTION_SAVE_ONLY_IF_CHANGED, Resource.OPTION_SAVE_ONLY_IF_CHANGED_MEMORY_BUFFER);

		for (Resource resource : editingDomain.getResourceSet().getResources()) {
			if (!editingDomain.isReadOnly(resource))
				resource.save(saveOptions);
		}

		((BasicCommandStack) editingDomain.getCommandStack()).saveIsDone();
	}

}
