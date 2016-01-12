package org.eclipse.fx.ide.css.cssext.internal;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import java.util.Set;

import org.eclipse.fx.core.log.Log;
import org.eclipse.fx.core.log.Logger;
import org.eclipse.fx.ide.css.cssDsl.ClassSelector;
import org.eclipse.fx.ide.css.cssDsl.CssProperty;
import org.eclipse.fx.ide.css.cssDsl.CssSelector;
import org.eclipse.fx.ide.css.cssDsl.CssTok;
import org.eclipse.fx.ide.css.cssDsl.FuncTok;
import org.eclipse.fx.ide.css.cssDsl.Selector;
import org.eclipse.fx.ide.css.cssDsl.SimpleSelector;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRule;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CSSRuleRef;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.CssExtension;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.Definition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.ElementDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PropertyDefinition;
import org.eclipse.fx.ide.css.cssext.cssExtDsl.PseudoClassDefinition;
import org.eclipse.fx.ide.css.cssext.extapi.CssExtApi;
import org.eclipse.fx.ide.css.cssext.extapi.scope.ResourceScope;
import org.eclipse.fx.ide.css.cssext.extapi.scope.Scope;
import org.eclipse.fx.ide.css.cssext.internal.SearchHelper.PropertyDefinitionFilter;
import org.eclipse.fx.ide.css.cssext.internal.SearchHelper.SearchFilter;
import org.eclipse.fx.ide.css.cssext.parser.CssExtParser;
import org.eclipse.fx.ide.css.extapi.Proposal;

import com.google.inject.Inject;

public class CssExtImpl implements CssExtApi {

	private @Inject CssExtParser parser;
	private @Log("cssext.impl") Logger logger;


	private Map<String, CSSRule> getVariables(Scope scope) {
		scope.registerState(ResourceScope.KEY_ALL_VARIABLES, r->
			parser.findAllReferences(r)
		);
		return scope.getState(ResourceScope.KEY_ALL_VARIABLES);
	}

	@Override
	public boolean isPropertyVariable(Scope context, String name) {
		return getVariables(context).keySet().contains(name);
	}

	@Override
	public boolean isPropertyVariable(Scope context, List<Selector> selectors, CssProperty property) {
		if (isPropertyVariable(context, property)) {
			if (isPropertyKnown(context, property)) {
				return false;
			}
			else {
				return true;
			}
		}
		return false;
	}

	@Override
	public boolean isPropertyVariable(Scope context, CssProperty property) {
		return isPropertyVariable(context, property.getName());
	}

	protected boolean isPropertyBySelectorSupportedX(Scope context, List<Selector> selectors, CssProperty property) {
		for (Selector selector: selectors) {
			List<PropertyDefinition> props = findPropertiesBySelector(context, selector);
			if (props.stream().map(p->p.getName()).anyMatch(n->n.equals(property.getName()))) {
				return true;
			}
		}
		return false;
	}


	@Override
	public boolean isPropertyBySelectorSupported(Scope scope, List<Selector> selectors, CssProperty property) {
		final Set<CssExtension> models = scope.getState(ResourceScope.KEY_IMPORT_MODELS);
		if (models.isEmpty()) {
			// no models = everything valid
			return true;
		}

		if (isPropertyVariable(scope, property)) {
			return true;
		}

		boolean minOne = false;
		for (Selector selector: selectors) {
			List<PropertyDefinition> props = findPropertiesBySelector(scope, selector);
			if (!props.isEmpty()) {
				minOne = true;
			}

			if (props.stream().map(p->p.getName()).anyMatch(n->n.equals(property.getName()))) {
				return true;
			}
		}
		if (minOne) {
			return false;
		}
		else {
			return true;
		}
	}

	@Override
	public boolean isPropertyKnown(Scope scope, CssProperty property) {
		final Set<CssExtension> models = scope.getState(ResourceScope.KEY_IMPORT_MODELS);
		if (models.isEmpty()) {
			// no models = everything valid
			return true;
		}

		if (isPropertyVariable(scope, property)) {
			return true;
		}

		return findAllProperties(scope).stream().map(p->p.getName()).anyMatch(n->n.equals(property.getName()));
	}


	@Override
	public List<Proposal> getPropertyProposalsForSelector(Scope context, List<Selector> selectors) {
		List<Proposal> result = new ArrayList<>();

		List<PropertyDefinition> defs = new ArrayList<>();
		if (selectors == null || selectors.isEmpty()) {
			defs.addAll(findAllProperties(context));
		}
		else {
			for (Selector selector: selectors) {
				defs.addAll(findPropertiesBySelector(context, selector));
			}
		}

		if (defs.isEmpty()) {
			defs.addAll(findAllProperties(context));
		}

		for (PropertyDefinition def : defs) {
			result.add(createProposalForPropertyDefinition(def));
		}

		return result;
	}

	@Override
	public List<Proposal> getValueProposalsForProperty(Scope context, List<Selector> selector,
			CssProperty property, List<CssTok> prefixTok, String prefixString) {
		return parser.findProposals(context, null, property.getName(), prefixTok, prefixString);
	}

	@Override
	public List<Proposal> getValueProposalsForFunction(Scope context, List<Selector> selector, CssProperty property,
			FuncTok funcTok, List<CssTok> prefixToks, String prefixString) {
		return parser.findProposals(context, null, property.getName(), funcTok, prefixToks, prefixString);
	}

	private Proposal createProposalForPropertyDefinition(final PropertyDefinition def) {

		Proposal p = new Proposal() {

			@Override
			public String getProposal() {
				return def.getName();
			}

			@Override
			public int getPriority() {
				return 0;
			}

			@Override
			public String getLabel() {
				return def.getName();
			}

			@Override
			public String getImageUrl() {
				return null;
			}

			@Override
			public Object getAdditionalInfo() {
				return def;
			}

			@Override
			public Type getType() {
				return Type.Property;
			}
		};

		return p;
	}


	@Override
	public CSSRule resolveReference(Scope context, final CSSRuleRef ref) {
		final Definition definition = ref.getRef();
		CSSRule result =  definition.getRule();
		if (result == null) {
			if (definition instanceof CSSRuleDefinition) {
				result = ((CSSRuleDefinition) definition).getFunc();
			}
		}
		return result;
	}

	@Override
	public PropertyDefinition findPropertyByName(Scope scope, final String propertyName) {
		final Set<CssExtension> models = scope.getState(ResourceScope.KEY_IMPORT_MODELS);
		List<PropertyDefinition> search = new SearchHelper(models).findPropertiesByFilter(new PropertyDefinitionFilter() {

			@Override
			public boolean returnOnFirstHit() {
				return true;
			}

			@Override
			public boolean filter(PropertyDefinition def) {
				return propertyName.equals(def.getName());
			}
		});
		if (search.isEmpty()) return null;
		else return search.get(0);
	}

	@Override
	public List<PropertyDefinition> findAllProperties(Scope scope) {
		final Set<CssExtension> models = scope.getState(ResourceScope.KEY_IMPORT_MODELS);
		List<PropertyDefinition> defs = new SearchHelper(models).findPropertiesByFilter(new PropertyDefinitionFilter() {
			@Override
			public boolean returnOnFirstHit() {
				return false;
			}
			@Override
			public boolean filter(PropertyDefinition def) {
				return true;
			}
		});
		return defs;
	}

	@Override
	public PseudoClassDefinition findPseudoClassByName(Scope scope, String pseudoName) {
		final Set<CssExtension> models = scope.getState(ResourceScope.KEY_IMPORT_MODELS);
		List<PseudoClassDefinition> result = new SearchHelper(models).findObjects(new SearchFilter<PseudoClassDefinition>() {

			@Override
			public Class<PseudoClassDefinition> getSearchClass() {
				return PseudoClassDefinition.class;
			}

			@Override
			public boolean filter(PseudoClassDefinition obj) {
				return obj.getName().equals(pseudoName);
			}

			@Override
			public boolean returnOnFirstHit() {
				return true;
			}
		});


		if (!result.isEmpty()) {
			return result.get(0);
		}
		return null;
	}

	@Override
	public List<PropertyDefinition> findPropertiesBySelector(Scope scope, Selector cssSelector) {
		final Set<CssExtension> models = scope.getState(ResourceScope.KEY_IMPORT_MODELS);
		List<PropertyDefinition> result = new ArrayList<>();
			// first we need to find the last selector
			logger.debug("searching for last selector");
			Selector lastSelector = cssSelector;
			while (lastSelector.getSelector() != null) {
				lastSelector = lastSelector.getSelector();
			}
			logger.debug("lastSelector = " + lastSelector);


			for (SimpleSelector ss : lastSelector.getSimpleselectors()) {
				String elementName = null;
				if (ss.getElement() != null) {
					logger.debug(" - found element selector: " + ss.getElement().getName());

					elementName = ss.getElement().getName();
				}
				Set<String> styleClasses = new HashSet<>();
				for (CssSelector subs : ss.getSubSelectors()) {
					if (subs instanceof ClassSelector) {
						logger.debug(" - found class selector: ." + ((ClassSelector)subs).getName());

						styleClasses.add(((ClassSelector)subs).getName());
					}
				}

				final String finalElementName = elementName;
				final Set<String> finalStyleClasses = styleClasses;

				Queue<ElementDefinition> superElements = new LinkedList<>();

				superElements.addAll(new SearchHelper(models).findObjects(new SearchFilter<ElementDefinition>() {
					@Override
					public Class<ElementDefinition> getSearchClass() {
						return ElementDefinition.class;
					}
					@Override
					public boolean filter(ElementDefinition obj) {
						//System.err.println("check " + obj);
						if (obj.getName().equals(finalElementName)) {
							logger.debug("found by name -> " + obj);
							return true;
						}
						if (finalStyleClasses.contains(obj.getStyleclass())) {
							logger.debug("found by styleclass -> " + obj);
							return true;
						}
						return false;
					}
					@Override
					public boolean returnOnFirstHit() {
						return false;
					}
				}));
				final Set<ElementDefinition> allElements = new HashSet<>();
				while (!superElements.isEmpty()) {
					ElementDefinition cur = superElements.poll();
					if (cur.getSuper() != null && !cur.getSuper().isEmpty()) {
						superElements.addAll(cur.getSuper());
					}

					allElements.add(cur);
				}

				for (ElementDefinition d : allElements) {
					for (Definition def : d.getProperties()) {
						result.add((PropertyDefinition) def);
					}
				}

			}
			logger.debug("findPropertiesBySelector found " + result.size() + " properties");
		return result;
	}

	@Override
	public ElementDefinition findElementByName(Scope scope, final String elName) {
		final Set<CssExtension> models = scope.getState(ResourceScope.KEY_IMPORT_MODELS);
		List<ElementDefinition> search = new SearchHelper(models).findObjects(new SearchFilter<ElementDefinition>() {

			@Override
			public Class<ElementDefinition> getSearchClass() {
				return ElementDefinition.class;
			}

			@Override
			public boolean returnOnFirstHit() {
				return true;
			}

			@Override
			public boolean filter(ElementDefinition def) {
				return elName.equals(def.getName());
			}
		});
		if (search.isEmpty()) return null;
		else return search.get(0);
	}

	@Override
	public ElementDefinition findElementByStyleClass(Scope scope, final String styleClass) {
		final Set<CssExtension> models = scope.getState(ResourceScope.KEY_IMPORT_MODELS);
		List<ElementDefinition> r = new SearchHelper(models).findObjects(new SearchFilter<ElementDefinition>() {
			@Override
			public Class<ElementDefinition> getSearchClass() {
				return ElementDefinition.class;
			}

			@Override
			public boolean filter(ElementDefinition obj) {
				return obj.getStyleclass() != null && obj.getStyleclass().equals(styleClass);
			}

			@Override
			public boolean returnOnFirstHit() {
				return true;
			}
		});
		if (!r.isEmpty()) {
			return r.get(0);
		}
		else {
			return null;
		}
	}


}
