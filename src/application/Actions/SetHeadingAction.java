/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.Actions;

import application.SLogoCanvas;
import application.Turtle;

public class SetHeadingAction extends Action {

	public SetHeadingAction(double direction){
		myValue = direction;
		myName = "SetHeading";
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		turtle.setDirection(myValue);
	}
}