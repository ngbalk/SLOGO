/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

public abstract class GroupStartNode extends GroupNode {
	
	public GroupStartNode() {
		super();
		myType = "LeftParentheses";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return myChildren.get(myChildren.size()-1) instanceof GroupEndNode;
	}
}