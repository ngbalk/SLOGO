package application.GUIfeatures;

import application.Constants.GUIconstants;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.text.TextAlignment;
import javafx.stage.Stage;

public class Window {
	private Stage myStage;
	private Scene myScene;
	public Window(Group content){
		this.myStage = new Stage();
		Group root = new Group();
		root.getChildren().add(content);
		this.myScene = new Scene(root);
		this.myStage.setScene(this.myScene);
		this.myStage.sizeToScene();
	}
	public void display(){
		this.myStage.show();
	}
}