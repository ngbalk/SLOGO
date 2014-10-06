package application.slogonode.BooleanOperations;

public class LessNode extends BooleanOperations{

	public LessNode() {
		myType = "BooleanOperation";
		myOperation = "LESS";
	}

	public boolean evaluate() {
		return myChildren.get(0).evaluate() < myChildren.get(1).evaluate();
	}
	
}
