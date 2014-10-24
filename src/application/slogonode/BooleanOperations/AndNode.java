package application.slogonode.BooleanOperations;

import java.util.List;
import application.Actions.AbstractAction;

public class AndNode extends BooleanOperations {

	public AndNode() {
		myOperation = "AND";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = 0;
		if (myChildren.get(0).evaluate().get(0).myValue == 1
				&& myChildren.get(1).evaluate().get(0).myValue == 1) {
			value = 1;
		}
		return createActionList(value);
	}
}