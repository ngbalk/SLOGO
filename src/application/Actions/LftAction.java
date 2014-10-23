package application.Actions;

import application.AbstractTurtle;
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

	@Override
	public String toString() {
		return "lft " + myDegreesToTurn;
	}
	
	
}