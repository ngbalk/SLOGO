/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.List;

import application.Actions.AbstractAction;

public class SetPenSizeNode extends SetIndexNode {
	
	public SetPenSizeNode() {
		myType = "SetSizeColor";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		myActions.add(new SetPenSizeAction(myValue));
		return myActions;
	}
}