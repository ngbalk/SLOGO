/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.*;
import application.Actions.AbstractAction;

public class SetShapeNode extends SetIndexNode {
	
	public SetShapeNode() {
		super();
		myType = "SetShape";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		myActions.add(new SetShapeAction(myValue));
		return myActions;
	}
}