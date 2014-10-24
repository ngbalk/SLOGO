/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 23rd, 2014
 */
package application.slogonode.MathOperations;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;
import application.slogonode.Number.ConstantNode;

public abstract class MathOperations extends SLogoNode {
	
	protected final String[] AVAILABLE_OPERATIONS = {"SUM","DIFFERENCE","PRODUCT","QUOTIENT","REMAINDER","MINUS","RANDOM","SIN","COS","ATAN","LOG","POWER"};
	protected String myOperation;
	
	public MathOperations() {
		myType = "MathOperation";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Operation:" + myOperation;
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return (myChildren.size() < 1);
	}	
	
	public List<AbstractAction> createActionList(double value){
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		actionList.addAll((new ConstantNode(value)).evaluate());
		return actionList;
	}
}