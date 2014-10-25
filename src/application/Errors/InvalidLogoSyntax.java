package application.Errors;
import static application.View.myResources;

public class InvalidLogoSyntax extends SLogoException {
	public InvalidLogoSyntax() {
		myMessage = myResources.getString("invalidLogoSyntax");
	}

	
}
