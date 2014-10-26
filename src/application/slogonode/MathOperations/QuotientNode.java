/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

import java.util.List;
import application.Actions.AbstractAction;

public class QuotientNode extends TwoChildMathOperationsNode {

	public QuotientNode() {
		myType = "Quotient";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = myChildren.get(0).evaluate().get(0).getValue() / myChildren.get(1).evaluate().get(0).getValue();
		return createActionList(value);
	}
}