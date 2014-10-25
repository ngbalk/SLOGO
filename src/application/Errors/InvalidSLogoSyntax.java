package application.Errors;
import static application.View.myResources;
import application.Constants.ExceptionConstants;

public class InvalidSLogoSyntax extends SLogoException {
	public InvalidSLogoSyntax() {
		myMessage = myResources.getString(ExceptionConstants.INVALID_SLOGO_SYNTAX);
	}
}
