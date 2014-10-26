/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

public abstract class LeftBracketNode extends BracketNode {
	
	public LeftBracketNode() {
		super();
		myType = "LeftBracket";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return myChildren.get(myChildren.size()-1) instanceof RightBracketNode;
	}
}