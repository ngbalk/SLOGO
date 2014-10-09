/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 4th, 2014
 *  Modified: October 9th, 2014
 */
package application;

import java.io.*;
import java.util.*;

public class PropertiesFactory {
	
	public Map<String,List<String>> getPropertyValues(String fileName) throws IOException  {
		Map<String,List<String>> propertiesMap = new HashMap<String,List<String>>();
		Properties myProperties = new Properties();		
		System.out.println("Properties created.");
		InputStream inputStream = null;
		try {
			inputStream = this.getClass().getClassLoader().getResourceAsStream(fileName); 
		} catch (Exception e) {
			e.printStackTrace();
		}
		//System.out.println("Input Stream: " + inputStream);
		System.out.println("Got through basic property set up.");
		myProperties.load(inputStream);
		System.out.println("InputStream" + inputStream);
		
		String[] turtleCommands = {"Forward","Backward","Left","Right","SetHeading","SetTowards","SetPosition","PenDown","PenUp","ShowTurtle","HideTurtle","Home","ClearScreen"};
		String[] turtleQueries = {"XCoordinate","YCoordinate","Heading","IsPenDown","IsShowing"};
		String[] mathOperations = {"Sum","Difference","Product","Quotient","Remainder","Minus","Random","Sine","Cosine","Tangent","ArcTangent","NaturalLog","Power"};
		String[] variables = {"LessThan","GreaterThan","Equal","NotEqual","And","Or","Not"};
		String[] control = {"MakeVariable","Repeat","DoTimes","For","If","IfElse","MakeUserInstruction"};
		String[] displayCommands = {"SetBackground","SetPenColor","SetPenSize","SetShape","SetPalette","GetPenColor","GetShape","Stamp","ClearStamps"};
		String[] multipleTurtleCommands = {"ID","Tell","Ask","AskWith"};
		String[] LanguageSyntax = {"Comment","Constant","Variable","Command","ListStart","ListEnd","GroupStart","GroupEnd"};
		
		for(String str: turtleCommands)
			propertiesMap.put(str,getPropertyValuesHelper(str,myProperties));
		for(String str: turtleQueries)
			propertiesMap.put(str,getPropertyValuesHelper(str,myProperties));
		for(String str: mathOperations)
			propertiesMap.put(str,getPropertyValuesHelper(str,myProperties));
		for(String str: variables)
			propertiesMap.put(str,getPropertyValuesHelper(str,myProperties));
		for(String str: control)
			propertiesMap.put(str,getPropertyValuesHelper(str,myProperties));
		for(String str: displayCommands)
			propertiesMap.put(str,getPropertyValuesHelper(str,myProperties));
		for(String str: multipleTurtleCommands)
			propertiesMap.put(str,getPropertyValuesHelper(str,myProperties));
		for(String str: LanguageSyntax)
			propertiesMap.put(str,getPropertyValuesHelper(str,myProperties));
		
		return propertiesMap;
	}
	
	public List<String> getPropertyValuesHelper(String command, Properties myProperties) {
		return new ArrayList<String>(Arrays.asList(myProperties.getProperty(command).split(",")));
	}
	
}
