/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */

package application.Actions;

import application.Turtle;
import application.SLogoCanvas;
import javafx.geometry.Point2D;

public abstract class AbstractAction {
	
	public Point2D nextPoint;
	public double myValue;
	public String myName;
	
	/**
	 * update takes in an AbstractDrawer and updates it according to the specifications of this type of Action.
	 * @param currentDrawer
	 */
	public abstract void update(Turtle turt, SLogoCanvas canvas);
	
	public double getValue() {
		return myValue;
	}
	
	public String toString() {
		return "Action: " + myName + " " + myValue;
	}
}
