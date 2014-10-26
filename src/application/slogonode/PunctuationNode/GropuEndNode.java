/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

public abstract class GropuEndNode extends GroupNode {
	
	public GropuEndNode() {
		super();
		myType = "RightParentheses";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return false;
	}
}