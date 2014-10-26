package application.Errors;

import static application.View.myResources;
import application.Constants.ExceptionConstants;

public class FXMLException extends SLogoException {
	public FXMLException(){
		myMessage = myResources.getString(ExceptionConstants.FXML_EXCEPTION);
	}
}
