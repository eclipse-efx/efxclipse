//package org.eclipse.fx.ide.css.cssext.ui.internal;
//
//import java.util.HashMap;
//import java.util.Map;
//
//import org.eclipse.core.resources.IProject;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.fx.ide.css.cssext.guice.AbstractResourceScope;
//import org.eclipse.xtext.resource.XtextResource;
//
//import com.google.inject.Key;
//import com.google.inject.Provider;
//import com.google.inject.name.Names;
//
//public class EclipseResourceScope implements AbstractResourceScope {
//
//	private EclipseProjectScope parent;
//
//	public EclipseResourceScope(EclipseProjectScope parent) {
//		System.err.println("NEW ECLIPSE RESOURCE SCOPE INSTANCE " + hashCode());
//		this.parent = parent;
//	}
//
////	private ThreadLocal<IProject> currentProject = new ThreadLocal<>();
////	private final ThreadLocal<Map<Key<?>, Object>> values = new ThreadLocal<Map<Key<?>, Object>>();
////
////	private <T> Map<Key<?>, Object> getScopedObjectMap(Key<T> key) {
////		Map<Key<?>, Object> scopedObjects = values.get();
////		if (scopedObjects == null) {
////			throw new OutOfScopeException("Cannot access " + key + " outside of a scoping block");
////		}
////		return scopedObjects;
////	}
//
//	private ThreadLocal<XtextResource> currentResource = new ThreadLocal<>();
//
//	private Map<XtextResource, Map<Key<?>, Object>> values = new HashMap<>();
//
//	private Map<Key<?>, Object> getScope() {
//		if (currentResource.get() != null) {
//			return values.get(currentResource.get());
//		}
//		return null;
//	}
//
//	@Override
//	public <T> Provider<T> scope(Key<T> key, Provider<T> unscoped) {
//		String logid = "EclipseResourceScope@" + hashCode() + "#scope ";
//		return new Provider<T>() {
//			@Override
//			public T get() {
//				T result = null;
//
//				System.err.println(logid + key);
//				Map<Key<?>, Object> scopedObjects = getScope();
//
//				if (scopedObjects == null) {
//					System.err.println(logid + " -> no scope availabe - returning unscoped");
//					result = unscoped.get();
//				}
//				else {
//					System.err.println(logid + " -> looking for " + key + " in " + scopedObjects);
//					T current = (T) scopedObjects.get(key);
//
//					if (current == null && !scopedObjects.containsKey(key)) {
//				          current = unscoped.get();
//				          scopedObjects.put(key, current);
//				          System.err.println(logid + " -> adding " + current + " to " + currentResource.get().hashCode());
//					}
//
//					result = current;
//				}
//
//				if (result == null) {
//					System.err.println(logid + " -> delegating to parent scope");
//					Provider<T> provider = parent.scope(key, unscoped);
//					result = provider.get();
//				}
//
//				System.err.println(logid + " returns " + result);
//				return result;
//			}
//		};
//	}
//
//	@Override
//	public void enter(EObject context) {
//		if (currentResource.get() != null) {
//			throw new IllegalStateException("No nested projects allowed!");
//		}
//		if (context.eResource() instanceof XtextResource) {
//			XtextResource r = (XtextResource) context.eResource();
//			currentResource.set(r);
//			if (values.get(r) == null)  { values.put(r, new HashMap<>()); }
//
//			getScope().put(Key.get(XtextResource.class, Names.named("currentResource")), r);
//
//		}
//		else {
//			throw new IllegalStateException("cannot determine resource from " + context);
//		}
//	}
//
//	@Override
//	public void exit() {
//		System.err.println("Eclipse Resource Scope: EXIT");
//		currentResource.set(null);
//	}
//
//}
