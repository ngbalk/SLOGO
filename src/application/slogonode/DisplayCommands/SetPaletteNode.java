/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.DisplayCommands;

import java.util.*;
import application.Actions.AbstractAction;

public class SetPaletteNode extends DisplayCommandsNode {
	
	public SetPaletteNode() {
		super();
		myMaxPossibleChildren = 4;
		myType = "SetPalette";
	}
	
	@Override
	public List<AbstractAction> evaluate() {
		myValue = myChildren.get(0).evaluate().get(0).getValue();
		double r = myChildren.get(1).evaluate().get(0).getValue();
		double g = myChildren.get(2).evaluate().get(0).getValue();
		double b = myChildren.get(3).evaluate().get(0).getValue();
		myActions.add(new SetPaletteAction(myValue,r,g,b));
		return myActions;
	}
}