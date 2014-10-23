/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 23rd, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.ForwardAction;
import application.slogonode.SLogoNode;

public abstract class MoveNode extends TurtleCommandsNode {
	
	public MoveNode() {
		super();
		myCommand = "Move";
	}
	
	@Override
	public String toString() {
		return super.toString();
	}
	
}