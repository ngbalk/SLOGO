/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.PenUpDownAction;

public class PenNode extends TurtleCommandsNode {
		
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return false;
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		AbstractAction penAction = new PenUpDownAction(myValue);
		actionList.add(penAction);
		return actionList;
	}

}
