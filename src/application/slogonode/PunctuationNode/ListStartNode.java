/**
 *  @author Pranava Raparla
 *  Created: October 26th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.PunctuationNode;

public class ListStartNode extends ListNode {
	
	public ListStartNode() {
		super();
		myType = "LeftBracket";
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		if(myChildren.size()>0)
			return !(myChildren.get(myChildren.size()-1) instanceof ListEndNode);
		return true;
	}
}