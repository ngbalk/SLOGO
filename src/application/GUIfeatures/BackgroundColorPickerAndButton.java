package application.GUIfeatures;

import application.View;
import application.Constants.GUIconstants;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import static application.View.myResources;

public class BackgroundColorPickerAndButton extends ColorPickerAndButton {
	public BackgroundColorPickerAndButton(){ 
		super();
	}
	@Override
	protected void behavior() {
		myController.getActiveWorkspace().getCanvas().setBackgroundColor(myColorPicker.getValue());
	}
	@Override
	protected void setButtonText(){
		myButton.setText(myResources.getString(GUIconstants.BACKGROUND_COLOR_BUTTON_TITLE));
		
		
	}

}
