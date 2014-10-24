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
		for (SLogoNode node : myChildren){
			if (node.evaluate().get(0).getValue() == 0){
				value = 0; 
				break; 
			}
		}
		return createActionList(value);
	}
}