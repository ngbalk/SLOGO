/**
 *  @author Pranava Raparla
 *  Created: October 11th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.BackwardAction;
import application.Actions.ForwardAction;

public class BackwardNode extends TurtleCommandsNode {
	
	public BackwardNode() {
		super();
		myType = "MoveBackward";
	}

	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new ForwardAction(-1*myChildren.get(0).evaluate().get(0).getValue()));
		return myActions;
	}
}