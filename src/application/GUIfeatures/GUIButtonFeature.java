package application.GUIfeatures;

import javafx.scene.control.Button;

public abstract class GUIButtonFeature extends Button{
	
	public abstract void behavior();

	public GUIButtonFeature(){
		System.out.println("building button");
		this.setOnAction(event -> behavior());
		System.out.println("behavior set");
	}
	
}
