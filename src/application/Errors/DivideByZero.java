package application.Errors;

import static application.Controller.myResources;

import application.Constants.ExceptionConstants;

public class DivideByZero extends SLogoException {
	public DivideByZero() {
		myMessage = myResources.getString(ExceptionConstants.DIVIDE_BY_ZERO);
	}
}
