/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 23rd, 2014
 */
package application.slogonode.Number;

import java.util.*;

import application.Actions.*;

public class ConstantNode extends NumberNode {
	
	public ConstantNode() {
		myType = "NUMBER";
	}
	
	public ConstantNode(double value) {
		super();
		myValue = value;
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		ArrayList<AbstractAction> actionList = new ArrayList<AbstractAction>();
		actionList.add(new ConstantAction(myValue));
		return actionList;
	}
}