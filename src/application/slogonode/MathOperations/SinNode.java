/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

public class SinNode extends MathOperations {

	public SinNode() {
		myType = "MathOperation";
		myOperation = "SIN";
	}

	@Override
	public int evaluate() {
		return (int) Math.sin(myChildren.get(0).evaluate());
	}

}