package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.ResourceBundle;

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
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;


public class View {
	private Model myModel;
	private Controller myController;
	private Stage myStage;
	private Scene myScene;
	public static ResourceBundle myResources;

	public View(Stage stage) throws IOException {
		myStage = stage;
		Stage chooseLanguage = new Stage();
		this.chooseLanguage(chooseLanguage);
		//this.initializeStage();
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
	private void initializeStage(String language) {
		myResources = ResourceBundle.getBundle("resources.languages/" + language);
		try {
			this.myModel = new Model();
		} catch (IOException e1) {
			// TODO Fill in with some error
			
		}
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
	public void chooseLanguage(Stage stage){
		Text message = new Text("Please Choose A Language");
		message.setLayoutY(20);
		TextField input = new TextField();
		input.setLayoutY(50);
		Button submit = new Button();
		submit.setLayoutX(200);
		submit.setLayoutY(50);
		submit.setText("Submit");
		submit.setOnAction(event -> submitLanguage(input, stage));
		Group root = new Group();
		root.getChildren().addAll(message, input, submit);
		Scene scene = new Scene(root, 300, 100);
		stage.setScene(scene);
		stage.show();
		
	}
	
	public void submitLanguage(TextField input, Stage stage){
		this.initializeStage(input.getText());
		stage.close();
	}
	/**
	 * Return the Model.
	 * @return
	 */
	public Model getModel(){
		return myModel;
	}
	/**
	 * Return the current Scene.
	 * @return
	 */
	public Scene getScene(){
		return myScene;
	}

	
}
