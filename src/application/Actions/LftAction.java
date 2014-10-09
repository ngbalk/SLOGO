package application.Actions;

import application.AbstractDrawer;
import application.SLogoCanvas;
import application.Turtle;

public class LftAction extends AbstractAction {
	
	private double myDegreesToTurn;

	public LftAction (double degrees){
		myDegreesToTurn = degrees;
	}
	
	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		turt.rotateLeft(myDegreesToTurn);
	}

	
	
}
