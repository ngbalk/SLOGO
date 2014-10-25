/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.Actions;

import application.SLogoCanvas;
import application.Turtle;

public class PenAction extends Action {

	/**
	 * 
	 * @param status is 0 for down, 1 for up
	 */
	public PenAction (double status){
		myValue = status;
		myName = "PenUpDown";
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		if(myValue == 0)
			turtle.getPen().setPenUp();
		else
			turtle.getPen().setPenDown();
	}
}