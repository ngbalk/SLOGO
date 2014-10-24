/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 3rd, 2014
 */
package application.slogonode.MathOperations;

import java.util.List;
import application.Actions.AbstractAction;

public class ProductNode extends MathOperations {

	public ProductNode() {
		myOperation = "PRODUCT";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = myChildren.get(0).evaluate().get(0).getValue();
		for (int i = 1; i<myChildren.size(); i++){
			value = value*myChildren.get(i).evaluate().get(0).getValue();
		}
		return createActionList(value);
	}

	@Override
	public boolean needsMoreChildrenForEvaluation(){
		return myChildren.size() < 2; 
	}
}