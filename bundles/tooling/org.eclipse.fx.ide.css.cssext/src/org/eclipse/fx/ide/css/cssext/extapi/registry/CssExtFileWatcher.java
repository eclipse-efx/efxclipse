package org.eclipse.fx.ide.css.cssext.extapi.registry;

import java.net.URI;
import java.util.Set;
import java.util.function.Consumer;

import org.eclipse.fx.core.Subscription;

public interface CssExtFileWatcher<T> {
	
	String getId();
	
	Subscription subscribe(T context, Consumer<URI> onAdd, Consumer<URI> onRemove);
	
	Set<URI> getCurrent(T context);
}
