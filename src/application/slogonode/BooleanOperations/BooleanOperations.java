/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 6th, 2014
 *  Modified: October 23rd, 2014
 */

package application.slogonode.BooleanOperations;

import java.util.*;

import application.Actions.*;
import application.slogonode.SLogoNode;

public abstract class BooleanOperations extends SLogoNode{
	
	protected final String[] AVAILABLE_OPERATIONS = {"LESS", "GREATER", "EQUAL", "NOTEQUAL", "AND", "OR", "NOT"};
	protected String myOperation;
	
	public BooleanOperations() {
		myType = "BooleanOperation";
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString() + " Operation:" + myOperation;
	}
	
	@Override
	public boolean needsMoreChildrenForEvaluation() {
		return (myChildren.size() < 2);
	}
}
