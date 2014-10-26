package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class BackwardAction extends Action {

	public BackwardAction(double distance) {
		myValue = distance;
		myName = "Backward";
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		Point2D previousLocation = turtle.getLocation();
		//canvas.display().getChildren().add(turtle.movement(myValue));

		// System.out.println("***Prior Location: " + previousLocation);
		// System.out.println("***Prior Location: " + turtle.getLocation());
	}
}
