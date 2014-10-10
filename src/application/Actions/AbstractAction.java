/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */

package application.Actions;

import application.AbstractDrawer;
import application.SLogoCanvas;
import application.Turtle;
import javafx.geometry.Point2D;

public abstract class AbstractAction {
	
	// TODO: Not really sure what to put in this class
	
	public AbstractDrawer myDrawer;
	public Point2D nextPoint;
	/**
	 * update takes in an AbstractDrawer and updates it according to the specifications of this type of Action.
	 * @param currentDrawer
	 */
	public abstract void update(Turtle turt, SLogoCanvas canvas);
	
	
}