/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 9th, 2014
 */
package application.slogonode.Number;

public class IntegerNode extends NumberNode {
	
	public IntegerNode() {
		myType = "NUMBER";
		myOperation = "INTEGER";
	}
	
	public IntegerNode(int value) {
		this();
		myValue = value;
	}
	
	@Override
	public int evaluate() {
		return myValue;
	}
	
}