/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.PenUpDownAction;

public class PenNode extends TurtleCommandsNode {
	
	public PenNode() {
		super();
		myMaxPossibleChildren = 0;
		myType = "PenNode";
	}

	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new PenUpDownAction(myValue));
		return myActions;
	}

}
