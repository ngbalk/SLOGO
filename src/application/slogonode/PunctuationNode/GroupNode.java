/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

public abstract class GroupNode extends PunctuationNode {
	
	public GroupNode() {
		super();
		myType = "Parentheses";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return myChildren.get(myChildren.size()-1) instanceof GroupNode;
	}
}