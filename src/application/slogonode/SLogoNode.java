/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 26th, 2014
 */

package application.slogonode;

import java.util.*;
import application.Actions.AbstractAction;

public abstract class SLogoNode {	
	
	/**
	 * Variables held by all SLogoNodes.
	 * 		public: myChildren must be public for tree creation and evaluation within the tree
	 * 		private: none - variables must be accessed by subclasses for manipulation (protected instead)
	 * 		protected: myValue, myType, myMaxPossibleChildren, myActions.
	 */
	protected double myValue;
	protected String myType;
	public List<SLogoNode> myChildren;
	protected int myMaxPossibleChildren;
	protected List<AbstractAction> myActions;
	
	/**
	 * Default constructor for SLogoNode. Initializes all variables.
	 */
	public SLogoNode() {
		myChildren = new ArrayList<SLogoNode>();
		myMaxPossibleChildren = 0;
		myActions = new ArrayList<AbstractAction>();
	}
	
	/**
	 * Constructor prepopulates the node with an actions list.
	 * @param actions
	 */
	public SLogoNode(List<AbstractAction> actions) {
		this();
		myActions = actions;
	}
	
	/**
	 * Abstract method. Each node should know how to evaluate itself based on its children.
	 * @return myActions, the list of front end actions associated with the given node
	 */
	public abstract List<AbstractAction> evaluate();
	
	/**
	 * This method returns a boolean for whether it should keep adding more children.
	 * Most nodes have a fixed number of arguments or myMaxPossibleChildren.
	 * Some nodes (parentheses, brackets, etc.) can have infinitely many children and override this
	 * @return true if the node should add more children in order to complete its own evaluation
	 */
	public boolean needsMoreChildrenForEvaluation() {
		return myChildren.size() < myMaxPossibleChildren;
	}
	
	/**
	 * Return the list of children held by this node.
	 * @return myChildren
	 */
	public List<SLogoNode> getChildren() {
		return myChildren;
	}
	
	/**
	 * Add a child to the list of children.
	 * @param slnode
	 */
	public void addChild(SLogoNode slnode) {
		myChildren.add(slnode);
	}

	/**
	 * String Representation of the node, makes debugging and printing easier.
	 */
	public String toString() {
		return "SLogoNode: " + myType + " " + myValue;
	}
}
