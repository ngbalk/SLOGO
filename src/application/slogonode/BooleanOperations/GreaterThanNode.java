package application.slogonode.BooleanOperations;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.slogonode.Number.ConstantNode;

public class GreaterThanNode extends BooleanOperations{

	public GreaterThanNode() {
		myOperation = "GREATER";
	}

	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		double value = 0;
		if (myChildren.get(0).evaluate().get(0).getValue() > myChildren.get(1).evaluate().get(0).getValue()){
			value = 1;
		}
		actionList.addAll((new ConstantNode(value)).evaluate());
		return actionList;
	}
}