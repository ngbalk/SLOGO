package application.slogonode.ControlStructures;

import application.slogonode.SLogoNode;

public abstract class ControlStructuresNode extends SLogoNode{
	
	protected String myCommand;
	
	public ControlStructuresNode() {
		myType = "ControlStructures";
	}
	
	@Override
	public String toString(){
		return super.toString() + "Control Structure:" + myCommand;
	}

	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return myChildren.size() < 2;
	}
}
