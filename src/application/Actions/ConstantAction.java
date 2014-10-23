/**
 *  @author Pranava Raparla
 *  Created: October 23rd, 2014
 *  Modified: October 23rd, 2014
 */
package application.Actions;

import application.SLogoCanvas;
import application.Turtle;

public class ConstantAction extends Action {
	
	public ConstantAction(double value) {
		myValue = value;
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
