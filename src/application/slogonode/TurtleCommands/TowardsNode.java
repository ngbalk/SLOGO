/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.TowardsAction;
import application.slogonode.SLogoNode;

public class TowardsNode extends TurtleCommandsNode {
	
	public TowardsNode() {
		myType = "Towards";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		actionList.add(new TowardsAction(myChildren.get(1).evaluate().get(0).getValue(),myChildren.get(0).evaluate().get(0).getValue()));
		myValue = actionList.get(0).getValue();
		return actionList;
	}
}