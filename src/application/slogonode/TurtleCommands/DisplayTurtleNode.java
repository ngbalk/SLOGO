/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.DisplayTurtleAction;
import application.Actions.PenAction;

public class DisplayTurtleNode extends TurtleCommandsNode {
		
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return false;
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		AbstractAction action = new DisplayTurtleAction(myValue);
		actionList.add(action);
		return actionList;
	}

}