/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */

package application.Actions;

import application.SLogoCanvas;
import application.Turtle;

public class Action extends AbstractAction {
	
	public Action() {
		myValue = 0;
		myName = "Action";
	}

	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public String toString() {
		return myName + ": " + myValue + ".";
	}

}
