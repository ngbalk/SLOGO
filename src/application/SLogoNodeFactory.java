/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 9th, 2014
 *  Modified: October 11th, 2014
 */
package application;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import application.Constants.GUIconstants;
import application.slogonode.*;
import application.slogonode.Number.*;
import application.slogonode.TurtleCommands.*;

public class SLogoNodeFactory {

	/**
	 * 
	 * @param nodeName
	 * @return
	 */

	public SLogoNode getSLogoNodeFromString(String nodeName,
			ResourceBundle myResources) {
		System.out.println("\nReached the factory!\n");
		SLogoNode commandNode = null;
		try {
			try {
				double constantValue = Double.parseDouble(nodeName);
				commandNode = new ConstantNode(constantValue);
			} 
			catch (Exception e) {
				System.out.println("This isn't a number: " + nodeName);
			}
			ResourceBundle classBundle = ResourceBundle.getBundle(GUIconstants.RESOURCE_FILE_PREFIX+"ClassType");
			System.out.println(classBundle);
			PropertiesFactory fact = new PropertiesFactory();
			Map<String, String> map = new HashMap<String, String>();
			map = fact.getCommandsMap(classBundle);
			Class classType = Class.forName(map.get(nodeName));
			commandNode = (SLogoNode) classType.newInstance();
		} catch (Exception e) {
			System.out.println("\nERROR! THIS COMMAND DOES NOT EXIST: "
					+ nodeName);
		} finally {
			if (commandNode == null)
				commandNode = new ForwardNode();
		}
		System.out.println("\nReturning a node: " + nodeName + ", "
				+ commandNode + "\n");
		return commandNode;
	}
}
