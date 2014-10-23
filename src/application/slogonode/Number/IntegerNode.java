/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 23rd, 2014
 */
package application.slogonode.Number;

import java.util.*;

import application.Actions.*;

public class IntegerNode extends NumberNode {
	
	public IntegerNode() {
		myType = "NUMBER";
		myOperation = "INTEGER";
	}
	
	public IntegerNode(int value) {
		this();
		myValue = value;
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		ArrayList<AbstractAction> actionList = new ArrayList<AbstractAction>();
		actionList.add(new IntegerAction(myValue));
		return actionList;
	}
}