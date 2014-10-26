/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

public class SetPenSizeNode extends SetIndexNode {
	
	public SetPenSizeNode() {
		myType = "SetSizeColor";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new PenSizeAction(myChildren.get(0).evaluate().get(0).getValue()));
		return myActions;
	}
}