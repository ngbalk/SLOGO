/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 9th, 2014
 *  Modified: October 11th, 2014
 */
package application;

import java.util.*;
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
			} catch (Exception e) {
				System.out.println("This isn't a number: " + nodeName);
			}
			Class classType = Class
					.forName("application.slogonode.TurtleCommands." + nodeName
							+ "Node");
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
