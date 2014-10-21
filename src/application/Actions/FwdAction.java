package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class FwdAction extends AbstractAction {
	int myDistance;

	public FwdAction(int distance) {
		myDistance = distance;
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		Point2D previousLocation = turtle.getLocation();
		canvas.displayLine(turtle.move(myDistance));

		// System.out.println("***Prior Location: " + prevLoc);
		// System.out.println("***Prior Location: " + turt.getLocation());
	}

}
