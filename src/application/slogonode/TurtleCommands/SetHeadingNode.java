/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.SetHeadingAction;

public class SetHeadingNode extends TurtleCommandsNode {
	
	public SetHeadingNode() {
		super();
		myType = "SetHeading";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		myActions.add(new SetHeadingAction(myValue));
		return myActions;
	}
}