package org.eclipse.fx.ide.css.cssext.extapi.registry;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Optional;
import java.util.Set;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.fx.ide.css.cssDsl.Stylesheet;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.extapi.scope.Scope;
import org.eclipse.xtext.TerminalRule;
import org.eclipse.xtext.nodemodel.BidiTreeIterator;
import org.eclipse.xtext.nodemodel.ICompositeNode;
import org.eclipse.xtext.nodemodel.INode;
import org.eclipse.xtext.nodemodel.impl.HiddenLeafNode;
import org.eclipse.xtext.nodemodel.util.NodeModelUtils;
import org.eclipse.xtext.resource.XtextResource;

public class ImportUtil {

	public static URI convert(java.net.URI uri) {
		return URI.createURI(uri.toString());
	}

	public static Optional<String> findNamespace(Scope scope, URI uri) {
		System.err.println("findNamespace(" + scope + ", " + uri + ")");
		Optional<Resource> resource = Optional.ofNullable(scope.getResourceSet().getResource(uri, true));
		try {
			Optional<EObject> first = resource.map(r->r.getContents()).filter(c->!c.isEmpty()).map(c->c.get(0));
			Optional<String> namespace = first.filter(f->f instanceof CssExtension).map(f->(CssExtension)f).map(ext->ext.getNamespace());
			System.err.println("findNamespace(" + uri + ") returns " + namespace);
			return namespace;
		}
		finally {
			resource.ifPresent(r->r.unload());
		}
	}

	public static Set<org.eclipse.emf.common.util.URI> getImportedURIs(Scope scope) {
		Optional<URI> resourceURI = scope.getResource().map(r->r.getURI());

		List<EObject> contents = scope.getResource().map(r->(List<EObject>)r.getContents()).orElse(Collections.emptyList());

		Set<String> imports = contents.stream()
				.filter(c->c instanceof Stylesheet).map(c->(Stylesheet) c)
				.findFirst()
				.map(s->findImports(scope, s)).orElse(Collections.emptySet());

		Set<org.eclipse.emf.common.util.URI> uris = imports.stream().map(s->{
			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(s);
			return resourceURI.map(resUri -> uri.resolve(resUri)).orElse(uri);
		}).collect(Collectors.toSet());

		System.err.println("ImportManager#getImportedURIs() -> " + uris);

		return uris;
	}

	public static Set<CssExtension> getImportedExtensions(Scope scope) {
		final long now = System.currentTimeMillis();
//		System.err.println("SimpleCssExtImportProvider is asked for " + resource);
		Optional<URI> resourceURI = scope.getResource().map(r->r.getURI());
		List<EObject> contents = scope.getResource().map(r->(List<EObject>)r.getContents()).orElse(Collections.emptyList());

		Set<String> imports = contents.stream()
				.filter(c->c instanceof Stylesheet).map(c->(Stylesheet) c)
				.findFirst()
				.map(s->findImports(scope, s)).orElse(Collections.emptySet());

		Set<org.eclipse.emf.common.util.URI> uris = imports.stream().map(s->{
			org.eclipse.emf.common.util.URI uri = org.eclipse.emf.common.util.URI.createURI(s);
			return resourceURI.map(resUri -> uri.resolve(resUri)).orElse(uri);
		}).collect(Collectors.toSet());


		Set<CssExtension> result = uris.stream().map(uri->{
			Optional<Resource> r = scope.getResource().map(res->res.getResourceSet().getResource(uri, true));
			Optional<CssExtension> ext = r.filter(res->res instanceof XtextResource)
				.map(res->res.getContents())
				.filter(content->!content.isEmpty())
				.map(content->content.get(0))
				.filter(first->first instanceof CssExtension)
				.map(first-> (CssExtension) first);
			return ext;
		})
			.filter(ext->ext.isPresent())
			.map(ext->ext.get())
			.collect(Collectors.toSet());

//		Set<CssExtension> result = new HashSet<>();
//
////		System.err.println("After local uri resolve: " + uris);
//
//
//		for (org.eclipse.emf.common.util.URI uri : uris) {
////			System.err.println("trying to load import " + uri);
//			try {
//				Resource s = (Resource) getResource().getResourceSet().getResource(uri, true);
//				if (s instanceof XtextResource) {
//					EList<EObject> contents2 = s.getContents();
//					if (contents2.size() > 0) {
////						System.err.println("found " + uri);
//
//						EObject eObject = contents2.get(0);
//
//						if (eObject instanceof CssExtension) {
////							System.err.println(" is css extension!!");
//
//							result.add((CssExtension) eObject);
//						}
//					}
//				}
//				else {
////					System.err.println("failed");
//				}
//			}
//			catch (Throwable e) {
////				System.err.println("failed " + e.getMessage());
//			}
//		}

		System.err.println("ImportManager#getImportedExtensions() " + (System.currentTimeMillis() - now) + " -> " + result);

		return result;
	}

	private static Set<String> findImports(Scope scope, Stylesheet s) {

		List<String> comments = new ArrayList<>();
		// get all hidden ML_COMMENTS
		ICompositeNode rootNode = NodeModelUtils.findActualNodeFor(s);
		BidiTreeIterator<INode> iterator = rootNode.getAsTreeIterable().iterator();
		while (iterator.hasNext()) {
			INode cur = iterator.next();

			if (cur instanceof HiddenLeafNode) {
				HiddenLeafNode n = (HiddenLeafNode) cur;
				if (n.getGrammarElement() instanceof TerminalRule) {
					TerminalRule tr = (TerminalRule) n.getGrammarElement();

					if ("ML_COMMENT".equals(tr.getName())) {
						// got one
						//System.err.println(" => " + n.getText());
						comments.add(n.getText());
					}
				}
			}


		}

		Set<String> imports = new HashSet<>();
		Pattern p = Pattern.compile("@import\\s+([\\w\\d:/.]+)");
		// search for @import statements
		for (String comment : comments) {
			Matcher matcher = p.matcher(comment);
			while (matcher.find()) {
				imports.add(matcher.group(1));
			}
		}

//		System.err.println("Found @import: " + imports);

		// resolve registry entries
		Pattern r = Pattern.compile("registry:([\\w\\d./]+)");
		imports = imports.stream().map(i->{
			Matcher matcher = r.matcher(i);
			if (matcher.matches()) {
				// registry lookup
				String key = matcher.group(1);
//				System.err.println("_> " + key);
				Optional<URI> lookupResult = scope.lookup(key);
				return lookupResult.map(uri->uri.toString());

//				org.eclipse.emf.common.util.URI uri = registry.lookup(key);
//				if (uri != null) return uri.toString();
//				return null;
				//return mapping.get(key);
			}
			else {
				return Optional.of(i);
			}
		}).filter(o->o.isPresent()).map(o->o.get()).collect(Collectors.toSet());

//		System.err.println("After registry resolve: " + imports);

		return imports;

//		List<String> result = new ArrayList<>();
//
//
//		s.eAllContents().forEachRemaining(e->{
//			if (e instanceof CssDeclaration && ((CssDeclaration)e).getProperty().getName().equals("import")) {
//				List<CssTok> toks = ((CssDeclaration)e).getValueTokens().stream().filter(x->(x instanceof StringTok || x instanceof IdentifierTok)).collect(Collectors.toList());
//				CssTok firstTok = toks.get(0);
//
//				if (firstTok instanceof StringTok) {
//					result.add(((StringTok) firstTok).getValue());
//				}
//				else if (firstTok instanceof IdentifierTok) {
//					String id = ((IdentifierTok)firstTok).getName();
//					if (mapping.containsKey(id)) {
//						result.add(mapping.get(id));
//					}
//				}
//
//			}
//		});
//
//		return result;
	}


}
