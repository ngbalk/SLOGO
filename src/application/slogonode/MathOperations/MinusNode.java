/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

public class MinusNode extends MathOperations {

	public MinusNode() {
		myType = "MathOperation";
		myOperation = "MINUS";
	}

	@Override
	public int evaluate() {
		return -1 * myChildren.get(0).evaluate();
	}

}