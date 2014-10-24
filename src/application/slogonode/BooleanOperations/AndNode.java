/**
 *  @author Pranava Raparla
 *  Created: October 6th, 2014
 *  Modified: October 23rd, 2014
 */

package application.slogonode.BooleanOperations;

import java.util.*;

import application.Actions.AbstractAction;
import application.slogonode.Number.ConstantNode;

public class AndNode extends BooleanOperations{

	public AndNode() {
		myOperation = "AND";
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionsList = new ArrayList<AbstractAction>();
		double value = 0;
		if(myChildren.get(0).evaluate().get(0).getValue()==1 && myChildren.get(1).evaluate().get(0).getValue()==1)
			value = 1;
		actionsList.addAll((new ConstantNode(value)).evaluate());
		return actionsList;
	}
	
}