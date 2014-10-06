package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import Constants.UI;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.fxml.FXMLLoader;
import javafx.scene.Group;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;
import javafx.scene.control.TextArea;
import javafx.stage.Stage;

public class View {
	private Model myModel;
	private Stage myStage;
	private Scene myScene;
	private TabPane myWorkspaceTabs;
	private Workspace myActiveWorkspace;
	private List<Workspace> myWorkspaces;

	public View(Stage stage){
		this.myModel = new Model();
		this.myWorkspaces = new ArrayList<Workspace>();
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
	 * Update the currentWorkspace's turtle with the actionChain returned by Model.parseInput().
	 * @param actionChain
	 */
	private void updateTurtle(List<AbstractAction> actionChain){
		
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
	        this.myStage.setTitle(UI.STAGE_TITLE);
	        this.myStage.setScene(scene);
	        this.myStage.show();
	        this.myWorkspaceTabs = (TabPane) this.myScene.lookup("#workspaceTabs");
	        Button newTab = (Button) this.myScene.lookup("#newWorkspace");
	        newTab.setOnAction(new EventHandler<ActionEvent>() {
				@Override public void handle(ActionEvent e) {
						addWorkspace(new Workspace());
				}
			});
	        Button submitTextForParsing = (Button) this.myScene.lookup("#submitText");
	        TextArea textInput = (TextArea) this.myScene.lookup("#textInput");
	        submitTextForParsing.setOnAction(new EventHandler<ActionEvent>(){
				@Override
				public void handle(ActionEvent arg0) {
					updateTurtle(myModel.parseInput(textInput.getText()));
					textInput.clear();
				}
	        });
	}
	/**
	 * Add a workspace, adding it to both the TabPane and the List of workspaces.
	 * @param workspace
	 */
	private void addWorkspace(Workspace workspace){
		this.myWorkspaces.add(workspace);
		this.myActiveWorkspace = workspace;
		Tab newTab = new Tab(("Workspace #" + (this.myWorkspaceTabs.getTabs().size() + 1)));
		newTab.setContent(workspace.display());
		newTab.setOnClosed((new EventHandler<Event>(){
			@Override
			public void handle(Event arg0) {
				myWorkspaces.remove(workspace);
			}
		}));
		newTab.setOnSelectionChanged(new EventHandler<Event>(){
			@Override
			public void handle(Event arg0) {
				myActiveWorkspace = workspace;
			}
		});
		this.myWorkspaceTabs.getTabs().add(newTab);
	}


}


