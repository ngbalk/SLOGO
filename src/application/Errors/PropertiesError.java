package application.Errors;

import static application.View.myResources;
import application.Constants.ExceptionConstants;

public class PropertiesError extends SLogoException {
	public PropertiesError() {
		myMessage = myResources.getString(ExceptionConstants.PROPERTIES_ERROR);
	}

}
