package application.Errors;

import static application.Controller.myResources;

public class DivideByZero extends SLogoException {
	public DivideByZero() {
		myMessage = myResources.getString("divideByZero");
	}

	
}
