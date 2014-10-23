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
		myType = "TurtleCommands";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Turtle Command:" + myCommand;
	}

	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return (myChildren.size() < 1);
	}
}