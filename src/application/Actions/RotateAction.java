/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.Actions;

import application.AbstractDrawer;
import application.SLogoCanvas;
import application.Turtle;

public abstract class RotateAction extends AbstractAction {
	
	protected double myDegreesToTurn;

	public RotateAction (double degrees){
		myDegreesToTurn = degrees;
	}
	
}