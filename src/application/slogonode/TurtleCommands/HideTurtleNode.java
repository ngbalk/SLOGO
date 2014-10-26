/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.TurtleCommands;

import java.util.*;
import application.Actions.AbstractAction;

public class HideTurtleNode extends DisplayTurtleNode {
	
	public HideTurtleNode() {
		super();
		myType = "ShowTurtle";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myValue = 0;
		return super.evaluate();
	}
}