package application.slogonode.BooleanOperations;

public class AndNode extends BooleanOperations{

	public AndNode() {
		myOperation = "AND";
	}

	public int evaluate() {
		return myChildren.get(0).evaluate()==1 && myChildren.get(1).evaluate()==1 ? 1 : 0;
	}
}