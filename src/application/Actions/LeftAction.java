package application.Actions;

import application.AbstractTurtle;
import application.SLogoCanvas;
import application.Turtle;

public class LeftAction extends RotateAction {

	public LeftAction (double degrees){
		super(degrees);
	}
	
	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		turt.rotateLeft(myValue);
	}

	@Override
	public String toString() {
		return "lft " + myValue;
	}
	
	
}