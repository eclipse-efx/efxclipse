///*******************************************************************************
// * Copyright (c) 2012 BestSolution.at and others.
// * All rights reserved. This program and the accompanying materials
// * are made available under the terms of the Eclipse Public License v1.0
// * which accompanies this distribution, and is available at
// * http://www.eclipse.org/legal/epl-v10.html
// *
// * Contributors:
// *     Christoph Caks <ccaks@bestsolution.at> - initial API and implementation
// *******************************************************************************/
//package org.eclipse.fx.ide.css.cssext.internal;
//
//import java.util.ArrayList;
//import java.util.Collections;
//import java.util.HashSet;
//import java.util.LinkedList;
//import java.util.List;
//import java.util.Queue;
//import java.util.Set;
//
//import org.eclipse.emf.common.util.URI;
//import org.eclipse.emf.ecore.EObject;
//import org.eclipse.emf.ecore.resource.Resource;
//import org.eclipse.emf.ecore.resource.ResourceSet;
//import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
//import org.eclipse.fx.core.log.Log;
//import org.eclipse.fx.core.log.Logger;
//import org.eclipse.fx.ide.css.cssext.ICSSExtModelProvider;
//import org.eclipse.fx.ide.css.cssext.ICssExtManager;
//import org.eclipse.fx.ide.css.cssext.proposal.CssExtProposalContributor;
//
//import com.google.common.io.Files;
//
//import org.eclipse.fx.ide.css.cssDsl.ClassSelector;
//import org.eclipse.fx.ide.css.cssDsl.CssSelector;
//import org.eclipse.fx.ide.css.cssDsl.selector;
//import org.eclipse.fx.ide.css.cssDsl.simple_selector;
//import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
//import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
//import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
//import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
//import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition;
//import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
//import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;
//import org.eclipse.fx.ide.css.cssext.extapi.Context;
//import org.eclipse.fx.ide.css.cssext.internal.SearchHelper.ElementDefinitionFilter;
//import org.eclipse.fx.ide.css.cssext.internal.SearchHelper.PropertyDefinitionFilter;
//import org.eclipse.fx.ide.css.cssext.internal.SearchHelper.SearchFilter;
//import org.eclipse.fx.ide.css.extapi.Proposal;
//import org.eclipse.xtext.resource.XtextResource;
//
//public class CssExtManager implements ICssExtManager {
//
//	private @Log("cssext.manager") Logger logger;
//	
//	
//	
//	
//	
//	private Set<CssExtension> models;
//	
//	public CssExtManager(Set<CssExtension> models) {
//		this.models = models;
//	}
//	
//	
//	
////	private static void log(String string) {
////		System.err.println("MANAGER: " + string);
////	}
////	private static void logf(String format, Object...args) {
////		System.err.printf("MANAGER: " + format , args);
////		System.err.println();
////	}
////	
////	private enum FixedExtensions {
////		JavaFX2(URI.createPlatformPluginURI("/org.eclipse.fx.ide.css.jfx/OSGI-INF/jfx2.cssext", true));
////		public final URI uri;
////		private FixedExtensions(URI uri) {
////			this.uri = uri;
////		}
////	}
//	
////	private Set<CssExtension> model = new HashSet<CssExtension>();
//	
//	private boolean loaded = false;
//	
//	static int count = 0;
//	public CssExtManager() {
////		logger.debugf("Ext Manager #%d" ,++count);
//	}
//	
////	public void registerExtenstion(URI uri) {
////		logf("loading %s", uri);
////		ResourceSet rs = new ResourceSetImpl();
////		Resource resource = rs.getResource(FixedExtensions.JavaFX2.uri, true);
////		CssExtension model = (CssExtension) resource.getContents().get(0);
////		
////		this.model.add(model);
////	}
////	
////	public void load() {
////		if (loaded) return;
////		registerExtenstion(FixedExtensions.JavaFX2.uri);
////		loaded = true;
////	}
//	
//	/* (non-Javadoc)
//	 * @see org.eclipse.fx.ide.css.cssext.ui.ICssExtManager#findPropertyByName(java.lang.String)
//	 */
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
//	
////	public IJavaProject getJavaprojectFromPlatformURI(URI uri) {
////		String projectName = null;
////		if (uri.isPlatform()) {
////			projectName = uri.segment(1);
////		}
////		IProject p =  ResourcesPlugin.getWorkspace().getRoot().getProject(projectName);
////		return JavaCore.create(p);
////	}
//	
//	// TODO implement me
////	public void searchClasspath(URI uri) {
////		IJavaProject project = getJavaprojectFromPlatformURI(uri);
////		
////		try {
////			for (IClasspathEntry entry : project.getRawClasspath()) {
////				switch (entry.getEntryKind()) {
////				case IClasspathEntry.CPE_LIBRARY:
////					
////				}
////			}
////		} catch (JavaModelException e) {
////			// TODO Auto-generated catch block
////			e.printStackTrace();
////		}
////		
////	}
//	
//
//	
//	
//
//	
////	private IFile toFile(java.net.URI uri) {
////		return toFile(URI.createURI(uri.toString()));
////	}
////	private IFile toFile(URI uri) {
////		if (uri.isPlatformResource()) {
////			IProject p = ResourcesPlugin.getWorkspace().getRoot().getProject(URI.decode(uri.segment(1)));
////			
////			IPath path = null;
////			for( int i = 2; i < uri.segmentCount(); i++ ) {
////				if( path == null ) {
////					path = new Path(URI.decode(uri.segment(i)));
////				} else {
////					path = path.append(URI.decode(uri.segment(i)));
////				}
////			}
////			
////			if( path != null ) {
////				return p.getFile(path);
////			}
////		}
////		return null;
////	}
//	
////	private Set<CssExtension> collectModels(java.net.URI resource, EObject context) {
////		
////		IFile file = toFile(resource);
////		ICssResource cssFile = (ICssResource) Platform.getAdapterManager().getAdapter(file, ICssResource.class);
////		
////		if (cssFile != null) {
////			logger.debug("USING extensions from cssFile");
////			return cssFile.getEnabledCssExtensions(context);
////		}
////		else {
////			logger.debug("defaulting to old provider");
////			Set<CssExtension> rv = new HashSet<>();
////			for( ICSSExtModelProvider p : extensionModelProvider ) {
////				rv.addAll(p.getModels(resource));
////			}
////			return rv;
////		}
////	}
//}
