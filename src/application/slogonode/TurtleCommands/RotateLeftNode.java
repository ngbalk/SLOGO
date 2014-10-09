/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import application.Actions.AbstractAction;
import application.Actions.LftAction;
import application.slogonode.SLogoNode;

public class RotateLeftNode extends RotateNode {
	
	public RotateLeftNode() {
		super();
		myCommand = "RotateLeft";
	}

	@Override
	public int evaluate() {
		myValue = myChildren.get(0).evaluate();
		AbstractAction action = new LftAction(myValue);
		myActions.add(action);
		myChildren.get(1).evaluate();
		return myValue;
	}
	
}