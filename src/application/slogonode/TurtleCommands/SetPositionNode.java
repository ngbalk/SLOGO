/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.SetPositionAction;

public class SetPositionNode extends TurtleCommandsNode {
	
	public SetPositionNode() {
		super();
		myMaxPossibleChildren = 2;
		myType = "SetPosition";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new SetPositionAction(myChildren.get(0).evaluate().get(0).getValue(),myChildren.get(1).evaluate().get(0).getValue()));
		myValue = myActions.get(0).getValue();
		return myActions;
	}
}