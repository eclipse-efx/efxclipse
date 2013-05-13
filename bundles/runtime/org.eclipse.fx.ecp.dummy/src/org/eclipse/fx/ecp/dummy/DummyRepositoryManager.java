package org.eclipse.fx.ecp.dummy;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.ECPRepositoryManager;
import org.eclipse.emf.ecp.core.util.ECPProperties;
import org.eclipse.emf.ecp.core.util.observer.ECPRepositoryManagerObserver;

public class DummyRepositoryManager implements ECPRepositoryManager {

	DummyWorkspace workspace = DummyWorkspace.INSTANCE;

	@Override
	public ECPRepository getRepository(Object adaptable) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ECPRepository getRepository(String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public Collection<ECPRepository> getRepositories() {
		return Collections.singleton((ECPRepository) workspace.getRepository());
	}

	@Override
	public ECPRepository addRepository(ECPProvider provider, String name, String label, String description, ECPProperties properties) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addObserver(ECPRepositoryManagerObserver changeObserver) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeObserver(ECPRepositoryManagerObserver changeObserver) {
		throw new UnsupportedOperationException();
	}

}
