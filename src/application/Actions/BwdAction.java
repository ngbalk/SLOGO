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
	public void update(Turtle turt, SLogoCanvas canvas) {
		Point2D prevLoc = turt.getLocation();
		turt.move(myDistance);
		canvas.draw(prevLoc, turt.getLocation());
		System.out.println("***Prior Location: " + prevLoc);
		System.out.println("***Prior Location: " + turt.getLocation());
	}

}
