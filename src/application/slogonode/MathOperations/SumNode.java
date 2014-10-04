/**
 *  @author Pranava Raparla
 *  Created: October 3rd, 2014
 *  Modified: October 3rd, 2014
 */
package application.slogonode.MathOperations;

import application.slogonode.SLogoNode;

public class SumNode extends MathOperations {

	@Override
	public int evaluate() {
		int mySum = 0;
		for(SLogoNode slnode: myChildren)
			mySum += slnode.evaluate();
		return mySum;
	}

}
