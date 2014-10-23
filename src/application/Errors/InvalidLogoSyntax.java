package application.Errors;
import static application.Controller.myResources;

public class InvalidLogoSyntax extends SLogoException {
	public InvalidLogoSyntax() {
		myMessage = myResources.getString("invalidLogoSyntax");
	}

	
}
