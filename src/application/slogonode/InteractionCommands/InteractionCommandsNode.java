/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */

package application.slogonode.InteractionCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public abstract class InteractionCommandsNode extends SLogoNode {
	
	public InteractionCommandsNode() {
		myType = "OnKey";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return (myChildren.size() < 2);
	}
}