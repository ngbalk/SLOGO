package application.slogonode.ControlStructures;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;

public class ForNode extends ControlStructuresNode{
	
	public ForNode() {
		super();
		myCommand = "For";
	}
	
	@Override
	public List<AbstractAction> evaluate(){
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		double start = myChildren.get(0).evaluate().get(0).getValue();
		double end = myChildren.get(1).evaluate().get(0).getValue();
		double step = myChildren.get(2).evaluate().get(0).getValue();
		AbstractAction action = myChildren.get(3).evaluate().get(0);
		for (double i = start; i<end; i+=step){
			actionList.add(action);
		}
		return actionList;
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation(){
		return myChildren.size()<4; 
	}
}