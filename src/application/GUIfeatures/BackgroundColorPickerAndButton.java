package application.GUIfeatures;

import application.View;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;

public class BackgroundColorPickerAndButton extends GUIFeature {
	private HBox myContainer;
	private Button myButton;
	private ColorPicker myColorPicker;

	public BackgroundColorPickerAndButton(){ 
		super();
		myContainer = new HBox();
		myColorPicker = new ColorPicker();
		myButton = new Button();
		myButton.setText("Choose Background Color");
		myButton.setOnAction(event -> behavior());
		myContainer.getChildren().addAll(myButton, myColorPicker);
		this.getChildren().add(myContainer);
	}
	
	public void behavior() {
		myController.getActiveWorkspace().getCanvas().setBackgroundColor(myColorPicker.getValue());
	}

}
