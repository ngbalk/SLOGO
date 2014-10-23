/**
 *  @author Pranava Raparla
 *  Created: October 9th, 2014
 *  Modified: October 9th, 2014
 */
package application.Actions;

import application.AbstractTurtle;
import application.SLogoCanvas;
import application.Turtle;

public abstract class RotateAction extends AbstractAction {

	public RotateAction (double degrees){
		myValue = degrees;
	}
	public abstract String toString();
	
}