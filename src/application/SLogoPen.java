package application;

import application.Constants.GUIconstants;
import javafx.geometry.Point2D;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;

/**
 * 
 * @author Wesley Valentine
 *
 */
public class SLogoPen {
	private boolean myIsDotted = false;
	private boolean myIsDashed = false;
	private boolean myDownStatus;
	private Color myColor;
	private double mySize;

	public SLogoPen() {
		myDownStatus = true;
		myColor = Color.BLACK;
		mySize = GUIconstants.DEFAULT_PEN_SIZE;
	}

	/**
	 * Create a Line object between the start and end points given. The Line is
	 * altered based on the Pen's instance variables statuses. Returns an empty
	 * Line if Pen is currently in the "up" position. This method is called
	 * whenever the Turtle attached to this Pen calls the step() or move()
	 * method
	 * 
	 * @param start
	 *            starting point of the line
	 * @param end
	 *            ending point of the line
	 * @return
	 */
	public Line drawLine(Point2D start, Point2D end) {
		Line line = new Line();
		if (myDownStatus) {
			line.setStartX(start.getX());
			line.setStartY(start.getY());
			line.setEndX(end.getX());
			line.setEndY(end.getY());
			line.setStroke(myColor);
			line.setStrokeWidth(mySize);
			if (myIsDotted) {
				line.getStrokeDashArray().addAll(2d, 21d);
			} else if (myIsDashed) {
				line.getStrokeDashArray().addAll(25d, 10d);
			}
		}
		return line;
	}

	/**
	 * set pen to up
	 */
	public void setPenUp() {
		myDownStatus = false;
	}

	/**
	 * set pen to down
	 */
	public void setPenDown() {
		myDownStatus = true;
	}

	/**
	 * Returns up/down status of the pen
	 * 
	 * @return
	 */
	public boolean getPenDownStatus() {
		return myDownStatus;
	}

	/**
	 * Sets pen to drawn lines in the given Color
	 * 
	 * @param color
	 */
	public void setPenColor(Color color) {
		myColor = color;
	}

	/**
	 * Set size of Pen
	 * 
	 * @param size
	 */
	public void setPenSize(double size) {
		mySize = size;
	}

	/**
	 * Set Pen to draw dotted lines
	 */
	public void setDottedLine() {
		myIsDotted = true;
		myIsDashed = false;
	}

	/**
	 * Set Pen to draw dashed lines
	 */
	public void setDashedLine() {
		myIsDashed = true;
		myIsDotted = false;
	}

	/**
	 * Set Pen to draw solid lines
	 */
	public void setSolidLine() {
		myIsDotted = false;
		myIsDashed = false;
	}

	/**
	 * check if Pen is set to draw dashed lines
	 * 
	 * @return
	 */
	public boolean isDashed() {
		return myIsDashed;
	}

	/**
	 * check if Pen is set to draw dotted lines
	 * 
	 * @return
	 */
	public boolean isDotted() {
		return myIsDotted;
	}
}
