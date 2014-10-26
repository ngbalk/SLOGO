/**
 *  @author Pranava Raparla
 *  Created: October 23rd, 2014
 *  Modified: October 23rd, 2014
 */
package application.slogonode.MathOperations;

import application.slogonode.SLogoNode;
import application.slogonode.PunctuationNode.*;

public abstract class TwoChildMathOperationsNode extends SLogoNode {
	
	public TwoChildMathOperationsNode() {
		super();
	}
		
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		if (myChildren.size() > 0)
			if (myChildren.get(0) instanceof GroupStartNode)
				return myChildren.get(myChildren.size()-1) instanceof GroupEndNode;
		return (myChildren.size() < 2);
	}	
}