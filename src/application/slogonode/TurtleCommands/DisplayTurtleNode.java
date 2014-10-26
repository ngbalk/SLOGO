/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.DisplayTurtleAction;

public class DisplayTurtleNode extends TurtleCommandsNode {
		
	public DisplayTurtleNode() {
		super();
		myMaxPossibleChildren = 0;
		myType = "DisplayTurtle";
	}

	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new DisplayTurtleAction(myValue));
		return myActions;
	}
}