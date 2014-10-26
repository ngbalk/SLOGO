/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

public class ListEndNode extends ListNode {
	
	public ListEndNode() {
		super();
		myType = "RightBracket";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return false;
	}
}