package org.eclipse.fx.ide.css.extapi;

import org.eclipse.emf.ecore.EObject;
import org.osgi.framework.BundleContext;
import org.osgi.framework.FrameworkUtil;
import org.osgi.framework.ServiceReference;

import com.google.inject.Provider;


public interface CssExtProvider {
	public CssExt getCssExt(EObject context);

	public static class OSGiProvider implements Provider<CssExtProvider> {
		private CssExtProvider instance = null;

		@Override
		public CssExtProvider get() {
			if (instance == null) {
				BundleContext context = FrameworkUtil.getBundle(CssExtProvider.class).getBundleContext();
				ServiceReference<CssExtProvider> ref = context.getServiceReference(CssExtProvider.class);
				if (ref != null) {
					instance = context.getService(ref);
				}
				else {
					System.err.println("CssExtProvider not available!!");
				}
			}
			return instance;
		}

	}
}
