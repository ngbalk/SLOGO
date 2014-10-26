/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

import java.util.*;
import application.Actions.AbstractAction;
import application.Actions.ConstantAction;
import application.slogonode.PunctuationNode.PunctuationNode;

public class SumNode extends TwoChildMathOperationsNode {

	public SumNode() {
		super();
		myType = "Sum";
	}

	@Override
	public List<AbstractAction> evaluate() {
		for (int i = 0; i<myChildren.size(); i++){
			if(myChildren.get(i) instanceof PunctuationNode)
				continue;
			myValue += myChildren.get(i).evaluate().get(0).getValue();
		}
		myActions.add(new ConstantAction(myValue));
		return myActions;
	}
}