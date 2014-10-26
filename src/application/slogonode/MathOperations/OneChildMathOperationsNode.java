/**
 *  @author Pranava Raparla
 *  Created: October 23rd, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

import application.slogonode.SLogoNode;

public abstract class OneChildMathOperationsNode extends SLogoNode {
	
	public OneChildMathOperationsNode() {
		super();
		myMaxPossibleChildren = 1;
	}
}