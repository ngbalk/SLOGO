package application.GUIfeatures;

import javafx.scene.paint.Color;
import application.View;
import application.Constants.GUIconstants;
import static application.View.myResources;

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
		myButton.setText(myResources.getString(GUIconstants.PEN_COLOR_BUTTON_TITLE));

	}

}
