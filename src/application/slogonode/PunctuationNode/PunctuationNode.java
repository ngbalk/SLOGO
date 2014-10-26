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
		return myChildren.get(myChildren.size()-1) instanceof PunctuationNode;
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		return myActions;
	}	
}