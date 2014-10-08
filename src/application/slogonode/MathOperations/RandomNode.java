/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

import java.util.Random;

public class RandomNode extends MathOperations {

	public RandomNode() {
		myOperation = "RANDOM";
	}

	@Override
	public int evaluate() {
		Random rand = new Random();
		return rand.nextInt(myChildren.get(0).evaluate());
	}

}