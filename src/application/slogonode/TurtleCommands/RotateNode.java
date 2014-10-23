/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.TurtleCommands;

import application.Actions.AbstractAction;
import application.Actions.RightAction;
import application.slogonode.SLogoNode;

public abstract class RotateNode extends TurtleCommandsNode {
	
	public RotateNode() {
		super();
		myCommand = "Rotate";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}