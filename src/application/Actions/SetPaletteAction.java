package application.Actions;

import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;
import application.SLogoCanvas;
import application.Turtle;

/**
 * 
 * @author Wesley Valentine
 *
 */

public class SetPaletteAction extends Action {
	Color myColor;

	public SetPaletteAction(double index, double r, double g, double b) {
		myValue = index;
		myColor = Color.rgb((int) r, (int) g, (int) b);
		myName = "SetPalette";
	}

	@Override
	public void update(Turtle turtle, SLogoCanvas canvas) {
		canvas.getColors().add((int) myValue, myColor);
	}

}
