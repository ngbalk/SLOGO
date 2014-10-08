/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 3rd, 2014
 */
package application.slogonode.MathOperations;

public class DifferenceNode extends MathOperations {

	public DifferenceNode() {
		myOperation = "DIFFERENCE";
	}

	@Override
	public int evaluate() {
		return myChildren.get(0).evaluate() - myChildren.get(1).evaluate();
	}

}
