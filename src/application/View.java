package application;

import java.io.IOException;
import java.util.List;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class View {
	private Stage myStage;
	private Scene myScene;

	public View(Stage stage){
		myStage = stage;
		this.initializeStage();
	}
	
	/**
	 * Call displayErrors(String errorString) in order to tell the View to display an error to the user.  The model can use
	 * this method in its error handling process, calling this part of the API and allow the View to handle displaying errors 
	 * nicely to the user.
	 * @param errorString
	 */
	public void displayError(String errorString){
		
	}
	/**
	 * Initialize the application's stage.
	 * @param stage
	 */
	private void initializeStage(){
		 	Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource(Constants.UI.ROOT_LAYOUT_FXML_LOCATION));
			} catch (IOException e) {
				System.out.println("Could not load FXML file" + "\n" + e.getMessage());
				root = new Group();
			}
	        Scene scene = new Scene(root, Constants.UI.STAGE_HEIGHT, Constants.UI.STAGE_WIDTH);
	        this.myScene = scene;
	        myStage.setTitle("SLogo");
	        myStage.setScene(scene);
	        myStage.show();
	}

}


