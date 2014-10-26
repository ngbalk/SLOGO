/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import application.slogonode.SLogoNode;

public abstract class TurtleCommandsNode extends SLogoNode {
	
	public TurtleCommandsNode() {
		super();
		myMaxPossibleChildren = 1;
		myType = "TurtleCommands";
	}
}