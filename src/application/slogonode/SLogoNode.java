/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode;

import java.util.*;

import application.Actions.AbstractAction;

public abstract class SLogoNode {	
	
	protected double myValue;
	protected String myType;
	public List<SLogoNode> myChildren;
	protected int myMaxPossibleChildren;
	protected List<AbstractAction> myActions;
	
	public SLogoNode() {
		super();
		myChildren = new ArrayList<SLogoNode>();
		myMaxPossibleChildren = 0;
		myActions = new ArrayList<AbstractAction>();
	}
	
	public SLogoNode(List<AbstractAction> actions) {
		this();
		myActions = actions;
	}
	
	/**
	 * 
	 * @return
	 */
	public abstract List<AbstractAction> evaluate();
	
	/**
	 * 
	 * @return
	 */
	public boolean needsMoreChildrenForEvaluation() {
		return myChildren.size() < myMaxPossibleChildren;
	}
	
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
		return "SLogoNode: " + myType + " " + myValue;
	}
}
