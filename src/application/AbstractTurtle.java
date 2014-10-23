package application;

import javafx.geometry.Point2D;
import javafx.scene.shape.Line;

public class AbstractTurtle { 
	
	protected double myXLocation;
	protected double myYLocation;
	protected double myOrientation;
	protected SLogoPen myPen;

	public AbstractTurtle(double x, double y) {
		myXLocation = x;
		myYLocation = y;
		myOrientation = 0;
		myPen = new SLogoPen();
	}
	
	
	/**
	 * Enter a value of the distance to move.  A positive value will move forward, a negative value will move backwards. 
	 * A line is returned, corresponding to the correct drawing.
	 * @param distance
	 */
	public Line move(double distance){
		Point2D start = this.getLocation();
		double radian = Math.toRadians(myOrientation);
		myXLocation += distance * Math.cos(radian);
		myYLocation -= distance * Math.sin(radian);
		return   myPen.drawLine(start, this.getLocation());
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
		myPen.setPenUp();
	}
	/**
	 * Set the Drawer's pen position to the "down" position
	 */
	public void penDown(){
		myPen.setPenDown();
	}
	/**
	 * check if the pen is in down position.
	 * @return
	 */
	public boolean isPenDown(){
		return myPen.getPenDownStatus();
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
	
	public SLogoPen getPen(){
		return myPen;
	}
	
}