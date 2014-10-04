/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

public class CosNode extends MathOperations {

	public CosNode() {
		myType = "MathOperation";
		myOperation = "COS";
	}

	@Override
	public int evaluate() {
		return (int) Math.cos(myChildren.get(0).evaluate());
	}

}