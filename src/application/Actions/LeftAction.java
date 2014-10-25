/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 9th, 2014
 *  Modified: October 24th, 2014
 */
package application.Actions;

import application.SLogoCanvas;
import application.Turtle;

public class LeftAction extends RotateAction {

	public LeftAction (double degrees){
		super(degrees);
		myName = "Left";
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		turtle.rotate(myValue);
	}
}