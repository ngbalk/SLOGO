/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.PenAction;
import application.Actions.SetHeadingAction;
import application.slogonode.SLogoNode;

public class SetHeadingNode extends TurtleCommandsNode {
	
	public SetHeadingNode() {
		myType = "SetHeading";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		actionList.add(new SetHeadingAction(myValue));
		return actionList;
	}
}