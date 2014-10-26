/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;
import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public abstract class TurtleCommandsNode extends SLogoNode {
	
	public TurtleCommandsNode() {
		super();
		myMaxPossibleChildren = 1;
		myType = "TurtleCommands";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		for(int i=0; i<myChildren.size(); i++)
			myActions.addAll(myChildren.get(0).evaluate());
		return myActions;
	}
}