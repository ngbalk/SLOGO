package application.Errors;

public abstract class SLogoException extends Exception{
	protected String myMessage;
	public SLogoException() {
		// TODO Auto-generated constructor stub
	}
	public String displayMessage(){
		return myMessage;
	}

}
