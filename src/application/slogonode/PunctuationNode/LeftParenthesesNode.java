/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

public abstract class LeftParenthesesNode extends ParenthesesNode {
	
	public LeftParenthesesNode() {
		super();
		myType = "LeftParentheses";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return myChildren.get(myChildren.size()-1) instanceof RightParenthesesNode;
	}
}