package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import application.Actions.AbstractAction;
import application.Constants.UI;
import application.GUIfeatures.ChooseBackgroundColorButton;
import application.GUIfeatures.ChoosePenColorButton;
import application.GUIfeatures.ChooseTurtleImageButton;
import application.GUIfeatures.GUIButtonFeature;
import application.GUIfeatures.NewWorkspaceButton;
import application.GUIfeatures.PenSizeButton;
import application.GUIfeatures.SubmitTextButton;
import application.GUIfeatures.SubmitTextField;
import application.GUIfeatures.WorkspaceTabs;
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
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class View {
	private Model myModel;
	private Controller myController;
	private Stage myStage;
	private Scene myScene;
	private TabPane myWorkspaceTabs;

	private ColorPicker myColorPicker;

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
	public void displayError(String errorString) {

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
	 * Initialize the application's stage.
	 * 
	 * @param stage
	 */
	private void initializeStage() {
		FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource(application.Constants.UI.ROOT_LAYOUT_FXML_LOCATION));
	 	Parent root;
		try {
			root = fxmlLoader.load();
			myController = (Controller) fxmlLoader.getController();
			myController.setView(this);
		} catch (IOException e) {
			System.out.println("Could not load FXML file" + "\n" + e.getMessage());
			return;
		}
		
		
		System.out.println("Controller built");
		Scene scene = new Scene(root, application.Constants.UI.STAGE_HEIGHT, application.Constants.UI.STAGE_WIDTH);
        this.myScene = scene;
        this.myStage.setTitle(UI.STAGE_TITLE);
        this.myStage.setScene(scene);
        this.myStage.show();

//		Group root = new Group();
//		Scene scene = new Scene(root, application.Constants.UI.STAGE_HEIGHT,
//				application.Constants.UI.STAGE_WIDTH);
//		this.myScene = scene;
//		this.myStage.setTitle(UI.STAGE_TITLE);
//		this.myStage.setScene(scene);
//		this.myStage.show();
//
//		myWorkspaceTabs = new WorkspaceTabs();
//
//		SubmitTextField codeInputField = new SubmitTextField(300, 740);
//		SubmitTextField penSizeInputField = new SubmitTextField(750, 200);
//		SubmitTextField turtleImageInputField = new SubmitTextField(750, 300);
//
//		myColorPicker = new ColorPicker(Color.RED);
//		myColorPicker.setLayoutX(750);
//		myColorPicker.setLayoutY(10);
//
//		Object[] features = new Object[] {
//				myWorkspaceTabs,
//				new NewWorkspaceButton(10, 10, this),
//				codeInputField,
//				new SubmitTextButton(600, 750, codeInputField, this),
//				myColorPicker,
//				new ChooseBackgroundColorButton(750, 60, this),
//				penSizeInputField,
//				new PenSizeButton(750, 250, this, penSizeInputField),
//				new ChoosePenColorButton(750, 110, this),
//				new ChooseTurtleImageButton(750, 350, this,
//						turtleImageInputField), turtleImageInputField
//		};
//
//		for (Object o : features) {
//			root.getChildren().add((Node) o);
//		}

	}

	// /**
	// * Bind a button created in the FXML file to an event handler.
	// *
	// * @param buttonId
	// * @param handler
	// * @return
	// */
	// private Button bindButtonToHandler(String buttonId,
	// EventHandler<ActionEvent> handler) {
	// Button buttonToBind = (Button) this.myScene.lookup(buttonId);
	// buttonToBind.setOnAction(handler);
	// return buttonToBind;
	// }

	/**
	 * Add a workspace, adding it to both the TabPane and the List of
	 * workspaces.
	 * 
	 * @param workspace
	 */

//	private Model myModel;
//	private Stage myStage;
//	private Scene myScene;
//	private TabPane myWorkspaceTabs;
//	private Workspace myActiveWorkspace;
//	private List<Workspace> myWorkspaces;
//	private ColorPicker myColorPicker;
	

	
}
