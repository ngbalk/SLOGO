/**
 *  @author Monica Choe
 *  Created: October 6th, 2014
 *  Modified: October 6th, 2014
 */

package application.slogonode.BooleanOperations;

import application.slogonode.SLogoNode;

public abstract class BooleanOperations extends SLogoNode{
	
	protected final String[] AVAILABLE_OPERATIONS = {"LESS", "GREATER", "EQUAL", "NOTEQUAL", "AND", "OR", "NOT"};
	protected String myOperation;
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Operation:" + myOperation;
	}

}
