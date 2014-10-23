/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.FwdAction;
import application.slogonode.SLogoNode;

public class MoveForwardNode extends TurtleCommandsNode {
	
	public MoveForwardNode() {
		super();
		myCommand = "MoveForward";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		AbstractAction action = new FwdAction(myValue);
		actionList.add(action);
		return actionList;
	}
}