/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

import java.util.List;
import java.util.Random;
import application.Actions.AbstractAction;

public class RandomNode extends MathOperations {

	public RandomNode() {
		myOperation = "RANDOM";
	}

	@Override
	public List<AbstractAction> evaluate() {
		Random rand = new Random();
		double value = rand.nextInt((int)myChildren.get(0).evaluate().get(0).getValue());
		return createActionList(value); 
	}

}