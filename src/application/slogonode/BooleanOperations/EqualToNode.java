package application.slogonode.BooleanOperations;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.ConstantAction;

public class EqualToNode extends BooleanOperations{

	public EqualToNode() {
		myOperation = "EQUAL";
	}

	public List<AbstractAction> evaluate() {
		double value = 0;
		if (myChildren.get(0).evaluate().get(0).getValue() == myChildren.get(1).evaluate().get(0).getValue()){
			value = 1;
		}
		return createActionList(value);
	}
}