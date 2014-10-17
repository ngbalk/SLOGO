package application.GUIfeatures;

import javafx.scene.control.TextArea;

public class SubmitTextField extends TextArea{
	
	public SubmitTextField(double x, double y){
		this.setLayoutX(x);
		this.setLayoutY(y);
		this.setMaxSize(200, 20);
	}
}
