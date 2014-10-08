package application.slogonode.BooleanOperations;

public class LessThanNode extends BooleanOperations{

	public LessThanNode() {
		myOperation = "LESS";
	}

	public int evaluate() {
		return myChildren.get(0).evaluate() != myChildren.get(1).evaluate() ? 1 : 0;
	}
}
