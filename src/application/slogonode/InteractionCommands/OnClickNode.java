/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.InteractionCommands;

import java.util.*;
import application.Actions.AbstractAction;

public class OnClickNode extends InteractionCommandsNode {
	
	public OnClickNode() {
		super();
		myType = "OnClick";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		// TODO: Implement this method!
		return myActions;
	}
}