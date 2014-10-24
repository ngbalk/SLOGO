/**
 *  @author Pranava Raparla
 *  Created: October 24th, 2014
 *  Modified: October 24th, 2014
 */
package application.Actions;

import application.SLogoCanvas;
import application.Turtle;
import application.Constants.GUIconstants;

public class HomeAction extends Action {

	public HomeAction(){
		myName = "Home";
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		// TODO: entire canvas is cleared instead of just lines...gotta fix that
		canvas.display().getChildren().clear();
		turtle.setX(GUIconstants.DEFAULT_TURTLE_X_LOCATION);
		turtle.setY(GUIconstants.DEFAULT_TURTLE_Y_LOCATION);
	}
}