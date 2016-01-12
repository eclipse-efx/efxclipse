package org.eclipse.fx.ide.css.util;

import com.google.common.base.Objects;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.fx.ide.css.cssDsl.CssDeclaration;
import org.eclipse.fx.ide.css.cssDsl.ElementSelector;
import org.eclipse.fx.ide.css.cssDsl.Ruleset;
import org.eclipse.fx.ide.css.cssDsl.Selector;
import org.eclipse.fx.ide.css.cssDsl.SimpleSelector;

@SuppressWarnings("all")
public class Util {
  public boolean isMetaDataBlock(final CssDeclaration dec) {
    boolean _xblockexpression = false;
    {
      EObject _eContainer = dec.eContainer();
      if ((_eContainer instanceof Ruleset)) {
        EObject _eContainer_1 = dec.eContainer();
        return this.isMetaDataBlock(((Ruleset) _eContainer_1));
      }
      _xblockexpression = false;
    }
    return _xblockexpression;
  }
  
  public boolean isMetaDataBlock(final Ruleset ruleset) {
    EList<Selector> _selectors = ruleset.getSelectors();
    int _size = _selectors.size();
    boolean _equals = (_size == 1);
    if (_equals) {
      EList<Selector> _selectors_1 = ruleset.getSelectors();
      final Selector s = _selectors_1.get(0);
      EList<SimpleSelector> _simpleselectors = s.getSimpleselectors();
      int _size_1 = _simpleselectors.size();
      boolean _equals_1 = (_size_1 == 1);
      if (_equals_1) {
        EList<SimpleSelector> _simpleselectors_1 = s.getSimpleselectors();
        final SimpleSelector s1 = _simpleselectors_1.get(0);
        ElementSelector _element = s1.getElement();
        boolean _notEquals = (!Objects.equal(_element, null));
        if (_notEquals) {
          ElementSelector _element_1 = s1.getElement();
          String _name = _element_1.getName();
          boolean _equals_2 = "efxclipseCssMetaData".equals(_name);
          if (_equals_2) {
            return true;
          }
        }
      }
    }
    return false;
  }
}
