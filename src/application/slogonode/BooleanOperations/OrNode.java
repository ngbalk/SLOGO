package application.slogonode.BooleanOperations;

import java.util.List;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public class OrNode extends BooleanOperations{

	public OrNode() {
		myOperation = "OR";
	}

	@Override
	public List<AbstractAction> evaluate() {
		double value = 0;
		for (SLogoNode node : myChildren){
			if (node.evaluate().get(0).getValue() == 1){
				value = 1;
				break; 
			}
		}
		return createActionList(value);
	}
}