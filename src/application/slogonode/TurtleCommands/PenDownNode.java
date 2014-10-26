/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;

public class PenDownNode extends PenNode {
	
	public PenDownNode() {
		super();
		myType = "PenDown";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myValue = 1;
		return super.evaluate();
	}
}