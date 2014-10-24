/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 23rd, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.RotateAction;
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
		AbstractAction action = new RotateAction(-myValue);
		actionList.add(action);
		return actionList;
	}	
}