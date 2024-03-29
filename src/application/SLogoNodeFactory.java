/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 9th, 2014
 *  Modified: October 26th, 2014
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
	public SLogoNode getSLogoNodeFromString(String nodeName) {
		SLogoNode commandNode = null;
		Map<String, String> pathNamesMap= new HashMap<String, String>();
		try {
			try {
				commandNode = (SLogoNode) getConstantSLogoNode(nodeName);
			} 
			catch (Exception e) {
				ResourceBundle classBundle = ResourceBundle.getBundle(GUIconstants.RESOURCE_FILE_PREFIX+"ClassType");
				PropertiesFactory fact = new PropertiesFactory();
				pathNamesMap = fact.getCommandsMap(classBundle);
				Class classType = Class.forName(pathNamesMap.get(nodeName));
				commandNode = (SLogoNode) classType.newInstance();

			}
		} catch (Exception e) {
			System.out.println("\nERROR! THIS COMMAND DOES NOT EXIST: " + nodeName);
		} finally {
			// TODO: SEND TO ERROR PAGE IF NULL!!!!
			//System.out.println("ERROR! THIS COMMAND DOES NOT EXIST");
		}
		return commandNode;
	}
	/**
	 * 
	 * @param nodeValue
	 * @return
	 */
	public SLogoNode getConstantSLogoNode(String nodeValue) {
		return (SLogoNode) new ConstantNode(Double.parseDouble(nodeValue));
	}
}
