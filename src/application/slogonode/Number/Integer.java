/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */
package application.slogonode.Number;

public class Integer extends NumberNode {
	
	public Integer() {
		myType = "NUMBER";
		myOperation = "INTEGER";
	}
	
	@Override
	public int evaluate() {
		return myValue;
	}
	
}