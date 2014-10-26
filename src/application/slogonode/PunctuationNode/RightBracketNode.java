/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

public abstract class RightBracketNode extends BracketNode {
	
	public RightBracketNode() {
		super();
		myType = "RightBracket";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return false;
	}
}