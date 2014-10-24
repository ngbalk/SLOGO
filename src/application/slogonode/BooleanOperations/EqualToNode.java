package application.slogonode.BooleanOperations;

import java.util.List;
import application.Actions.AbstractAction;

public class EqualToNode extends BooleanOperations{

	public EqualToNode() {
		myOperation = "EQUAL";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = 0;
		if (myChildren.get(0).evaluate().get(0).getValue() == myChildren.get(1).evaluate().get(0).getValue()){
			value = 1;
		}
		return createActionList(value);
	}
}