/**
 *  @author Pranava Raparla
 *  @author Wesley Valentine
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.Actions;

import application.Turtle;
import application.SLogoCanvas;

public class DisplayTurtleAction extends Action {

	/**
	 * 
	 * @param status
	 *            is 0 for down, 1 for up
	 */
	public DisplayTurtleAction(double status) {
		myValue = status;
		myName = "DisplayTurtle";
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		if (myValue == 0)
			canvas.display().getChildren().remove(turtle.display());
		if (myValue == 1) {
			canvas.display().getChildren().add(turtle.display());
		}
	}
}