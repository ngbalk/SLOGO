package application;

import java.io.IOException;
import java.net.URL;
import java.util.ArrayList;
import java.util.List;
import java.util.ResourceBundle;

import application.Constants.GUIconstants;
import application.GUIfeatures.*;
import javafx.collections.ObservableList;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;

/**
 * Controller handles all actions for GUI Features, parses the FXML, and
 * transfers information between the Model and View.
 * 
 * @author Wesley Valentine
 * @author Nick Balkisoon
 *
 */
public class Controller implements Initializable {
	private View myView;
	private Model myModel;

	/**
	 * Each @FXML declaration defines a GenericGUIFeature object for FXML,
	 * allowing the classes to be parsed using an FXMLLoader
	 */
	@FXML
	private NewWorkspaceButton myNewWorkspaceButton = new NewWorkspaceButton();
	@FXML
	private WorkspaceTabs myWorkspaceTabs = new WorkspaceTabs();
	@FXML
	private BackgroundColorPickerAndButton myBackgroundColorPickerAndButton = new BackgroundColorPickerAndButton();
	@FXML
	private SubmitTextButtonAndField mySubmitTextButtonAndField = new SubmitTextButtonAndField();
	@FXML
	private PenColorPickerAndButton myPenColorPickerAndButton = new PenColorPickerAndButton();
	@FXML
	private PenSizeSlider myPenSizeSlider = new PenSizeSlider();
	@FXML
	private HistoryFeature myHistoryFeature = new HistoryFeature();
	@FXML
	private ChooseTurtleImageButton myTurtleImageButtonAndField = new ChooseTurtleImageButton();
	@FXML
	private ToggleReferenceGridButton myToggleReferenceGrid = new ToggleReferenceGridButton();
	@FXML
	private KeyControlFeature myKeyControlFeature = new KeyControlFeature();
	@FXML
	private DashPenButton myDashPenButton = new DashPenButton();
	@FXML
	private DotPenButton myDotPenButton = new DotPenButton();
	@FXML
	private SolidPenButton mySolidPenButton = new SolidPenButton();
	@FXML
	private ShowAndHideTurtleButton myShowAndHideTurtleButton = new ShowAndHideTurtleButton();
	@FXML
	private HelpPageButton myHelpPage = new HelpPageButton();
	@FXML
	private AddTurtleToWorkspaceButton myAddTurtleButton = new AddTurtleToWorkspaceButton();
	@FXML
	SLogoFileOpener myFileOpener = new SLogoFileOpener();

	
	/**
	 * Generate all of the GUI Features and pass them this Controller, allowing
	 * the Controller to handle all information to be passed through the GUI
	 */
	@Override
	public void initialize(URL arg0, ResourceBundle arg1) {
		try {
			myModel = new Model();
		} catch (IOException e) {
			myView.displayError(e);
		}
		GenericGUIFeature[] features = new GenericGUIFeature[] {
				myNewWorkspaceButton, myWorkspaceTabs,
				mySubmitTextButtonAndField, myBackgroundColorPickerAndButton,
				myPenColorPickerAndButton, myPenSizeSlider, myHistoryFeature,
				myTurtleImageButtonAndField, myToggleReferenceGrid,
				myKeyControlFeature, myDashPenButton, myDotPenButton,
				mySolidPenButton, myShowAndHideTurtleButton, myHelpPage,
				myAddTurtleButton, myFileOpener };

		for (GenericGUIFeature feature : features) {
			feature.setController(this);
		}
	}

	public void setView(View view) {
		this.myView = view;
	}

	public View getView() {
		return this.myView;
	}

	public void setModel(Model model) {
		this.myModel = model;
	}

	public Model getModel() {
		return this.myModel;
	}

	public WorkspaceTabs getWorkspaceTabs() {
		return this.myWorkspaceTabs;
	}

	public Workspace getActiveWorkspace() {
		return myModel.getActiveWorkspace();
	}

	public void setActiveWorkspace(Workspace workspace) {
		myModel.setActiveWorkspace(workspace);
	}

	public List<Workspace> getWorkspaces() {
		return myModel.getWorkspaces();
	}

	public HistoryFeature getHistoryFeature() {
		return myHistoryFeature;
	}

}
