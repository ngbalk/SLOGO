package application;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.Constants.UI;
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

	public View(Stage stage) throws IOException{
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
		this.myActiveWorkspace.updateTurtle(actionChain);
	}
	/**
	 * Initialize the application's stage.
	 * @param stage
	 */
	private void initializeStage(){
		 	Parent root;
			try {
				root = FXMLLoader.load(getClass().getResource(application.Constants.UI.ROOT_LAYOUT_FXML_LOCATION));
			} catch (IOException e) {
				System.out.println("Could not load FXML file" + "\n" + e.getMessage());
				return;
			}
	        Scene scene = new Scene(root, application.Constants.UI.STAGE_HEIGHT, application.Constants.UI.STAGE_WIDTH);
	        this.myScene = scene;
	        this.myStage.setTitle(UI.STAGE_TITLE);
	        this.myStage.setScene(scene);
	        this.myStage.show();
	        this.myWorkspaceTabs = (TabPane) this.myScene.lookup("#workspaceTabs");
	        this.bindButtonToHandler("#newWorkspace", event -> addWorkspace(new Workspace(UI.DEFAULT_WORKSPACE_WIDTH, UI.DEFUALT_WORKSPACE_HEIGHT)));
	        this.bindButtonToHandler("#submitText", event -> {
	        	TextArea textInput = (TextArea) this.myScene.lookup("#textInput");
	        	this.updateTurtle(myModel.parseInput(textInput.getText()));
				textInput.clear();
	        });
	}
	
	/**
	 * Bind a button created in the FXML file to an event handler.
	 * @param buttonId
	 * @param handler
	 * @return
	 */
	private Button bindButtonToHandler(String buttonId, EventHandler<ActionEvent> handler){
		Button buttonToBind = (Button) this.myScene.lookup(buttonId);
		buttonToBind.setOnAction(handler);
		return buttonToBind;
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


