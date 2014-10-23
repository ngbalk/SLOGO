/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.LeftAction;
import application.Actions.RightAction;
import application.slogonode.SLogoNode;

public class LeftNode extends RotateNode {
	
	public LeftNode() {
		super();
		myCommand = "RotateLeft";
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		AbstractAction action = new LeftAction(myValue);
		actionList.add(action);
		return actionList;
	}	
}