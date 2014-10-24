/**
 *  @author Monica Choe
 *  Created: October 10th, 2014
 *  Modified: October 10th, 2014
 */

package application.slogonode.BooleanOperations;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.ConstantAction;

public class NotNode extends BooleanOperations{

	public NotNode() {
		myOperation = "NOT";
	}

	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		double value = 0;
		if (myChildren.get(0).evaluate().get(0).getValue() == 0) {
			value = 1;
		}
		AbstractAction action = new ConstantAction(value);
		actionList.add(action);
		return actionList;
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return (myChildren.size() < 1);
	}
}