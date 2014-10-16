package application.GUIfeatures;

import application.SLogoCanvas;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class ChooseBackgroundColorButton extends Button {
	SLogoCanvas myCanvas;
	final ColorPicker myColorPicker;

	public ChooseBackgroundColorButton(double x, double y, SLogoCanvas canvas) {
		myCanvas = canvas;
		myColorPicker = new ColorPicker();
	}
	
	public void behavior() {
		
		myColorPicker.setOnAction(new EventHandler() {
			public void handle(Event t) {
				myCanvas.setBackgroundColor((myColorPicker.getValue()));
			}
		});

	}

}
