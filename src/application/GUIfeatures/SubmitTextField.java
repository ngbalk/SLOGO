package application.GUIfeatures;

import application.Constants.GUIconstants;
import javafx.scene.control.TextArea;

public class SubmitTextField extends TextArea{
	
	public SubmitTextField(double x, double y){
		this.setLayoutX(x);
		this.setLayoutY(y);
		this.setMaxSize(GUIconstants.DEFAULT_WORKSPACE_WIDTH, GUIconstants.DEFUALT_WORKSPACE_HEIGHT);
	}
}
