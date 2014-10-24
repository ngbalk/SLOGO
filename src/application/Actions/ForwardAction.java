package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class ForwardAction extends Action {

	public ForwardAction(double distance) {
		myValue = distance;
		myName = "Forward";
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		Point2D previousLocation = turtle.getLocation();

		double remainder = myValue;
		while (remainder > 0) {
			//I PROMISE I WILL COME UP WITH A BETTER SOLUTION
			//BUT MAYBE THIS IDEA WILL BE COOL FOR ANIMATING
			//PROBABLY SHOULDN'T BE IN THE FORWARD ACTION THOUGH
			if (turtle.getPen().isDashed() && remainder >= 30) {
				canvas.displayLine(turtle.move(30));
				remainder -= 30;
			} else if (turtle.getPen().isDotted() && remainder >= 5) {
				canvas.displayLine(turtle.move(5));
				remainder -= 5;
			} else {
				canvas.displayLine(turtle.move(1));
				remainder -= 1;
			}
		}
		// System.out.println("***Prior Location: " + prevLoc);
		// System.out.println("***Prior Location: " + turt.getLocation());
	}
}
