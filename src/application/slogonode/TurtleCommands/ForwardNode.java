/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.ForwardAction;

public class ForwardNode extends TurtleCommandsNode {
	
	public ForwardNode() {
		super();
		myCommand = "MoveForward";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new ForwardAction(myChildren.get(0).evaluate().get(0).getValue()));
		return myActions;
	}
}