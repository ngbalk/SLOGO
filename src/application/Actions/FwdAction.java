package application.Actions;






import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class FwdAction extends AbstractAction {
	double myDistance;

	public FwdAction(double distance) {
		myDistance = distance;
	}

	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		Point2D prevLoc = turt.getLocation();
		turt.move(myDistance);
		canvas.draw(prevLoc, turt.getLocation());
	}

}
