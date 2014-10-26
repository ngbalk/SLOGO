/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class SetPositionAction extends Action {
	protected Point2D myPoint;
	
	public SetPositionAction(double xPosition, double yPosition){
		myName = "Position";
		myPoint = new Point2D(xPosition,yPosition);
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		turtle.setX(myPoint.getX());
		turtle.setY(myPoint.getY());
	}
}