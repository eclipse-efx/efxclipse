package org.eclipse.fx.code.editor.configuration;

public interface TokenScanner_DynamicEnd extends EditorBase, TokenScanner {
	public String getBeginPrefix();
	public String getBeginMatch();
	public String getEndTemplate();
	public boolean isSingleLine();
	public Check getCheck();
	public Condition getCondition();

	public interface Builder {
		public Builder beginPrefix(String beginPrefix);
		public Builder beginMatch(String beginMatch);
		public Builder endTemplate(String endTemplate);
		public Builder singleLine(boolean singleLine);
		public Builder check(Check check);
		public Builder condition(Condition condition);
		public TokenScanner_DynamicEnd build();
	}
}
