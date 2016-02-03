package org.eclipse.fx.ide.css.cssext.resolver.osgi;

import java.net.URI;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.fx.core.Subscription;
import org.eclipse.fx.ide.css.cssext.extapi.registry.CssExtFileWatcher;
import org.osgi.framework.BundleContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;

@Component(service=CssExtFileWatcher.class, property={"context=java.lang.Void"})
public class OSGiBundlesCssExtResolver implements CssExtFileWatcher<Void> {

	@Override
	public String getId() {
		return "osgi-bundles";
	}
	
	private CssExtBundleTracker tracker;
	
	@Activate
	protected void activate(BundleContext context) {
		tracker = new CssExtBundleTracker(context);
		tracker.open();
	}
	
	@Deactivate
	protected void deactivate() {
		tracker.close();
	}

	@Override
	public Subscription subscribe(Void context, Consumer<URI> onAdd, Consumer<URI> onRemove) {
		return tracker.subscribe(context, onAdd, onRemove);
	}

	@Override
	public Set<URI> getCurrent(Void context) {
		return tracker.getCurrent(context);
	}
}
