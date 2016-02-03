package org.eclipse.fx.ide.css.cssext.resolver.osgi;

import java.net.URI;
import java.net.URISyntaxException;
import java.net.URL;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.Consumer;
import java.util.stream.Collectors;

import org.eclipse.fx.core.Subscription;
import org.eclipse.fx.ide.css.cssext.extapi.registry.CssExtFileWatcher;
import org.osgi.framework.Bundle;
import org.osgi.framework.BundleContext;
import org.osgi.framework.BundleEvent;
import org.osgi.util.tracker.BundleTracker;

public class CssExtBundleTracker extends BundleTracker<Object> implements CssExtFileWatcher<Void> {

	private Set<URI> cssExtURIs = new HashSet<>();
	private List<Consumer<URI>> addListeners = Collections.synchronizedList(new ArrayList<>());
	private List<Consumer<URI>> removeListeners = Collections.synchronizedList(new ArrayList<>());
	
	@Override
	public String getId() {
		return "osgi-bundles";
	}
	
	public CssExtBundleTracker(BundleContext context) {
		super(context, Bundle.INSTALLED | Bundle.RESOLVED | Bundle.ACTIVE | Bundle.STARTING | Bundle.STOPPING, null);
	}
	
	private static boolean notNull(Object o) {
		return o != null;
	}
	
	private static URI toURI(URL url) {
		try {
			return url.toURI();
		}
		catch (URISyntaxException e) {
			
		}
		return null;
	}

	private Iterable<URI> getCssExt(Bundle bundle) {
		String cssExtDefs = (String) bundle.getHeaders().get("CssExt-Definition");
		if (cssExtDefs != null) {
			return Arrays.stream(cssExtDefs.split(","))
				.map(cssExtDef -> bundle.getResource(cssExtDef))
				.filter(CssExtBundleTracker::notNull)
				.map(CssExtBundleTracker::toURI)
				.filter(CssExtBundleTracker::notNull)
				.collect(Collectors.toSet());
		}
		return Collections.emptySet();
	}
	
	@Override
	public Object addingBundle(Bundle bundle, BundleEvent event) {
		for (URI extURI : getCssExt(bundle)) {
			cssExtURIs.add(extURI);
			for (Consumer<URI> onAdd : addListeners) {
				onAdd.accept(extURI);
			}
		}
		return super.addingBundle(bundle, event);
	}

	@Override
	public void removedBundle(Bundle bundle, BundleEvent event, Object object) {
		for (URI extURI : getCssExt(bundle)) {
			cssExtURIs.remove(extURI);
			for (Consumer<URI> onRemove : removeListeners) {
				onRemove.accept(extURI);
			}
		}
		super.removedBundle(bundle, event, object);
	}
	
	@Override
	public Subscription subscribe(Void context, Consumer<URI> onAdd, Consumer<URI> onRemove) {
		if (onAdd != null) addListeners.add(onAdd);
		if (onRemove != null) removeListeners.add(onRemove);
		return new Subscription() {
			@Override
			public void dispose() {
				if (onAdd != null) addListeners.remove(onAdd);
				if (onRemove != null) removeListeners.remove(onRemove);
			}
		};
	}
	
	@Override
	public Set<URI> getCurrent(Void context) {
		return cssExtURIs;
	}
	
	
}
