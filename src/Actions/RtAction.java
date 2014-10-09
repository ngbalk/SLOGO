package Actions;

import application.AbstractAction;
import application.AbstractDrawer;
import application.SLogoCanvas;
import application.Turtle;

public class RtAction extends AbstractAction {
	
	private double myDegreesToTurn;

	public RtAction (double degrees){
		myDegreesToTurn = degrees;
	}
	
	@Override
	public void update(Turtle turt, SLogoCanvas canvas) {
		turt.rotateRight(myDegreesToTurn);
	}

	
	
}
