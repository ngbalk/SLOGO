package application.GUIfeatures;

import application.SLogoCanvas;
import application.View;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.paint.Color;

public class ChooseBackgroundColorButton extends GUIButtonFeature {
	View myView;

	public ChooseBackgroundColorButton(double x, double y, View view){ 
		super(x, y);
		myView = view;
		this.setText("Choose Background Color");
	}
	
	public void behavior() {
		myView.getActiveWorkspace().getCanvas().setBackgroundColor(myView.getColorPicker().getValue());
	}

}
