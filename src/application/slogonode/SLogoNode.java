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
	public List<SLogoNode> myChildren;
	
	/**
	 * 
	 * @return
	 */
	public abstract int evaluate();

	/**
	 * 
	 * @return
	 */
	public List<SLogoNode> getChildren() {
		return myChildren;
	}
	
	/**
	 * 
	 * @param slnode
	 */
	public void addChild(SLogoNode slnode) {
		myChildren.add(slnode);
	}

	/**
	 * 
	 */
	public String toString() {
		return "SLogoNode. " + "Type:" + myType + " myValue:" + myValue;
	}
}
