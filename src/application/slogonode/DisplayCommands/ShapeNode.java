/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.*;
import application.Actions.AbstractAction;

public class ShapeNode extends DisplayCommandsNode {
	
	public ShapeNode() {
		super();
		myType = "Shape";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		// TODO: Implement this method!
		return myActions;
	}
}