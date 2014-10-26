/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.ConstantAction;

public class PowNode extends TwoChildMathOperationsNode {

	public PowNode() {
		super();
		myType = "Pow";
	}

	@Override
	public List<AbstractAction> evaluate() {
		myValue = Math.pow(myChildren.get(0).evaluate().get(0).getValue(),myChildren.get(1).evaluate().get(0).getValue());
		myActions.add(new ConstantAction(myValue));
		return myActions;
	}
}