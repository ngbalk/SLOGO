/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.Number;

import application.slogonode.SLogoNode;

public abstract class NumberNode extends SLogoNode {
	
	public NumberNode() {
		super();
		myMaxPossibleChildren = 0;
		myType = "Number";
	}
}