/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 23rd, 2014
 */
package application.slogonode.Number;

import java.util.*;

import application.Actions.*;

public class ConstantNode extends NumberNode {
		
	public ConstantNode(double value) {
		super();
		myValue = value;
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		System.out.println("ConstantNode evaluating...myvalue=" + myValue);
		ArrayList<AbstractAction> actionList = new ArrayList<AbstractAction>();
		AbstractAction newAction = new ConstantAction(myValue);
		actionList.add(newAction);
		return actionList;
	}
}