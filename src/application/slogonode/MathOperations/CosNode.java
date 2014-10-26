/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

import java.util.*;
import application.Actions.AbstractAction;
import application.Actions.ConstantAction;

public class CosNode extends MathOperationsNode {

	public CosNode() {
		super();
		myType = "Cos";
	}

	@Override
	public List<AbstractAction> evaluate() {
		myValue = Math.cos(myChildren.get(0).evaluate().get(0).getValue());
		myActions.add(new ConstantAction(myValue));
		return myActions;
	}
}