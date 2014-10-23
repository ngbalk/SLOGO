/**
 *  @author Pranava Raparla
 *  Created: October 23rd, 2014
 *  Modified: October 23rd, 2014
 */
package application.Actions;

import application.SLogoCanvas;
import application.Turtle;

public class IntegerAction extends Action {
	public int myValue;
	
	public IntegerAction(int value) {
		myValue = value;
	}
	
	public int getValue() {
		return myValue;
	}

	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		return;
	}

	@Override
	public String toString() {
		return "IntegerAction";
	}

}
