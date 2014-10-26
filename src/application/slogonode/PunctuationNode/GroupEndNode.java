/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

public class GroupEndNode extends GroupNode {
	
	public GroupEndNode() {
		super();
		myType = "RightParentheses";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return false;
	}
}