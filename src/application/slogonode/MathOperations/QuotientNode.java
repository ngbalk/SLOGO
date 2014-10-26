/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.ConstantAction;
import application.slogonode.SLogoNode;
import application.slogonode.PunctuationNode.*;

public class QuotientNode extends TwoChildMathOperationsNode {

	public QuotientNode() {
		super();
		myType = "Quotient";
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<SLogoNode> childrenOfInterest = myChildren;
		if(myChildren.get(0) instanceof GroupStartNode)
			childrenOfInterest = myChildren.get(0).getChildren();
		for (int i = 0; i<childrenOfInterest.size(); i++) {
			if(childrenOfInterest.get(i) instanceof GroupEndNode)
				break;
			myValue /= childrenOfInterest.get(i).evaluate().get(0).getValue();
		}
		myActions.add(new ConstantAction(myValue));
		return myActions;
	}
}