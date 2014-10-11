/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import application.Actions.AbstractAction;
import application.Actions.LftAction;
import application.Actions.RtAction;
import application.slogonode.SLogoNode;

public class RotateLeftNode extends RotateNode {
	
	public RotateLeftNode() {
		super();
		myCommand = "RotateLeft";
	}

	@Override
	public int evaluate() {
		for(int i=0; i<myChildren.size(); i++) {
			if(myChildren.get(i)==null)
				continue;
			else if(i==0) {
				myValue = myChildren.get(0).evaluate();
				AbstractAction action = new LftAction(myValue);
				myActions.add(action);
				System.out.println("ACTION ADDED: " + myCommand + " " + myValue);
			}
			if(i==1)
				myChildren.get(1).evaluate();
		}
		return myValue;
	}
	
}