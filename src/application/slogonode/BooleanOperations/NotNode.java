/**
 *  @author Monica Choe
 *  Created: October 10th, 2014
 *  Modified: October 10th, 2014
 */

package application.slogonode.BooleanOperations;

import java.util.List;

import application.Actions.AbstractAction;

public class NotNode extends BooleanOperations{

	public NotNode() {
		myOperation = "NOT";
	}

	@Override
	public List<AbstractAction> evaluate(){
		double value = 0;
		if (myChildren.get(0).evaluate().get(0).getValue() == 0) {
			value = 1;
		}
		return createActionList(value);
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return (myChildren.size() < 1);
	}
}