/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.RotateAction;

public class LeftNode extends RotateNode {
	
	public LeftNode() {
		super();
		myType = "RotateLeft";
	}

	@Override
	public List<AbstractAction> evaluate() {
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		myActions.add(new RotateAction(myValue));
		return myActions;
	}	
}