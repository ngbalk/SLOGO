/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import application.Actions.AbstractAction;
import application.Actions.RtAction;
import application.slogonode.SLogoNode;

public class RotateRightNode extends RotateNode {
	
	public RotateRightNode() {
		super();
		myCommand = "RotateRight";
	}

	@Override
	public int evaluate() {
		myValue = myChildren.get(0).evaluate();
		AbstractAction action = new RtAction(myValue);
		myActions.add(action);
		myChildren.get(1).evaluate();
		return myValue;
	}
	
}