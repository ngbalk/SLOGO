package application.slogonode.TurtleQueries;

import application.slogonode.SLogoNode;

public abstract class TurtleQueriesNode extends SLogoNode{
	
	protected String myCommand;
	
	public TurtleQueriesNode() {
		myType = "TurtleQueries";
	}
	
	@Override
	public String toString(){
		return super.toString() + " Turtle Query: " + myCommand;
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation(){
		return myChildren.size() < 0;
	}
}
