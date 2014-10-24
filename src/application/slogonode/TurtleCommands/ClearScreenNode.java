/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.ClearScreenAction;
import application.Actions.HomeAction;

public class ClearScreenNode extends TurtleCommandsNode {
	
	public ClearScreenNode() {
		myType = "ClearScreen";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return false;
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		actionList.add(new ClearScreenAction());
		return actionList;
	}

}
