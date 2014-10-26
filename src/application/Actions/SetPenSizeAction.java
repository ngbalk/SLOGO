package application.Actions;

import javafx.scene.control.ColorPicker;
import application.SLogoCanvas;
import application.Turtle;

public class SetPenSizeAction extends Action {

	public SetPenSizeAction(double index) {
		myValue = index;
		myName = "SetPenSize";
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		turtle.getPen().setPenSize(myValue);
	}

}
