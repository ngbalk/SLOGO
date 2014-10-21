package application.GUIfeatures;

import application.View;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

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
		myButton.setText("Choose Background Color");
	}

}
