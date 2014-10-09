/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import application.Actions.AbstractAction;
import application.Actions.RtAction;
import application.slogonode.SLogoNode;

public abstract class RotateNode extends TurtleCommandsNode {
	
	public RotateNode() {
		super();
		myCommand = "Rotate";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int evaluate() {
		myValue = myChildren.get(0).evaluate();
		AbstractAction action = new RtAction(myValue);
		myActions.add(action);
		myChildren.get(1).evaluate();
		return myValue;
	}
}