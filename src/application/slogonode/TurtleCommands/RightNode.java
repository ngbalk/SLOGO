/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.ForwardAction;
import application.Actions.RightAction;
import application.slogonode.SLogoNode;

public class RightNode extends RotateNode {
	
	public RightNode() {
		super();
		myCommand = "RotateRight";
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		AbstractAction action = new RightAction(myValue);
		actionList.add(action);
		return actionList;
	}	
}