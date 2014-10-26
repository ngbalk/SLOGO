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
		// TODO: Implement this method!
		return myActions;
	}
}