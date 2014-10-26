/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 9th, 2014
 *  Modified: October 26th, 2014
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
	public SLogoNode getSLogoNodeFromString(String nodeName) {
		System.out.println("\nReached the factory!\n");
		SLogoNode commandNode = null;
		try {
			try {
				commandNode = getConstantSLogoNode(nodeName);
			} catch (Exception e) {
				Class classType = Class.forName("application.slogonode.DisplayCommands." + nodeName + "Node");
				commandNode = (SLogoNode) classType.newInstance();
			}
		} catch (Exception e) {
			System.out.println("\nERROR! THIS COMMAND DOES NOT EXIST: " + nodeName);
		} finally {
			// TODO: SEND TO ERROR PAGE IF NULL!!!!
			if (commandNode == null)
				commandNode = new ForwardNode();
		}
		System.out.println("\nReturning a node: " + nodeName + ", " + commandNode + "\n");
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