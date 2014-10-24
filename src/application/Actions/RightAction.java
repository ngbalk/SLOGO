package application.Actions;

import application.AbstractTurtle;
import application.SLogoCanvas;
import application.Turtle;

public class RightAction extends RotateAction {

	public RightAction (double degrees){
		super(degrees);
		myName = "Right";
	}
	
	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		turt.rotateRight(myValue);
	}
}