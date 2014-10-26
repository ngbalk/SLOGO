/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import application.slogonode.SLogoNode;

public abstract class TurtleCommandsNode extends SLogoNode {
	
	protected String myCommand;
	
	public TurtleCommandsNode() {
		super();
		myMaxPossibleChildren = 1;
		myType = "TurtleCommands";
	}
	
	@Override
	public String toString() {
		return super.toString() + " Turtle Command:" + myCommand;
	}
}