/**
 *  @author Pranava Raparla
 *  Created: October 11th, 2014
 *  Modified: October 23rd, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.BackwardAction;
import application.Actions.ForwardAction;
import application.slogonode.SLogoNode;

public class BackwardNode extends TurtleCommandsNode {
	
	public BackwardNode() {
		super();
		myCommand = "MoveBackward";
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		System.out.println("CHECKPOINT: children - " + myChildren.size());
		SLogoNode child = myChildren.get(0);
		List<AbstractAction> constantActionList = null;
		try {
			if(child != null)
				constantActionList = child.evaluate();
		} catch (Exception e) {
			System.out.println("Try catch messed up!");
		}
		AbstractAction constantAction = constantActionList.get(0);
		myValue = constantAction.getValue();
		AbstractAction action = new ForwardAction(-myValue);
		actionList.add(action);
		return actionList;
	}
}