package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class ForwardAction extends AbstractAction {

	public ForwardAction(double distance) {
		myValue = distance;
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		Point2D previousLocation = turtle.getLocation();
		
		double remainder = myValue;
		while (remainder > 0){
			canvas.displayLine(turtle.move(1));
			remainder-=1;
		}
		// System.out.println("***Prior Location: " + prevLoc);
		// System.out.println("***Prior Location: " + turt.getLocation());
	}

	@Override
	public String toString() {
		return "fwd " + myValue;
	}

}
