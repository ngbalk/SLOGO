package application;

import application.Constants.GUIconstants;
import javafx.geometry.Point2D;
import javafx.scene.Group;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.shape.Line;

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
		myImage.setRotate(90);
	}

	/**
	 * Enter a value of the distance to move. A positive value will move
	 * forward, a negative value will move backwards. A line is returned,
	 * corresponding to the correct drawing.
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
		// to-do: fix line drawing to draw over edge of canvas
		this.myImage.setX(this.myXLocation);
		this.myImage.setY(this.myYLocation);
		return myPen.drawLine(start, this.getLocation());
	}

	public Group move(double distance) {
		Group root = new Group();
		double direction = distance / Math.abs(distance);
		double remainder = Math.abs(distance);
		while (remainder > 0) {
			// I PROMISE I WILL COME UP WITH A BETTER SOLUTION
			// BUT MAYBE THIS IDEA WILL BE COOL FOR ANIMATING
			// PROBABLY SHOULDN'T BE IN THE FORWARD ACTION THOUGH
			if (this.getPen().isDashed() && remainder >= 30) {
				root.getChildren().add(this.step(30 * direction));
				remainder -= 30;
			} else if (this.getPen().isDotted() && remainder >= 5) {
				root.getChildren().add(this.step(5 * direction));
				remainder -= 5;
			} else {
				root.getChildren().add(this.step(1 * direction));
				remainder -= 1;
			}
		}
		return root;
	}

	/**
	 * Enter the value of degrees to rotate. Positive degrees will rotate in the
	 * clockwise direction, and negative degrees will rotate in the counter
	 * clockwise direction.
	 * 
	 * @param degrees
	 */
	public void rotate(double degrees) {
		myOrientation += degrees;
		if (myOrientation >= 360) {
			myOrientation -= 360;
		}
		if (myOrientation < 0) {
			myOrientation += 360;
		}
		myImage.setRotate(myImage.getRotate() - degrees);
	}

	/**
	 * Set the Drawer's pen to the "up" position
	 */
	public void penUp() {
		myPen.setPenUp();
	}

	/**
	 * Set the Drawer's pen position to the "down" position
	 */
	public void penDown() {
		myPen.setPenDown();
	}

	/**
	 * check if the pen is in down position.
	 * 
	 * @return
	 */
	public boolean isPenDown() {
		return myPen.getPenDownStatus();
	}

	/**
	 * return the current location of the drawer.
	 * 
	 * @return
	 */
	public Point2D getLocation() {
		return new Point2D(myXLocation, myYLocation);
	}

	/**
	 * return the orientation (in degrees) of the drawer.
	 * 
	 * @return
	 */
	public double getOrientation() {
		return myOrientation;
	}

	public SLogoPen getPen() {
		return myPen;
	}

	public double getSizeX() {
		return myImage.getX();
	}

	public double getSizeY() {
		return myImage.getY();
	}

	public void setDirection(double degree) {
		myOrientation = degree;
		myImage.setRotate(-degree + 90);
	}

	public ImageView display() {
		return myImage;
	}

	public void setImage(String imageFileName) {
		try {
			myImage.setImage(new Image(this.getClass()
					.getResource(imageFileName).toExternalForm()));
		} catch (IllegalArgumentException e) {
			System.out.println("Turtle image not found.\n" + e.getMessage());
			e.printStackTrace();
		} catch (NullPointerException e) {
			System.out.println("Turtle image not found.\n" + e.getMessage());
			e.printStackTrace();
		}

	}

	public void setX(double x) {
		myXLocation = x;
		myImage.setX(x);
	}

	public void setY(double y) {
		myYLocation = y;
		myImage.setY(y);
	}

}