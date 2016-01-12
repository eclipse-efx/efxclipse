package org.eclipse.fx.ide.css.cssext.extapi.scope;

import java.util.Map;
import java.util.Optional;
import java.util.Set;

import org.eclipse.emf.common.util.TreeIterator;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.emf.ecore.util.EcoreUtil;
import org.eclipse.fx.ide.css.CssStateResource;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSType;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.extapi.registry.ImportUtil;
import org.eclipse.xtext.resource.XtextResource;
import org.eclipse.xtext.resource.XtextResourceSet;

public class ResourceScope extends AScope {

	public static final Key<Set<org.eclipse.emf.common.util.URI>> KEY_IMPORT_URIS = new Key<>("importURIs");
	public static final Key<Set<CssExtension>> KEY_IMPORT_MODELS = new Key<>("importModels");
	public static final Key<Boolean> KEY_PROPERTY_REF_SUPPORT = new Key<>("propertyRefSupport");

	public static final Key<Map<String, CSSRule>> KEY_ALL_VARIABLES = new Key<>("allVariables");

	private final XtextResource resource;

	public ResourceScope(Scope parent, XtextResource resource) {
		super(parent, (XtextResourceSet) resource.getResourceSet());
		this.resource = resource;

		if (resource instanceof CssStateResource) {
			CssStateResource res = (CssStateResource) resource;
			res.setOnClear(this::clearState);
		}
		else {
			System.err.println("NO CSS STATE RESOURCE: "); Thread.currentThread().dumpStack();
		}
	}

	@Override
	public Optional<XtextResource> getResource() {
		return Optional.of(this.resource);
	}

	@Override
	protected void doInit() {
		System.err.println("ResourceScope#initialize("+resource.getURI()+")");
		long now = System.currentTimeMillis();

		// initialize scope fields

		registerState(KEY_IMPORT_URIS, r->{
			return ImportUtil.getImportedURIs(ResourceScope.this);
		});

		registerState(KEY_IMPORT_MODELS, r -> {
			return ImportUtil.getImportedExtensions(ResourceScope.this);
		});

		registerState(KEY_PROPERTY_REF_SUPPORT, r -> {
			return checkPropertyRefSupport(ImportUtil.getImportedExtensions(ResourceScope.this));
		});

		System.err.println("ResourceScope#initialize("+resource.getURI()+") needed "+(System.currentTimeMillis() - now)+"ms");
	}

	private boolean checkPropertyRefSupport(Set<CssExtension> models) {
		TreeIterator<Object> it = EcoreUtil.getAllContents(models);
		while (it.hasNext()) {
			Object obj = it.next();
			if (obj instanceof CSSType) {
				if ("@PROPERTY_REF".equals(((CSSType) obj).getType())) {
					return true;
				}
			}
		}
		return false;
	}
}
