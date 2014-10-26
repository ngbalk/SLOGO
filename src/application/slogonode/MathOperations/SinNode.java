/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

import java.util.List;
import application.Actions.AbstractAction;

public class SinNode extends MathOperations {

	public SinNode() {
		myType = "Sin";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = Math.sin(myChildren.get(0).evaluate().get(0).getValue());
		return createActionList(value);
	}
}