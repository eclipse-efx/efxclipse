package org.eclipse.fx.ide.css.cssext.extapi.scope;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;

import org.eclipse.emf.common.util.URI;
import org.eclipse.xtext.resource.XtextResourceSet;

public abstract class AScope implements Scope {

	private Map<String, URI> autoEntries = new HashMap<>();
	private Map<String, URI> entries = new HashMap<>();

	protected final Scope parent;
	protected final XtextResourceSet resourceSet;

	public AScope(Scope parent, XtextResourceSet resourceSet) {
		this.parent = parent;
		this.resourceSet = resourceSet;
	}

	@Override
	public XtextResourceSet getResourceSet() {
		return resourceSet;
	}

	private boolean init = false;

	private Map<Key<?>, Function<Scope, ?>> stateCreatorMap = Collections.synchronizedMap(new HashMap<>());
	private Map<Key<?>, Object> stateMap = Collections.synchronizedMap(new HashMap<>());

	protected void clearState() {
		System.err.println("# CLEAR STATE ON " + this);
		stateMap.clear();
	}

	@Override
	public <S> void registerState(Key<S> key, Function<Scope, S> creator) {
		stateCreatorMap.put(key, creator);
	}

	public <S> S getState(Key<S> key) {
		System.err.println(getClass().getSimpleName() + "#getState(" + key + ")");
		long now = System.currentTimeMillis();
		S state = (S) stateMap.get(key);
		if (state == null) {
			Function<Scope, S> supplier = (Function<Scope, S>) stateCreatorMap.get(key);
			if (supplier != null) {
				System.err.println(getClass().getSimpleName() + "#getState(" + key + "): computing value...");
				state = supplier.apply(this);
				stateMap.put(key, state);
			}
		}
		System.err.println(getClass().getSimpleName() + "#getState(" + key + ") needed " + (System.currentTimeMillis() - now) + "ms");
		return state;
	}


	@Override
	public Optional<URI> lookup(String namespace) {
		URI result = entries.get(namespace);
		if (result == null) {
			result = autoEntries.get(namespace);
		}

		if (result == null && parent != null) {
			return parent.lookup(namespace);
		}

		return Optional.ofNullable(result);
	}

	public void init() {
		if (!init) {
			doInit();
		}
		init = true;
	}

	protected abstract void doInit();

	public void add(String namespace, URI file) {
		this.entries.put(namespace, file);
	}

	public void remove(String namespace) {
		this.entries.remove(namespace);
	}

	protected void autoAdd(String namespace, URI uri) {
		this.autoEntries.put(namespace, uri);
	}

	protected void autoRemove(String namespace) {
		this.autoEntries.remove(namespace);
	}
}
