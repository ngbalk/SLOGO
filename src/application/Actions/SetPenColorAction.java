package application.Actions;

import javafx.scene.control.ColorPicker;
import application.SLogoCanvas;
import application.Turtle;

public class SetPenColorAction extends Action {

	public SetPenColorAction(double index) {
		myValue = index;
		myName = "SetPenColor";
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		turtle.getPen().setPenColor(canvas.getColors().get((int) myValue));
	}

}
