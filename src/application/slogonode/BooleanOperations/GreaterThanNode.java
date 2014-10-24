package application.slogonode.BooleanOperations;

public class GreaterThanNode extends BooleanOperations{

	public GreaterThanNode() {
		myOperation = "GREATER";
	}

	public int evaluate() {
		return myChildren.get(0).evaluate() >  myChildren.get(1).evaluate() ? 1 : 0;
	}
}