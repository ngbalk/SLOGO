/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import application.Actions.AbstractAction;
import application.Actions.FwdAction;
import application.slogonode.SLogoNode;

public abstract class MoveNode extends TurtleCommandsNode {
	
	public MoveNode() {
		super();
		myCommand = "Move";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
	@Override
	public int evaluate() {
		myValue = myChildren.get(0).evaluate();
		AbstractAction action = new FwdAction(myValue);
		myActions.add(action);
		myChildren.get(1).evaluate();
		return myValue;
	}
}