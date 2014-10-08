/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

public class PowNode extends MathOperations {

	public PowNode() {
		myOperation = "POW";
	}

	@Override
	public int evaluate() {
		return (int) Math.pow(myChildren.get(0).evaluate(),myChildren.get(1).evaluate());
	}

}