package application.slogonode.ControlStructures;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public class IfNode extends ControlStructuresNode{

	public IfNode(){
		super();
		myCommand = "If";
	}
	
	@Override
	public List<AbstractAction> evaluate(){
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		SLogoNode conditional = myChildren.get(0);
		SLogoNode child = myChildren.get(1);
		
		if (conditional.evaluate().get(0).getValue()==1.0){
			actionList.add(child.evaluate().get(0));
		}
		return actionList;
	}
}
