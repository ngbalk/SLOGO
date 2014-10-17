package application.GUIfeatures;

import javafx.scene.control.Button;

public abstract class GUIButtonFeature extends Button{
	
	public abstract void behavior();

	public GUIButtonFeature(double x, double y){
		
		this.setLayoutX(x);
		this.setLayoutY(y);
		this.setOnAction(event -> behavior());
	}
	
}
