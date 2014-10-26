/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

import java.util.*;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public abstract class PunctuationNode extends SLogoNode {
	
	public PunctuationNode() {
		super();
		myType = "Punctuation";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		if(myChildren.size()>0)
			return !(myChildren.get(myChildren.size()-1) instanceof PunctuationNode);
		return true;
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		for(int i=0; i<myChildren.size(); i++)
			myActions.addAll(myChildren.get(0).evaluate());
		return myActions;
	}
}