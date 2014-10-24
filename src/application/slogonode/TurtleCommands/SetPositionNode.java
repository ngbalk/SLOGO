/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.SetPositionAction;
import application.Actions.SetTowardsAction;
import application.slogonode.SLogoNode;

public class SetPositionNode extends TurtleCommandsNode {
	
	public SetPositionNode() {
		myType = "SetPosition";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return (myChildren.size() < 2);
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		actionList.add(new SetPositionAction(myChildren.get(0).evaluate().get(0).getValue(),myChildren.get(1).evaluate().get(0).getValue()));
		myValue = actionList.get(0).getValue();
		return actionList;
	}
}