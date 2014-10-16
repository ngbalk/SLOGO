package application;

import javafx.geometry.Point2D;

public class AbstractDrawer {
	
	protected double myXLocation;
	protected double myYLocation;
	protected double myOrientation;
	protected boolean myIsPenDown;

	public AbstractDrawer(double x, double y) {
		myXLocation = x;
		myYLocation = y;
		myOrientation = 0;
		myIsPenDown = true;
	}
	
	
	/**
	 * Enter a value of the distance to move.  A positive value will move forward, a negative value will move backwards.
	 * @param distance
	 */
	public void move(double distance){
		double radian = Math.toRadians(myOrientation);
		myXLocation += distance * Math.cos(radian);
		myYLocation += distance * Math.sin(radian);
	}
	/**
	 * Enter the value of degrees to rotate.  Positive degrees will rotate in the clockwise direction, and negative degrees
	 * will rotate in the counter clockwise direction.
	 * @param degrees
	 */
	public void rotate(double degrees){
		myOrientation += degrees;
		if (myOrientation >= 360){
			myOrientation -= 360;
		}
		if (myOrientation < 0){
			myOrientation += 360;
		}
	}
	/**
	 * Set the Drawer's pen to the "up" position
	 */
	public void penUp(){
		myIsPenDown = false;
	}
	/**
	 * Set the Drawer's pen position to the "down" position
	 */
	public void penDown(){
		myIsPenDown = true;
	}
	/**
	 * check if the pen is in down position.
	 * @return
	 */
	public boolean isPenDown(){
		return myIsPenDown;
	}
	/**
	 * return the current location of the drawer.
	 * @return
	 */
	public Point2D getLocation(){
		return new Point2D(myXLocation, myYLocation);
	}
	/**
	 * return the orientation (in degrees) of the drawer.
	 * @return
	 */
	public double getOrientation(){
		return myOrientation;
	}
	
}