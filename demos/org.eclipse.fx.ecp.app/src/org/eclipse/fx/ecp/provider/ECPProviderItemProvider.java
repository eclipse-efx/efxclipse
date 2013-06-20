package org.eclipse.fx.ecp.provider;

import java.util.Collection;

import javafx.scene.image.ImageView;

import org.eclipse.emf.common.notify.AdapterFactory;
import org.eclipse.emf.ecp.core.ECPProject;
import org.eclipse.emf.ecp.internal.core.util.ChildrenListImpl;
import org.eclipse.emf.ecp.spi.core.InternalProvider;
import org.eclipse.emf.edit.provider.IItemLabelProvider;
import org.eclipse.emf.edit.provider.ITreeItemContentProvider;
import org.eclipse.emf.edit.provider.ItemProviderAdapter;
import org.eclipse.fx.ecp.ui.ECPUtil;

@SuppressWarnings("restriction")
public class ECPProviderItemProvider extends ItemProviderAdapter implements ITreeItemContentProvider, IItemLabelProvider {

	InternalProvider provider;

	public ECPProviderItemProvider(AdapterFactory adapterFactory, InternalProvider provider) {
		super(adapterFactory);
		this.provider = provider;
	}

	@Override
	public Collection<?> getChildren(Object object) {
		ChildrenListImpl childrenList = new ChildrenListImpl(object);
		provider.fillChildren(null, object, childrenList);
		return childrenList;
	}

	@Override
	public String getText(Object object) {
		if (object instanceof ECPProject) {
			ECPProject project = (ECPProject) object;
			return project.getName();
		}

		IItemLabelProvider labelProvider = (IItemLabelProvider) ECPUtil.DEFAULT_ADAPTER_FACTORY.adapt(object,
				IItemLabelProvider.class);
//				DummyWorkspace.INSTANCE.getAdapterFactory().adapt(object,
//				IItemLabelProvider.class);
		if (labelProvider != null)
			return labelProvider.getText(object);

		return object.toString();
	}

	@Override
	public Object getImage(Object object) {
		if (object instanceof ECPProject) {
			return new ImageView("platform:/plugin/org.eclipse.fx.ecp.app/icons/project_open.gif");
		}

//		IItemLabelProvider labelProvider = (IItemLabelProvider) DummyWorkspace.INSTANCE.getAdapterFactory().adapt(object,
//				IItemLabelProvider.class);
		IItemLabelProvider labelProvider = (IItemLabelProvider) ECPUtil.DEFAULT_ADAPTER_FACTORY.adapt(object, IItemLabelProvider.class);
		
		if (labelProvider != null)
			return labelProvider.getImage(object);

		return super.getImage(object);
	}

}
