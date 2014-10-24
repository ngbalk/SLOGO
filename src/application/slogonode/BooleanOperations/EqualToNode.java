package application.slogonode.BooleanOperations;

public class EqualToNode extends BooleanOperations{

	public EqualToNode() {
		myOperation = "EQUAL";
	}

	public int evaluate() {
		return (myChildren.get(0).evaluate() == myChildren.get(1).evaluate()) ? 1 : 0;
	}
}