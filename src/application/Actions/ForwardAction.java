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
		canvas.display().getChildren().add(turtle.move(myValue));
		
		// System.out.println("***Prior Location: " + prevLoc);
		// System.out.println("***Prior Location: " + turt.getLocation());
	}
}
