/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.InteractionCommands;

import application.slogonode.SLogoNode;

public abstract class InteractionCommandsNode extends SLogoNode {
	
	public InteractionCommandsNode() {
		super();
		myMaxPossibleChildren = 2;
		myType = "InteractionCommands";
	}
}