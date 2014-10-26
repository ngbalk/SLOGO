/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

import java.util.*;
import application.Actions.AbstractAction;
import application.Actions.ConstantAction;

public class RandomNode extends MathOperationsNode {

	public RandomNode() {
		super();
		myType = "Random";
	}

	@Override
	public List<AbstractAction> evaluate() {
		Random rand = new Random();
		myValue = rand.nextInt((int)myChildren.get(0).evaluate().get(0).getValue());
		myActions.add(new ConstantAction(myValue));
		return myActions;
	}
}