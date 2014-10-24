package application.slogonode.BooleanOperations;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.slogonode.Number.ConstantNode;

public class AndNode extends BooleanOperations {

	public AndNode() {
		myOperation = "AND";
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		double value = 0;
		if (myChildren.get(0).evaluate().get(0).getValue()== 1
				&& myChildren.get(1).evaluate().get(0).getValue()== 1) {
			value = 1;
		}
		actionList.addAll((new ConstantNode(value)).evaluate());
		return actionList;
	}
}