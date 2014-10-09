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