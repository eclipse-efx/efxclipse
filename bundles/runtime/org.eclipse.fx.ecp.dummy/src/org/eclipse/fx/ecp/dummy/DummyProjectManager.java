package org.eclipse.fx.ecp.dummy;

import java.util.Collection;

import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.core.ECPProjectManager;
import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.util.ECPProperties;

public class DummyProjectManager implements ECPProjectManager {

	DummyWorkspace workspace = DummyWorkspace.INSTANCE;

	@Override
	public ECPProject createProject(ECPProvider provider, String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ECPProject createProject(ECPProvider provider, String name, ECPProperties properties)  {
		throw new UnsupportedOperationException();
	}

	@Override
	public ECPProject createProject(ECPRepository repository, String name, ECPProperties properties) {
		throw new UnsupportedOperationException();
	}


	@Override
	public ECPProject getProject(Object adaptable) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ECPProject getProject(String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection<ECPProject> getProjects() {
		return workspace.getProjects();
	}

	@Override
	public ECPProject createProject(ECPProject arg0, String arg1) {
		throw new UnsupportedOperationException();
	}

}
