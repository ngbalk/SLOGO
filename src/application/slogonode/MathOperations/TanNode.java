/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

import java.util.*;
import application.Actions.AbstractAction;
import application.Actions.ConstantAction;

public class TanNode extends OneChildMathOperationsNode {

	public TanNode() {
		super();
		myType = "Tan";
	}

	@Override
	public List<AbstractAction> evaluate() {
		myValue = Math.tan(myChildren.get(0).evaluate().get(0).getValue());
		myActions.add(new ConstantAction(myValue));
		return myActions;
	}
}