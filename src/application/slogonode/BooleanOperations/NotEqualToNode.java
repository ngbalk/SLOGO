package application.slogonode.BooleanOperations;

public class NotEqualToNode extends BooleanOperations{

	public NotEqualToNode() {
		myOperation = "NOTEQUAL";
	}

	public int evaluate() {
		return myChildren.get(0).evaluate() < myChildren.get(1).evaluate() ? 1 : 0;
	}
}