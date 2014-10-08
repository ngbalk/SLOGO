/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

public class AtanNode extends MathOperations {

	public AtanNode() {
		myOperation = "ATAN";
	}

	@Override
	public int evaluate() {
		return (int) Math.atan(myChildren.get(0).evaluate());
	}

}