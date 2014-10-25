package application.Errors;

import static application.View.myResources;

import application.Constants.ExceptionConstants;

public class NullInput extends SLogoException {

	public NullInput() {

		myMessage = myResources.getString(ExceptionConstants.NULL_INPUT);
	}

}
