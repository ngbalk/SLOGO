/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 23rd, 2014
 */

package application.Actions;

import application.AbstractTurtle;
import application.SLogoCanvas;
import application.Turtle;
import javafx.geometry.Point2D;

public abstract class AbstractAction {
	
	// TODO: Not really sure what to put in this class
	
	public AbstractTurtle myDrawer;
	public Point2D nextPoint;
	public double myValue;
	/**
	 * update takes in an AbstractDrawer and updates it according to the specifications of this type of Action.
	 * @param currentDrawer
	 */
	public abstract void update(Turtle turt, SLogoCanvas canvas);
	public abstract String toString();
	
	public double getValue() {
		return myValue;
	}
}
