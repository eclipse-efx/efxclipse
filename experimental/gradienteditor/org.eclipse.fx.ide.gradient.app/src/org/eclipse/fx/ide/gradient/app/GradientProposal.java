package org.eclipse.fx.ide.gradient.app;

import org.eclipse.fx.ide.css.ui.extapi.UIProposal;

public class GradientProposal implements UIProposal {

	private String proposal;
	
	
	@Override
	public Object getAdditionalInfo() {
		return null;
	}

	@Override
	public String getProposal() {
		return proposal;
	}

	@Override
	public String getImageUrl() {
		return null;
	}

	@Override
	public String getLabel() {
		return "Pick Color...";
	}

	@Override
	public int getPriority() {
		return 3;
	}

	@Override
	public boolean show() {
		System.err.println("start mal den editor");
		MainApplication app = new MainApplication();
		
			proposal = "blabla";
			return true;
//		}
//		else {
//			return false;
//		}
	}

	@Override
	public boolean hide() {
		return false;
	}

	@Override
	public Type getType() {
		return Type.Value;
	}
	
//	ConfigurableCompletionProposal dialogProposal = (ConfigurableCompletionProposal) createCompletionProposal("Pick color ...",context);
//	if( dialogProposal != null ) {
//		dialogProposal.setTextApplier(new ReplacementTextApplier() {
//			
//			@Override
//			public String getActualReplacementString(
//					ConfigurableCompletionProposal proposal) {
//				ColorDialog dialog = new ColorDialog(PlatformUI.getWorkbench().getActiveWorkbenchWindow().getShell());
//				RGB rgb = dialog.open();
//				if( rgb != null ) {
//					return "rgb("+rgb.red+","+rgb.green+","+rgb.blue+")";
//				}
//				return null;
//			}
//		});
//	}
//	acceptor.accept(dialogProposal); 
}
