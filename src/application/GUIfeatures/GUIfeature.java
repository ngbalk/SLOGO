package application.GUIfeatures;

import javafx.scene.control.Button;

public abstract class GUIfeature extends Button{
	
	public abstract void behavior();

	public GUIfeature(double x, double y){
		
		this.setLayoutX(x);
		this.setLayoutY(y);
		this.setOnAction(event -> behavior());
	}
	
}
