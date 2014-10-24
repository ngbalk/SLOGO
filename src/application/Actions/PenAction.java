/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.Actions;

import application.AbstractTurtle;
import application.SLogoCanvas;
import application.Turtle;

public class PenAction extends AbstractAction {

	/**
	 * 
	 * @param status is 0 for down, 1 for up
	 */
	public PenAction (double status){
		myValue = status;
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		if(myValue == 0)
			turtle.getPen().setPenUp();
		else
			turtle.getPen().setPenDown();
	}
	
	@Override
	public String toString() {
		return "Pen UP/Down: " + myValue + " ";
	}

}