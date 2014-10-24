/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 9th, 2014
 *  Modified: October 23rd, 2014
 */
package application.Actions;

import application.AbstractTurtle;
import application.SLogoCanvas;
import application.Turtle;

public class RotateAction extends AbstractAction {

	public RotateAction (double degrees){
		myValue = degrees;
	}
	
	/**
	 * Rotate Left is positive value, rotate right is negative value
	 */
	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		turt.rotate(myValue);
	}
	
	@Override
	public String toString() {
		return "Rotate: " + myValue + " ";
	}

}