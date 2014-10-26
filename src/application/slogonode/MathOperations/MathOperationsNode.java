/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;
import application.slogonode.SLogoNode;

public abstract class MathOperationsNode extends SLogoNode {
	
	public MathOperationsNode() {
		super();
		myMaxPossibleChildren = 1;
		myType = "MathOperation";
	}
}