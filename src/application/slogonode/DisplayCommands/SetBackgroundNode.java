/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.List;

import application.Actions.AbstractAction;

public class SetBackgroundNode extends SetIndexNode {
	
	public SetBackgroundNode() {
		myType = "SetBackground";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myActions = super.evaluate();
		return myActions;
	}
}