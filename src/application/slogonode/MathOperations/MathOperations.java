/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 26th, 2014
 */
package application.slogonode.MathOperations;

public abstract class MathOperations extends SLogoNode {
	
	public MathOperations() {
		super();
		myMaxPossibleChildren = 1;
		myType = "MathOperation";
	}
}