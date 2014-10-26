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
		for (int i = 0; i < myChildren.get(0).getChildren().size() - 1; i ++){
			
		}
		return createActionList(value);
	}
}