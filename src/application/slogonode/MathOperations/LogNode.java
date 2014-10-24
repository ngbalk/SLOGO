/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.MathOperations;

import java.util.List;
import application.Actions.AbstractAction;

public class LogNode extends MathOperations {

	public LogNode() {
		myOperation = "LOG";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = Math.log(myChildren.get(0).evaluate().get(0).getValue());
		return createActionList(value);
	}

}