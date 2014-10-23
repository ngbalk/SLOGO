package application.Errors;

import static application.Controller.myResources;

public class NullInput extends SLogoException {

	public NullInput() {
		myMessage = myResources.getString("nullInput");
	}

}
