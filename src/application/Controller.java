package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.GUIfeatures.*;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.stage.Stage;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable {
	private View myView;
	private Workspace myActiveWorkspace;
	private List<Workspace> myWorkspaces;
	@FXML private NewWorkspaceButton myNewWorkspaceButton = new NewWorkspaceButton();
	@FXML private WorkspaceTabs myWorkspaceTabs = new WorkspaceTabs();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.myWorkspaces = new ArrayList<Workspace>();
		//We could update this all at once with a MapReduce Functional programming idiom.
		myNewWorkspaceButton.setController(this);
		myWorkspaceTabs.setController(this);

	}
	public void setView(View view){
		this.myView = view;
	}
	public View getView(){
		return myView;
	}
//	public Model getModel(){
//		return myModel;
//	}
//	public Stage getStage(){
//		return myStage;
//	}
//	public Scene getScene(){
//		return myScene;
//	}
	public WorkspaceTabs getWorkspaceTabs(){
		return myWorkspaceTabs;
	}
	public Workspace getActiveWorkspace(){
		return myActiveWorkspace;
	}
	public void setActiveWorkspace(Workspace workspace){
		this.myActiveWorkspace = workspace;
	}
	public List<Workspace> getWorkspaces(){
		return myWorkspaces;
	}
//	public ColorPicker getColorPicker(){
//		return myColorPicker;
//	}
	

}
