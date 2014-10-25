/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */

package application.slogonode.InteractionCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public class OnMoveNode extends InteractionCommandsNode {
	
	public OnMoveNode() {
		myType = "OnClick";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return (myChildren.size() < 1);
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		// TODO: Implement this method!
		return null;
	}
}