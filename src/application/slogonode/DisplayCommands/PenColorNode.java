/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode.DisplayCommands;

import java.util.*;

import application.Actions.AbstractAction;
import application.Actions.SetBackgroundAction;
import application.Actions.SetPenColorAction;

public class PenColorNode extends DisplayCommandsNode {
	
	public PenColorNode() {
		super();
		myType = "PenColor";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myActions.add(new SetPenColorAction(myValue));
		return myActions;
	}
}