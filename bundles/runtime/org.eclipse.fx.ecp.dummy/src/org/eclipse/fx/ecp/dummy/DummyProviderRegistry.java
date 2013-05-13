package org.eclipse.fx.ecp.dummy;

import java.util.Collection;
import java.util.Collections;

import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPProviderRegistry;
import org.eclipse.emf.ecp.core.util.observer.ECPProviderRegistryObserver;

public class DummyProviderRegistry implements ECPProviderRegistry {

	DummyWorkspace workspace = DummyWorkspace.INSTANCE;

	@Override
	public ECPProvider getProvider(Object adaptable) {
		return workspace.getProvider();
	}

	@Override
	public ECPProvider getProvider(String name) {
		return workspace.getProvider();
	}

	@Override
	public Collection<ECPProvider> getProviders() {
		ECPProvider provider = workspace.getProvider();
		return Collections.singleton(provider);
	}

	@Override
	public void addProvider(ECPProvider provider) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void removeProvider(String name) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void addObserver(ECPProviderRegistryObserver changeObserver) {
		// TODO fix this
		// workspace.addProvidersChangedObserver(changeObserver);
	}

	@Override
	public void removeObserver(ECPProviderRegistryObserver changeObserver) {
		// TODO fix this
		// workspace.removeProvidersChangedObserver(changeObserver);
	}

}
