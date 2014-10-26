/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.ClearScreenAction;

public class ClearScreenNode extends TurtleCommandsNode {
	
	public ClearScreenNode() {
		super();
		myMaxPossibleChildren = 0;
		myType = "ClearScreen";
	}

	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new ClearScreenAction());
		return myActions;
	}
}
