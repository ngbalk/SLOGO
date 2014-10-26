package application.Constants;

public final class ExceptionConstants {
	public static final String INVALID_SLOGO_SYNTAX = "invalidSLogoSyntax";
	public static final String NULL_INPUT = "nullInput";
	public static final String DIVIDE_BY_ZERO = "divideByZero";
	public static final String FXML_EXCEPTION = "fxmlException";
	public static final String PROPERTIES_ERROR = "propertiesException";
	
	private ExceptionConstants() {
		throw new AssertionError();
	}
}
