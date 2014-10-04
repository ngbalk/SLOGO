/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 3rd, 2014
 */

package application.slogonode;

import java.util.*;

public abstract class SLogoNode {	
	
	protected int myValue;
	protected String myType;
	protected List<SLogoNode> myChildren;
	
	/**
	 * 
	 * @return
	 */
	public abstract int evaluate();
	
	/**
	 * 
	 */
	public String toString() {
		return "SLogoNode. " + "Type:" + myType + " myValue:" + myValue;
	}
}
