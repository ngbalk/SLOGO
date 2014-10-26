package application.slogonode.ControlStructures;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;

public class DoTimesNode extends ControlStructuresNode{
	
	public DoTimesNode() {
		super();
		myCommand = "DoTimes";
	}
	
	@Override
	public List<AbstractAction> evaluate(){
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		return actionList;
	}
}
