/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.HomeAction;

public class HomeNode extends TurtleCommandsNode {
	
	public HomeNode() {
		myType = "Home";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return false;
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		actionList.add(new HomeAction());
		return actionList;
	}
}