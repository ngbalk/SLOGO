package application;

import java.io.IOException;
import java.util.List;
import java.util.ResourceBundle;

import application.Actions.AbstractAction;
import application.Constants.GUIconstants;
import application.Errors.FXMLException;
import application.GUIfeatures.*;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/**
 * The View handles parsing the FXML to create the visual representation of the
 * program. Information is passed between the View and Model through the
 * Controller.
 * 
 * @author Wesley Valentine
 * @author Nick Balkisoon
 *
 */

public class View {
	private Controller myController;
	private Stage myStage;
	private Scene myScene;
	public static ResourceBundle myResources;

	public View(Stage stage) throws IOException {
		myStage = stage;
		this.chooseLanguage();
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
		myController.getActiveWorkspace().updateTurtle(actionChain);
	}

	/**
	 * Load in the FXML and build a controller which will handle our
	 * GUIFeatures.
	 * 
	 * @param String
	 *            language represents the text received from the
	 *            chooseLanguage() method to be loaded into a ResourceBundle
	 */
	private void initializeStage(String language) {
		myResources = ResourceBundle
				.getBundle(GUIconstants.RESOURCE_FILE_PREFIX + language);

		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(
				application.Constants.GUIconstants.ROOT_LAYOUT_FXML_LOCATION));
		Parent root;
		try {
			root = fxmlLoader.load();
			myController = (Controller) fxmlLoader.getController();
			myController.setView(this);
		} catch (IOException exception) {
			displayError(exception);
			return;
		}
		this.myScene = new Scene(root,
				application.Constants.GUIconstants.STAGE_HEIGHT,
				application.Constants.GUIconstants.STAGE_WIDTH);
		this.myStage.setTitle(GUIconstants.STAGE_TITLE);
		this.myStage.setScene(myScene);
		this.myStage.show();
	}

	/**
	 * Display a stage prior to starting the actual program, prompting the user
	 * to input a String representing a language properties file. The chosen
	 * properties file is loaded into a ResourceBundle.
	 * 
	 */
	private void chooseLanguage() {
		Stage stage = new Stage();
		Text message = new Text(GUIconstants.LANGUAGE_PROMPT_TEXT);
		message.setLayoutY(GUIconstants.LANGUAGE_PROMPT_MESSAGE_Y_LOCATION);
		TextField input = new TextField();
		input.setLayoutY(GUIconstants.LANGUAGE_PROMPT_INPUT_Y_LOCATION);
		Button submit = new Button();
		submit.setLayoutX(GUIconstants.LANGUAGE_PROMPT_SUBMIT_X_LOCATION);
		submit.setLayoutY(GUIconstants.LANGUAGE_PROMPT_SUBMIT_Y_LOCATION);
		submit.setText(GUIconstants.LANGUAGE_PROMPT_BUTTON_TEXT);
		submit.setOnAction(event -> submitLanguage(input, stage));
		Group root = new Group();
		root.getChildren().addAll(message, input, submit);
		Scene scene = new Scene(root, GUIconstants.LANGUAGE_PROMPT_SCENE_WIDTH,
				GUIconstants.LANGUAGE_PROMPT_SCENE_HEIGHT);
		stage.setScene(scene);
		stage.show();

	}

	/**
	 * Activated by the Submit button in the prompt for choosing a language.
	 * Passes the String on to be loaded and closes the prompt's window.
	 * 
	 * @param input
	 *            text input representing a language properties file
	 * @param stage
	 *            stage of the prompt to be closed
	 */
	private void submitLanguage(TextField input, Stage stage) {
		this.initializeStage(input.getText());
		stage.close();
	}

	/**
	 * Return the current Scene.
	 * 
	 * @return
	 */
	public Scene getScene() {
		return myScene;
	}

}
