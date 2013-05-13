package org.eclipse.fx.ecp.ui;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

/**
 * The activator class controls the plug-in life cycle
 */
public class ECPUIPlugin implements BundleActivator {

	// The plug-in ID
	public static final String PLUGIN_ID = "org.eclipse.fx.ecp.ui"; //$NON-NLS-1$

	// The shared instance
	private static ECPUIPlugin plugin;
	
	/**
	 * The constructor
	 */
	public ECPUIPlugin() {
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#start(org.osgi.framework.BundleContext)
	 */
	public void start(BundleContext context) throws Exception {
		plugin = this;
	}

	/*
	 * (non-Javadoc)
	 * @see org.eclipse.ui.plugin.AbstractUIPlugin#stop(org.osgi.framework.BundleContext)
	 */
	public void stop(BundleContext context) throws Exception {
		plugin = null;
	}

	/**
	 * Returns the shared instance
	 *
	 * @return the shared instance
	 */
	public static ECPUIPlugin getDefault() {
		return plugin;
	}

}
