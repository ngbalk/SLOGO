/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 23rd, 2014
 */

package application.slogonode;

import java.util.*;

import application.Actions.AbstractAction;

public abstract class SLogoNode {	
	
	protected int myValue;
	protected String myType;
	public List<SLogoNode> myChildren;
	public List<AbstractAction> myActions;
	
	public SLogoNode() {
		super();
		myChildren = new ArrayList<SLogoNode>();
		myActions = new ArrayList<AbstractAction>();
	}
	
	public SLogoNode(List<AbstractAction> actions) {
		myActions = actions;
	}
	
	/**
	 * 
	 * @param actions
	 */
	public void setActionList(List<AbstractAction> actions) {
		myActions = actions;
	}

	/**
	 * 
	 * @return
	 */
	public abstract int evaluate();
	
	/**
	 * 
	 * @return
	 */
	public abstract AbstractAction evaluate();
	
	/**
	 * 
	 * @return
	 */
	public abstract boolean needsMoreChildrenForEvaluation();
	
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
