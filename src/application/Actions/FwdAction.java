package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class FwdAction extends AbstractAction {

	public FwdAction(int distance) {
		myValue = distance;
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		Point2D previousLocation = turtle.getLocation();
		canvas.displayLine(turtle.move(myValue));

		// System.out.println("***Prior Location: " + prevLoc);
		// System.out.println("***Prior Location: " + turt.getLocation());
	}

	@Override
	public String toString() {
		return "fwd " + myValue;
	}

}
