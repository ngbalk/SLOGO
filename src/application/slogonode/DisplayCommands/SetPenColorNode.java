/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.SetBackgroundAction;

public class SetPenColorNode extends SetIndexNode {
	
	public SetPenColorNode() {
		super();
		myType = "SetPenColor";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		myActions.add(new SetPenColorAction(myValue));
		return myActions;
	}
}