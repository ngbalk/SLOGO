/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import application.Actions.AbstractAction;
import application.Actions.FwdAction;
import application.slogonode.SLogoNode;

public class MoveForwardNode extends TurtleCommandsNode {
	
	public MoveForwardNode() {
		super();
		myCommand = "MoveForward";
	}
	
	@Override
	public int evaluate() {
		for(int i=0; i<myChildren.size(); i++) {
			if(myChildren.get(0)!=null) {
				myValue = myChildren.get(0).evaluate();
				AbstractAction action = new FwdAction(myValue);
				myActions.add(action);
			}
			if(myChildren.get(1)!=null)
				myChildren.get(1).evaluate();
		}
		return myValue;
	}
}