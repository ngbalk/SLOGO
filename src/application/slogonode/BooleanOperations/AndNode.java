package application.slogonode.BooleanOperations;

import java.util.List;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public class AndNode extends BooleanOperations {

	public AndNode() {
		myOperation = "AND";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = 1;
		for (int i = 0; i < myChildren.get(0).getChildren().size()-1; i++){
			if (myChildren.get(0).getChildren().get(i).evaluate().get(0).getValue() == 0.0 ){
				return createActionList(0);
			}
		}
		return createActionList(value);
	}
}