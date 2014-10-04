/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.Number;

import application.slogonode.SLogoNode;

public abstract class NumberNode extends SLogoNode {
	
	protected final String[] AVAILABLE_TYPES = {"INTEGER","DOUBLE","FLOAT","LONG"};
	protected String myOperation;
	
	@Override
	public String toString() {
		return super.toString() + " Operation:" + myOperation;
	}
	
}