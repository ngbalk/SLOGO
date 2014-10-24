package application.slogonode.BooleanOperations;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Actions.ConstantAction;

public class AndNode extends BooleanOperations{

	public AndNode() {
		myOperation = "AND";
	}

	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		double value = 0;
		if (myChildren.get(0).evaluate().get(0).myValue==1 && myChildren.get(1).evaluate().get(0).myValue == 1){
			value = 1;
		}
		AbstractAction action = new ConstantAction(value);
		actionList.add(action);
		return actionList;
	}
}