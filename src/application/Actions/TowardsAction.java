/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class TowardsAction extends Action {

	public TowardsAction(double xPosition, double yPosition){
		myName = "Towards";
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		myValue = Math.toDegrees(Math.atan2(turtle.getLocation().getY(), turtle.getLocation().getX()));
		turtle.setDirection(myValue);
	}

}