/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.HomeAction;

public class HomeNode extends TurtleCommandsNode {
	
	public HomeNode() {
		super();
		myMaxPossibleChildren = 0;
		myType = "Home";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new HomeAction());
		return myActions;
	}
}