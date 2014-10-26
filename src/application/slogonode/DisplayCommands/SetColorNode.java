/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public abstract class SetColorNode extends DisplayCommandsNode {
	
	@Override
	public List<AbstractAction> evaluate() {
		myActions.addAll(myChildren.get(0).evaluate());
		return myActions;
	}
}