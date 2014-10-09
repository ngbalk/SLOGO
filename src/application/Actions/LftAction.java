package application.Actions;

import application.AbstractDrawer;
import application.SLogoCanvas;
import application.Turtle;

public class LftAction extends RotateAction {

	public LftAction (double degrees){
		super(degrees);
	}
	
	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		turt.rotateLeft(myDegreesToTurn);
	}
	
}