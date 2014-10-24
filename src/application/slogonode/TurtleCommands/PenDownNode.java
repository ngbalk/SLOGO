/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.slogonode.TurtleCommands;

import java.util.*;

import application.Actions.AbstractAction;

public class PenDownNode extends PenNode {
	protected String myCommand;
	
	public PenDownNode() {
		myType = "PenDown";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myValue = 1;
		return super.evaluate();
	}
}