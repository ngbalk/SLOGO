/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.ForwardAction;

public abstract class MoveNode extends TurtleCommandsNode {
	
	public MoveNode() {
		super();
		myType = "Move";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		super.evaluate();
		myActions.add(new MoveAction(myValue));
		return myActions;
	}
}