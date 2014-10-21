package application;

import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

public class SLogoPen {
	private boolean myDownStatus;
	private Color myColor;
	private double mySize;

	public SLogoPen() {
		myDownStatus = true;
		myColor = Color.BLACK;
		mySize = 1;
	}

	public Line drawLine(Point2D start, Point2D end) {
		Line line = new Line();
		if (myDownStatus) {
			line.setStartX(start.getX());
			line.setStartY(start.getY());
			line.setEndX(end.getX());
			line.setEndY(end.getY());
			line.setStroke(myColor);
			line.setStrokeWidth(mySize);
		}
		return line;
	}

	public void setPenUp() {
		myDownStatus = false;
	}

	public void setPenDown() {
		myDownStatus = true;
	}

	public boolean getPenDownStatus() {
		return myDownStatus;
	}

	public void setPenColor(Color c) {
		myColor = c;
	}

	public void setPenSize(double size) {
		mySize = size;
	}
}
