/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application;

import java.io.*;
import java.util.*;

public class PropertiesFactory {

	/**
	 * 
	 * @param fileName
	 * @return
	 * @throws IOException
	 */
	public Map<String, String> getPropertyValues(String fileName)
			throws IOException {
		Map<String, String> propertiesMap = new HashMap<String, String>();
		Properties myProperties = new Properties();
		System.out.println("Properties created.");
		InputStream inputStream = null;
		try {
			inputStream = this.getClass().getClassLoader()
					.getResourceAsStream(fileName);
		} catch (Exception e) {
			e.printStackTrace();
		}
		System.out.println("Got through basic property set up.");
		myProperties.load(inputStream);

		String[] turtleCommands = { "Forward", "Backward", "Left", "Right",
				"SetHeading", "SetTowards", "SetPosition", "PenDown", "PenUp",
				"ShowTurtle", "HideTurtle", "Home", "ClearScreen" };
		String[] turtleQueries = { "XCoordinate", "YCoordinate", "Heading",
				"IsPenDown", "IsShowing" };
		String[] mathOperations = { "Sum", "Difference", "Product", "Quotient",
				"Remainder", "Minus", "Random", "Sine", "Cosine", "Tangent",
				"ArcTangent", "NaturalLog", "Power" };
		String[] variables = { "LessThan", "GreaterThan", "Equal", "NotEqual",
				"And", "Or", "Not" };
		String[] control = { "MakeVariable", "Repeat", "DoTimes", "For", "If",
				"IfElse", "MakeUserInstruction" };
		String[] displayCommands = { "SetBackground", "SetPenColor",
				"SetPenSize", "SetShape", "SetPalette", "GetPenColor",
				"GetShape", "Stamp", "ClearStamps" };
		String[] multipleTurtleCommands = { "ID", "Tell", "Ask", "AskWith" };
		String[] LanguageSyntax = { "Comment", "Constant", "Variable",
				"Command", "ListStart", "ListEnd", "GroupStart", "GroupEnd" };

		for (String command : turtleCommands)
			getPropertyValuesHelper(propertiesMap, command, myProperties);
		for (String command : turtleQueries)
			getPropertyValuesHelper(propertiesMap, command, myProperties);
		for (String command : mathOperations)
			getPropertyValuesHelper(propertiesMap, command, myProperties);
		for (String command : variables)
			getPropertyValuesHelper(propertiesMap, command, myProperties);
		for (String command : control)
			getPropertyValuesHelper(propertiesMap, command, myProperties);
		for (String command : displayCommands)
			getPropertyValuesHelper(propertiesMap, command, myProperties);
		for (String command : multipleTurtleCommands)
			getPropertyValuesHelper(propertiesMap, command, myProperties);
		for (String command : LanguageSyntax)
			getPropertyValuesHelper(propertiesMap, command, myProperties);

		return propertiesMap;
	}

	/**
	 * 
	 * @param command
	 * @param myProperties
	 * @return
	 */
	public void getPropertyValuesHelper(Map<String, String> map,
			String command, Properties myProperties) {
		String[] commandsInSpecificLanguage = myProperties.getProperty(command)
				.split(",");
		map.put(commandsInSpecificLanguage[0], command);
		if (commandsInSpecificLanguage.length > 1) {
			map.put(commandsInSpecificLanguage[1], command);
		}
	}

}
