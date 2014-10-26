package application.slogonode.ControlStructures;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public class ForNode extends ControlStructuresNode{
	
	public ForNode() {
		super();
		myCommand = "For";
	}
	
	@Override
	public List<AbstractAction> evaluate(){
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		SLogoNode iterations = myChildren.get(0);
		SLogoNode child = myChildren.get(1);
		
		for (int i = 0; i<iterations.evaluate().get(0).getValue(); i++){
			actionList.add(child.evaluate().get(0));
		}
		return actionList;
	}
}
