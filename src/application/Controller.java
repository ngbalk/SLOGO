package application;

import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.Constants.GUIconstants;
import application.GUIfeatures.*;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

public class Controller implements Initializable {
	public static final ResourceBundle myResources = ResourceBundle.getBundle(GUIconstants.DEFAULT_RESOURCE_FILE);
	private View myView;
	private Model myModel;
	private Workspace myActiveWorkspace;
	@FXML private NewWorkspaceButton myNewWorkspaceButton = new NewWorkspaceButton();
	@FXML private WorkspaceTabs myWorkspaceTabs = new WorkspaceTabs();
	@FXML private BackgroundColorPickerAndButton myBackgroundColorPickerAndButton = new BackgroundColorPickerAndButton();
	@FXML private SubmitTextButtonAndField mySubmitTextButtonAndField = new SubmitTextButtonAndField();
	@FXML private PenColorPickerAndButton myPenColorPickerAndButton = new PenColorPickerAndButton();
	@FXML private PenSizeSlider myPenSizeSlider = new PenSizeSlider();
	@FXML private HistoryFeature myHistoryFeature = new HistoryFeature();
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		this.myActiveWorkspace = new Workspace();
		
		//this.myWorkspaces = new ArrayList<Workspace>();
		//We could update this all at once with a MapReduce Functional programming idiom.
		myNewWorkspaceButton.setController(this);
		myWorkspaceTabs.setController(this);
		mySubmitTextButtonAndField.setController(this);
		myBackgroundColorPickerAndButton.setController(this);
		myPenColorPickerAndButton.setController(this);
		myPenSizeSlider.setController(this);
		myHistoryFeature.setController(this);
	}
	public void setView(View view){
		this.myView = view;
	}
	public View getView(){
		return this.myView;
	}
	public void setModel(Model model){
		this.myModel = model;
	}
	public Model getModel(){
		return this.myModel;
	}
	public WorkspaceTabs getWorkspaceTabs(){
		return this.myWorkspaceTabs;
	}
	public Workspace getActiveWorkspace(){
		return this.myActiveWorkspace;
	}
	public void setActiveWorkspace(Workspace workspace){
		this.myActiveWorkspace = workspace;
	}
	public List<Workspace> getWorkspaces(){
		return myModel.workspaces;
	}
	public HistoryFeature getHistoryFeature() {
		return myHistoryFeature;
	}
}
