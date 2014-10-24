/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 3rd, 2014
 */
package application.slogonode.MathOperations;

import java.util.List;
import application.Actions.AbstractAction;

public class SumNode extends MathOperations {

	public SumNode() {
		myOperation = "SUM";
	}

	@Override
	public List<AbstractAction> evaluate() {
		
		double value = 0.0; 
		
		return createActionList(value);
	}

}
