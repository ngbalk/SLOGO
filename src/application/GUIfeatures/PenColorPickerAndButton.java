package application.GUIfeatures;

import javafx.scene.paint.Color;
import application.View;

public class PenColorPickerAndButton extends ColorPickerAndButton {
	View myView;

	public PenColorPickerAndButton() {
		super();
	}

	@Override
	public void behavior() {
		myController.getActiveWorkspace().getCurrentTurtle().getPen()
				.setPenColor(myColorPicker.getValue());
	}

	@Override
	protected void setButtonText() {
		myButton.setText("Choose Pen Color");

	}

}
