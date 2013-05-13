package org.eclipse.fx.ecp.dummy;

import org.eclipse.emf.ecp.core.ECPProvider;
import org.eclipse.emf.ecp.core.ECPRepository;
import org.eclipse.emf.ecp.core.util.ECPElement;
import org.eclipse.emf.ecp.core.util.ECPModelContext;
import org.eclipse.emf.ecp.core.util.ECPProperties;

public class DummyRepository implements ECPRepository {
	
	DummyWorkspace workspace = DummyWorkspace.INSTANCE;
	
	String name;
	
	@Override
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}

	@Override
	public String getType() {
		return ECPRepository.TYPE;
	}

	@Override
	public int compareTo(ECPElement element) {
		throw new UnsupportedOperationException();
	}

	@Override
	public ECPModelContext getContext() {
		throw new UnsupportedOperationException();
	}

	@Override
	public ECPProvider getProvider() {
		return workspace.getProvider();
	}

	@Override
	public ECPProperties getProperties() {
		throw new UnsupportedOperationException();
	}

	@Override
	public boolean canDelete() {
		return false;
	}

	@Override
	public void delete() {
		throw new UnsupportedOperationException();
	}

	@Override
	public Object getAdapter(Class adapter) {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getLabel() {
		throw new UnsupportedOperationException();
	}

	@Override
	public String getDescription() {
		throw new UnsupportedOperationException();
	}

}
