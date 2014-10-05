package application;

import javafx.geometry.Point2D;

public class AbstractDrawer {

	public AbstractDrawer() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * Enter a value of the distance to move.  A positive value will move forward, a negative value will move backwards.
	 * @param distance
	 */
	public void move(double distance){
		
	}
	/**
	 * Enter the value of degrees to rotate.  Positive degrees will rotate in the clockwise direction, and negative degrees
	 * will rotate in the counter clockwise direction.
	 * @param degrees
	 */
	public void rotate(double degrees){
		
	}
	/**
	 * Set the Drawer's pen to the "up" position
	 */
	public void penUp(){
		
	}
	/**
	 * Set the Drawer's pen position to the "down" position
	 */
	public void penDown(){
		
	}
	/**
	 * check if the pen is in down position.
	 * @return
	 */
	public boolean isPenDown(){
		return false;
	}
	/**
	 * return the current location of the drawer.
	 * @return
	 */
	public Point2D getLocation(){
		return null;
		
	}
	/**
	 * return the orientation (in degrees) of the drawer.
	 * @return
	 */
	public double getOrientation(){
		return 0.0;
	}


}