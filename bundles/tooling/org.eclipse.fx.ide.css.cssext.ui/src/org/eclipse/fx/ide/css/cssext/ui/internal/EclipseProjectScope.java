//package org.eclipse.fx.ide.css.cssext.ui.internal;
//
//import java.net.URI;
//import java.net.URISyntaxException;
//import java.util.HashMap;
//import java.util.Map;
//import java.util.regex.Matcher;
//import java.util.regex.Pattern;
//
//import org.eclipse.core.resources.IProject;
//import org.eclipse.core.resources.IWorkspaceRoot;
//import org.eclipse.core.resources.ResourcesPlugin;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.fx.ide.css.cssext.guice.AbstractProjectScope;
//
//import com.google.inject.Key;
//import com.google.inject.Provider;
//import com.google.inject.name.Names;
//
//public class EclipseProjectScope implements AbstractProjectScope {
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
//	private ThreadLocal<IProject> currentProject = new ThreadLocal<>();
//
//	private Map<IProject, Map<Key<?>, Object>> values = new HashMap<>();
//
//	private Map<Key<?>, Object> getScope() {
//		if (currentProject.get() != null) {
//			return values.get(currentProject.get());
//		}
//		return null;
//	}
//
//
//	public EclipseProjectScope() {
//		System.err.println("NEW ECLIPSE PROJECT SCOPE INSTANCE " + hashCode());
//	}
//
//	@Override
//	public <T> Provider<T> scope(Key<T> key, Provider<T> unscoped) {
//		String logid = "EclipseProjectScope@" + hashCode() + "#scope ";
//		return new Provider<T>() {
//			@Override
//			public T get() {
//				T result = null;
//				System.err.println(logid + key);
//				Map<Key<?>, Object> scopedObjects = getScope();
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
//				          System.err.println(logid + " -> adding " + current + " to " + currentProject.get().hashCode());
//					}
//					result = current;
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
//		try {
//			URI uri = URI.create(context.eResource().getURI().toString());
//			System.err.println("Eclipse Project Scope: ENTER " + uri);
//			if (currentProject.get() != null) {
//				throw new IllegalStateException("No nested projects allowed!");
//			}
//
//			Pattern p0 = Pattern.compile("platform:/resource/([^/]+).*");
//
//			Matcher matcher = p0.matcher(uri.toString());
//			if (matcher.matches()) {
//				IWorkspaceRoot root = ResourcesPlugin.getWorkspace().getRoot();
//				IProject project = root.getProject(matcher.group(1));
//				currentProject.set(project);
//				if (values.get(project) == null)  { values.put(project, new HashMap<>()); }
//
//				getScope().put(Key.get(IProject.class, Names.named("currentProject")), project);
//
//	//			values.set(Maps.<Key<?>, Object>newHashMap());
//
//				URI projectURI = project.getLocationURI();
//				Key<URI> projectURIKey = Key.get(URI.class, Names.named("projectURI"));
//				// init
//
//	//			getScopedObjectMap(projectURIKey).put(projectURIKey, projectURI);
//
//				System.err.println(" -> currentProject " + currentProject.get());
//			}
//			else {
//				System.err.println("cannot determine project from uri " + uri + " -> no project scope exists");
//			}
//		}
//		catch (IllegalArgumentException e) {
//			e.printStackTrace();
//		}
//	}
//
//	@Override
//	public void exit() {
//		System.err.println("Eclipse Project Scope: EXIT");
//		currentProject.set(null);
//	}
//
//}
