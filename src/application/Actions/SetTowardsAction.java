/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class SetTowardsAction extends Action {
	protected Point2D myPoint;
	
	public SetTowardsAction(double xPosition, double yPosition){
		myName = "Towards";
		myPoint = new Point2D(xPosition,yPosition);
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		double xDifference = myPoint.getX() - turtle.getLocation().getX() - 600;
		double yDifference = myPoint.getY() - turtle.getLocation().getY() - 600;
		myValue = Math.toDegrees(Math.atan2(yDifference,xDifference));
		turtle.setDirection(myValue);
	}

}