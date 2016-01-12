package org.eclipse.fx.ide.css.util

import org.eclipse.fx.ide.css.cssDsl.CssDeclaration
import org.eclipse.fx.ide.css.cssDsl.Ruleset

class Util {
	
	def boolean isMetaDataBlock(CssDeclaration dec) {
		if (dec.eContainer instanceof Ruleset) {
			return isMetaDataBlock(dec.eContainer as Ruleset)
		}
		false
	}
	
	def boolean isMetaDataBlock(Ruleset ruleset) {
		if (ruleset.selectors.size == 1) {
			val s = ruleset.selectors.get(0)
			if (s.simpleselectors.size == 1) {
				val s1 = s.simpleselectors.get(0)
				if (s1.element != null) {
					if ("efxclipseCssMetaData".equals(s1.element.name) ) {
						return true
					}
				}
			}
		}
		return false
	}
	
}