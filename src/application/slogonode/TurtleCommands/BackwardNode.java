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
import application.slogonode.SLogoNode;

public class BackwardNode extends TurtleCommandsNode {
	
	public BackwardNode() {
		super();
		myCommand = "MoveBackward";
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		AbstractAction action = new BackwardAction(myValue);
		actionList.add(action);
		return actionList;
	}
}