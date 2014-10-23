/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 23rd, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.ForwardAction;
import application.slogonode.SLogoNode;

public class ForwardNode extends TurtleCommandsNode {
	
	public ForwardNode() {
		super();
		myCommand = "MoveForward";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		AbstractAction action = new ForwardAction(myValue);
		actionList.add(action);
		return actionList;
	}
}