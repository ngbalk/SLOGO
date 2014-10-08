package application.slogonode.BooleanOperations;

public class OrNode extends BooleanOperations{

	public OrNode() {
		myOperation = "OR";
	}

	public int evaluate() {
		return myChildren.get(0).evaluate()==1 || myChildren.get(1).evaluate()==1 ? 1 : 0;
	}
}