/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public class StampNode extends DisplayCommandsNode {
	
	public StampNode() {
		super();
		myType = "Stamp";
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