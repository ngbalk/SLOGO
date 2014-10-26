/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public class ClearStampsNode extends DisplayCommandsNode {
	
	public ClearStampsNode() {
		super();
		myType = "ClearStamps";
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