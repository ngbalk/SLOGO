package application.slogonode.BooleanOperations;

import java.util.List;

import application.Actions.AbstractAction;

public class OrNode extends BooleanOperations{

	public OrNode() {
		myOperation = "OR";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = 0;
		if (myChildren.get(0).evaluate().get(0).getValue() == 1
				|| myChildren.get(1).evaluate().get(0).getValue() == 1) {
			value = 1;
		}
		return createActionList(value);
	}
}