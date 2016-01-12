package org.eclipse.fx.ide.css.cssext.extapi.scope;

import java.util.Optional;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

public interface Scope {

	public static class Key<T> {
		private final String name;
		public Key(String name) {
			this.name = name;
		}
	}

	XtextResourceSet getResourceSet();

	Optional<XtextResource> getResource();

	Optional<URI> lookup(String namespace);

	<S> void registerState(Key<S> key, Function<Scope, S> creator);
	<S> S getState(Key<S> key);

	void init();

}
