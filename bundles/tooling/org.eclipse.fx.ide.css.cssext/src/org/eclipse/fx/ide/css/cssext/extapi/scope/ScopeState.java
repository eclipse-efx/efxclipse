package org.eclipse.fx.ide.css.cssext.extapi.scope;

public interface ScopeState {
	<O> O get(Class<O> type);
	<O> O get(String key);

	<O> void put(Class<O> type, O value);
	<O> void put(String key, O value);



}
