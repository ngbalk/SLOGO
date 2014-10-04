/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

public class TanNode extends MathOperations {

	public TanNode() {
		myType = "MathOperation";
		myOperation = "TAN";
	}

	@Override
	public int evaluate() {
		return (int) Math.tan(myChildren.get(0).evaluate());
	}

}