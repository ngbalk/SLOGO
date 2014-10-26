package application.slogonode.ControlStructures;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;

public class RepeatNode extends ControlStructuresNode{

	public RepeatNode() {
		super();
		myCommand = "Repeat";
	}
	
	@Override
	public List<AbstractAction> evaluate(){
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		double iterations = myChildren.get(0).evaluate().get(0).getValue();
		AbstractAction action = myChildren.get(1).evaluate().get(0);
		for (double i = 0; i<iterations; i++){
			actionList.add(action);
		}
		return actionList;
	}
}
