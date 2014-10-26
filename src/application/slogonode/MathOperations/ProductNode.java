/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

import java.util.List;
import application.Actions.AbstractAction;

public class ProductNode extends TwoChildMathOperationsNode {

	public ProductNode() {
		myType = "PRODUCT";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = myChildren.get(0).evaluate().get(0).getValue();
		for (int i = 1; i<myChildren.size(); i++){
			value = value*myChildren.get(i).evaluate().get(0).getValue();
		}
		return createActionList(value);
	}
}