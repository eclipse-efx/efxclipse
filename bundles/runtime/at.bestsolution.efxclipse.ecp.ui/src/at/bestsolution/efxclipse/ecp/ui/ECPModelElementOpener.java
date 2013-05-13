package at.bestsolution.efxclipse.ecp.ui;

import org.eclipse.e4.ui.model.application.MApplication;
import org.eclipse.e4.ui.workbench.modeling.EModelService;
import org.eclipse.e4.ui.workbench.modeling.EPartService;
import org.eclipse.emf.ecore.EObject;

public interface ECPModelElementOpener {

	void openModelElement(EObject modelElement, MApplication application, EModelService modelService, EPartService partService);
	
}
