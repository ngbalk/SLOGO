package application.slogonode.ControlStructures;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;

public class IfElseNode extends ControlStructuresNode{

	public IfElseNode() {
		super();
		myCommand = "IfElse";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		double condition = myChildren.get(0).evaluate().get(0).getValue();
		AbstractAction ifAction = myChildren.get(1).evaluate().get(0);
		AbstractAction elseAction = myChildren.get(2).evaluate().get(0);
		
		if (condition == 1.0){
			actionList.add(ifAction);
		} else {
			actionList.add(elseAction);
		}	
		return actionList;
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation(){
		return myChildren.size()<3;
	}
}
