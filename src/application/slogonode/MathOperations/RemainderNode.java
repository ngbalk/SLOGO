/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

import java.util.List;

import application.Actions.AbstractAction;

public class RemainderNode extends MathOperations {

	public RemainderNode() {
		myOperation = "REMAINDER";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = myChildren.get(0).evaluate().get(0).getValue() % myChildren.get(1).evaluate().get(0).getValue();
		return createActionList(value);
	}

	@Override
	public boolean needsMoreChildrenForEvaluation(){
		return myChildren.size() < 2; 
	}
}