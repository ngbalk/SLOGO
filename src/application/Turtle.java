package application;

import application.Constants.GUIconstants;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

/**
 * 
 * @author Wesley Valentine
 * @author Nick Balkisoon
 *
 */
public class Turtle {

	protected double myXLocation;
	protected double myYLocation;
	protected double myOrientation;
	protected SLogoPen myPen;
	private ImageView myImage;

	public Turtle(double x, double y) {
		myXLocation = x;
		myYLocation = y;
		myOrientation = 0;
		myPen = new SLogoPen();
		myImage = new ImageView();
		this.myImage.setX(x);
		this.myImage.setY(y);
		myImage.setRotate(GUIconstants.TURTLE_IMAGE_START_ROTATION);
	}

	/**
	 * Enter a value of the distance to move. A positive value will move
	 * forward, a negative value will move backwards. A line is returned,
	 * corresponding to the correct drawing. Turtle will wrap around the
	 * SLogoCanvas.
	 * 
	 * @param distance
	 */
	public Line step(double distance) {
		Point2D start = this.getLocation();
		double radian = Math.toRadians(myOrientation);
		myXLocation += distance * Math.cos(radian);
		myYLocation -= distance * Math.sin(radian);

		if (myXLocation > GUIconstants.DEFAULT_CANVAS_WIDTH) {
			myXLocation = myXLocation % GUIconstants.DEFAULT_CANVAS_WIDTH;
			return new Line();
		} else if (myXLocation < 0) {
			myXLocation = GUIconstants.DEFAULT_CANVAS_WIDTH - myXLocation;
			return new Line();
		}

		if (myYLocation > GUIconstants.DEFAULT_CANVAS_HEIGHT) {
			myYLocation = myYLocation % GUIconstants.DEFAULT_CANVAS_HEIGHT;
			return new Line();
		} else if (myYLocation < 0) {
			myYLocation = GUIconstants.DEFAULT_CANVAS_HEIGHT - myYLocation;
			return new Line();
		}
		this.myImage.setX(this.myXLocation);
		this.myImage.setY(this.myYLocation);
		return myPen.drawLine(start, this.getLocation());
	}

	/**
	 * Moves the turtle using a series of steps. If-statements are used to make
	 * the status of the pen visible. The use of steps could potentially be used
	 * for animation.
	 * 
	 * @param distance
	 *            number of pixels to move the turtle, positive value moves
	 *            forward and negative moves backwards
	 * @return returns a Group containing all of the lines generated from each
	 *         individual step
	 */
	public Group move(double distance) {
		Group root = new Group();
		double direction = distance / Math.abs(distance);
		double remainder = Math.abs(distance);
		while (remainder > 0) {
			if (this.getPen().isDashed()
					&& remainder >= GUIconstants.TURTLE_DASH_MOVE_DISTANCE) {
				root.getChildren().add(
						this.step(GUIconstants.TURTLE_DASH_MOVE_DISTANCE
								* direction));
				remainder -= 30;
			} else if (this.getPen().isDotted()
					&& remainder >= GUIconstants.TURTLE_DOT_MOVE_DISTANCE) {
				root.getChildren().add(
						this.step(GUIconstants.TURTLE_DOT_MOVE_DISTANCE
								* direction));
				remainder -= 5;
			} else {
				root.getChildren().add(
						this.step(GUIconstants.TURTLE_SOLID_MOVE_DISTANCE
								* direction));
				remainder -= GUIconstants.TURTLE_SOLID_MOVE_DISTANCE;
			}
		}
		return root;
	}

	/**
	 * Enter the value of degrees to rotate. The degrees follow the unit circle.
	 * Positive degrees will rotate in the counter-clockwise direction, and
	 * negative degrees will rotate in the clockwise direction.
	 * 
	 * @param degrees
	 *            degrees, based on unit circle, to rotate
	 */
	public void rotate(double degrees) {
		myOrientation += degrees;
		if (myOrientation >= GUIconstants.UNIT_CIRCLE_DEGREES) {
			myOrientation -= GUIconstants.UNIT_CIRCLE_DEGREES;
		}
		if (myOrientation < 0) {
			myOrientation += GUIconstants.UNIT_CIRCLE_DEGREES;
		}
		myImage.setRotate(myImage.getRotate() - degrees);
	}

	/**
	 * Set the Turtle's pen to the "up" position
	 */
	public void penUp() {
		myPen.setPenUp();
	}

	/**
	 * Set the Turtle's pen position to the "down" position
	 */
	public void penDown() {
		myPen.setPenDown();
	}

	/**
	 * check if the pen is in down position.
	 * 
	 * @return boolean where 'true' represents the pen being down, and 'false'
	 *         represents the pen being up
	 */
	public boolean isPenDown() {
		return myPen.getPenDownStatus();
	}

	/**
	 * return the current location of the turtle.
	 * 
	 * @return Point2D containing the x,y coordinates of this turtle
	 */
	public Point2D getLocation() {
		return new Point2D(myXLocation, myYLocation);
	}

	/**
	 * return the orientation (in degrees) of the turtle.
	 * 
	 * @return
	 */
	public double getOrientation() {
		return myOrientation;
	}

	/**
	 * Return this Turtle's SLogoPen
	 * 
	 * @return
	 */
	public SLogoPen getPen() {
		return myPen;
	}

	/**
	 * Set the orientation of the turtle
	 * 
	 * @param degree
	 *            direction in degrees, based on the unit circle, to point the
	 *            turtle in
	 */
	public void setDirection(double degree) {
		myOrientation = degree;
		myImage.setRotate(-degree + GUIconstants.TURTLE_IMAGE_CORRECTION_VALUE);
	}

	/**
	 * Display the turtle's image
	 * 
	 * @return
	 */
	public ImageView display() {
		return myImage;
	}

	/**
	 * set the image of the turtle
	 * 
	 * @param imageFileName
	 */
	public void setImage(String imageFileName) {
		try {
			myImage.setImage(new Image(this.getClass()
					.getResource(imageFileName).toExternalForm()));
		} catch (IllegalArgumentException e) {
			// turn this into error
			System.out.println("Turtle image not found.\n" + e.getMessage());
		} catch (NullPointerException e) {
			// turn this into error
			System.out.println("Turtle image not found.\n" + e.getMessage());
		}

	}

	/**
	 * set the x-location of the turtle
	 * 
	 * @param x
	 */
	public void setX(double x) {
		myXLocation = x;
		myImage.setX(x);
	}

	/**
	 * set the y-location of the turtle
	 * 
	 * @param y
	 */
	public void setY(double y) {
		myYLocation = y;
		myImage.setY(y);
	}

}