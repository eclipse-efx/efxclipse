package org.eclipse.fx.ide.css.cssext.parser.result;

public enum NodeType {
	OR,
	CONCAT,
	CONCAT_WITHOUT_SPACE,
	CONCAT_OR,
	SYMBOL,
	LITERAL,
	TYPE_NUM,
	TYPE_INT,
	OPTIONAL,
	STAR,
	REF,
	FUNCTION,
	PLUS,
	REGEX, TYPE_URL, 
	
	
	TYPE_PROPERTY_REF, TYPE_STRING;
	
	private NodeType() {
		
	}
	
	
}
