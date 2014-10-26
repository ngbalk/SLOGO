package application.Actions;

import javafx.scene.control.ColorPicker;
import application.SLogoCanvas;
import application.Turtle;

public class SetBackgroundAction extends Action {

	public SetBackgroundAction(double index){
		myValue = index;
		myName = "SetBackground";		
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		turtle.setDirection(myValue);
	}

	
}
