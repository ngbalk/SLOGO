/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

public class QuotientNode extends MathOperations {

	public QuotientNode() {
		myOperation = "QUOTIENT";
	}

	@Override
	public int evaluate() {
		return myChildren.get(0).evaluate() / myChildren.get(1).evaluate();
	}

}