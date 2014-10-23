package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class BackwardAction extends AbstractAction {

	public BackwardAction(double distance) {
		myValue = distance;
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		Point2D previousLocation = turtle.getLocation();
		canvas.displayLine(turtle.move(myValue));

		// System.out.println("***Prior Location: " + previousLocation);
		// System.out.println("***Prior Location: " + turtle.getLocation());
	}

	@Override
	public String toString() {
		return "bwd " + myValue;
	}
	

}
