package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import application.Actions.AbstractAction;
import application.Constants.GUIconstants;
import application.GUIfeatures.*;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Node;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class View {
	private Model myModel;
	private Controller myController;
	private Stage myStage;
	private Scene myScene;

	public View(Stage stage) throws IOException {
		this.myModel = new Model();
		
		myStage = stage;
		this.initializeStage();
	}

	/**
	 * Call displayErrors(String errorString) in order to tell the View to
	 * display an error to the user. The model can use this method in its error
	 * handling process, calling this part of the API and allow the View to
	 * handle displaying errors nicely to the user.
	 * 
	 * @param errorString
	 */
	public void displayError(Exception e) {
		Text errorMessage = new Text(e.getMessage());
		Group content = new Group();
		content.getChildren().add(errorMessage);
		Window errorWindow = new Window(content);
		errorWindow.display();
	}

	/**
	 * Update the currentWorkspace's turtle with the actionChain returned by
	 * Model.parseInput().
	 * 
	 * @param actionChain
	 */
	public void updateTurtle(List<AbstractAction> actionChain) {
		System.out.println("### Updating Turtle. Workspace: "
				+ myController.getActiveWorkspace());
		myController.getActiveWorkspace().updateTurtle(actionChain);
	}

	/**
	 * Load in the FXML and build a controller which will handle our GUIFeatures.
	 * 
	 * @param stage
	 */
	private void initializeStage() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(application.Constants.GUIconstants.ROOT_LAYOUT_FXML_LOCATION));
	 	Parent root;
		try {
			root = fxmlLoader.load();
			myController = (Controller) fxmlLoader.getController();
			myController.setView(this);
			myController.setModel(this.myModel);
		} catch (IOException e) {
			System.out.println("Could not load FXML file" + "\n" + e.getMessage());
			return;
		}
		Scene scene = new Scene(root, application.Constants.GUIconstants.STAGE_HEIGHT, application.Constants.GUIconstants.STAGE_WIDTH);
        this.myScene = scene;
        this.myStage.setTitle(GUIconstants.STAGE_TITLE);
        this.myStage.setScene(scene);
        this.myStage.show();
	}
	/**
	 * Return the Model.
	 * @return
	 */
	public Model getModel(){
		return myModel;
	}

	
}
