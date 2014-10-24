/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */

package application.slogonode.TurtleCommands;

import java.util.*;
import application.Actions.AbstractAction;

public class ShowTurtleNode extends PenNode {
	
	public ShowTurtleNode() {
		myType = "ShowTurtle";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myValue = 1;
		return super.evaluate();
	}

}