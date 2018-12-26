package model;

import org.eclipse.ui.internal.handlers.WizardHandler.New;

//import view.View;

public class view_model {
	//View view = new View();
	private String codetext;

	public void setCodetext(String codetext) {
		// TODO Auto-generated method stub
		this.codetext = codetext;
	}
	
	public String getCodetext(){
		System.out.println(this.codetext);
		return this.codetext;
	}
	
}
