/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.Number;

import java.util.*;

import application.Actions.*;

public class ConstantNode extends NumberNode {
	
	public ConstantNode() {
		super();
		myType = "Constant";
	}
	
	public ConstantNode(double value) {
		this();
		myValue = value;
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new ConstantAction(myValue));
		return myActions;
	}
}