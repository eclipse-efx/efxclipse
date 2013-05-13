package org.eclipse.fx.ecp.provider;

import java.util.ArrayList;
import java.util.Collection;

import org.eclipse.emf.common.notify.Adapter;
import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.common.notify.Notifier;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.IStructuredItemContentProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;

public class ECPItemProviderAdapterFactory implements AdapterFactory {

	protected InternalProvider provider;

	/**
	 * This keeps track of all the supported types checked by
	 * {@link #isFactoryForType isFactoryForType}.
	 */
	protected Collection<Object> supportedTypes = new ArrayList<Object>();
	protected ECPProviderItemProvider modelElementItemProvider;

	public ECPItemProviderAdapterFactory(InternalProvider provider) {
		this.provider = provider;
		supportedTypes.add(IStructuredItemContentProvider.class);
		supportedTypes.add(ITreeItemContentProvider.class);
		supportedTypes.add(IItemLabelProvider.class);
	}

	@Override
	public boolean isFactoryForType(Object type) {
		return supportedTypes.contains(type);
	}

	@Override
	public Adapter adapt(Notifier target, Object type) {
		return adapt(target, type);
	}

	@Override
	public Object adapt(Object target, Object type) {
		ECPProviderItemProvider itemProvider = new ECPProviderItemProvider(this, provider);
		
		return supportedTypes.contains(type) ? itemProvider : null;
	}

	@Override
	public Adapter adaptNew(Notifier target, Object type) {
		throw new UnsupportedOperationException();
	}

	@Override
	public void adaptAllNew(Notifier notifier) {
		throw new UnsupportedOperationException();
	}

}
