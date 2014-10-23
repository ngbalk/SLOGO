/**
 *  @author Monica Choe
 *  Created: October 10th, 2014
 *  Modified: October 10th, 2014
 */

package application.slogonode.BooleanOperations;

public class NotNode extends BooleanOperations{

	public NotNode() {
		myOperation = "NOT";
	}

	public int evaluate() {
		return myChildren.get(0).evaluate() == 1 ? 0 : 1;
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return (myChildren.size() < 1);
	}
}