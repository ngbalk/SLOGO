/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

public class LogNode extends MathOperations {

	public LogNode() {
		myType = "MathOperation";
		myOperation = "LOG";
	}

	@Override
	public int evaluate() {
		return (int) Math.log(myChildren.get(0).evaluate());
	}

}