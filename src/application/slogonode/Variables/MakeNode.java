/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.Variables;

import java.util.*;
import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public class MakeNode extends SLogoNode {
	
	public MakeNode() {
		super();
		myMaxPossibleChildren = 2;
		myType = "Make";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		String variableName = myChildren.get(0).evaluate().get(0).getName();
		List<AbstractAction> childrenActionList = new ArrayList<AbstractAction>();
		for(int i=1; i<myChildren.size(); i++)
			childrenActionList.addAll(myChildren.get(i).evaluate());
		myActions.add(new VariableAction(variableName,childrenActionList));
		return myActions;
	}
}