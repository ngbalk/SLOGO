package application.Actions;

import application.SLogoCanvas;
import application.Turtle;

public class SetHeadingAction extends AbstractAction {

	public SetHeadingAction(double direction){
		myValue = direction;
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		turtle.setDirection(myValue);
	}

	@Override
	public String toString() {
		return "setheading" + myValue;
	}

}
