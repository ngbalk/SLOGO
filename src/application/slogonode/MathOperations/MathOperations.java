/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 3rd, 2014
 */
package application.slogonode.MathOperations;

import application.slogonode.SLogoNode;

public abstract class MathOperations extends SLogoNode {
	
	protected final String[] AVAILABLE_OPERATIONS = {"SUM","DIFFERENCE","PRODUCT","QUOTIENT","REMAINDER","MINUS","RANDOM","SIN","COS","ATAN","LOG","POWER"};
	protected String myOperation;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Operation:" + myOperation;
	}
	
}