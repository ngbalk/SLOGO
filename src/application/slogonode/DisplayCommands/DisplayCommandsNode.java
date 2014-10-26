/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.*;
import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public abstract class DisplayCommandsNode extends SLogoNode {
	
	public DisplayCommandsNode() {
		super();
		myMaxPossibleChildren = 1;
		myType = "DisplayCommands";
	}
}