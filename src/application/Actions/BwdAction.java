package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class BwdAction extends AbstractAction {
	int myDistance;

	public BwdAction(int distance) {
		myDistance = distance;
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		Point2D previousLocation = turtle.getLocation();
		canvas.displayLine(turtle.move(myDistance));

		// System.out.println("***Prior Location: " + previousLocation);
		// System.out.println("***Prior Location: " + turtle.getLocation());
	}

	@Override
	public String toString() {
		return "bwd " + myDistance;
	}
	

}
