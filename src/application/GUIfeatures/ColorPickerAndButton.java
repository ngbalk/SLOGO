package application.GUIfeatures;

import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.layout.HBox;

public abstract class ColorPickerAndButton extends AbstractGUIFeature{
	protected HBox myContainer;
	protected Button myButton;
	protected ColorPicker myColorPicker;
	public ColorPickerAndButton() {
		super();
		myContainer = new HBox();
		myColorPicker = new ColorPicker();
		myButton = new Button();
		this.setButtonText();
		myButton.setOnAction(event -> behavior());
		myContainer.getChildren().addAll(myButton, myColorPicker);
		this.getChildren().add(myContainer);
	}
	protected abstract void behavior();
	protected abstract void setButtonText();
	

}
