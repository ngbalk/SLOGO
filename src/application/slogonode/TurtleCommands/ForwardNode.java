/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.ForwardAction;
import application.Actions.RotateAction;

public class ForwardNode extends TurtleCommandsNode {
	
	public ForwardNode() {
		super();
		myType = "MoveForward";
		myMaxPossibleChildren = 1; 
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		super.evaluate();
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		myActions.add(new ForwardAction(myValue));
		return myActions;
	}
}