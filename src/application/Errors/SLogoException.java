package application.Errors;

public abstract class SLogoException extends Exception{
	protected String myMessage;
	public SLogoException() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String getMessage(){
		return myMessage;
	}

}
