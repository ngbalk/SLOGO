package application.Actions;

import application.AbstractTurtle;
import application.SLogoCanvas;
import application.Turtle;

public class RtAction extends RotateAction {

	public RtAction (double degrees){
		super(degrees);
	}
	
	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		turt.rotateRight(myDegreesToTurn);
	}
	
}