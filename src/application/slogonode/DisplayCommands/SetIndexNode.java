/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.*;

import application.Actions.AbstractAction;

public abstract class SetIndexNode extends DisplayCommandsNode {
	
	public SetIndexNode() {
		super();
		myMaxPossibleChildren = 1;
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myActions.addAll(myChildren.get(0).evaluate());
		return myActions;
	}
}