package application.GUIfeatures;

import application.Controller;
import application.View;
import application.Workspace;
import application.Constants.GUIconstants;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;
import static application.Controller.myResources;

public class NewWorkspaceButton extends AbstractGUIFeature implements GUIButtonFeature {
	private View myView;
	private Button myButton;
	

	public NewWorkspaceButton() {
		super();
		myButton = new Button();
		myButton.setText(myResources.getString(GUIconstants.ADD_WORKSPACE_BUTTON_TITLE));
		myButton.setOnAction(event -> behavior());
		
				
		this.getChildren().add(myButton);
	}

	
	public void behavior() {
		Workspace workspace = new Workspace(GUIconstants.DEFAULT_WORKSPACE_WIDTH,
				GUIconstants.DEFUALT_WORKSPACE_HEIGHT);
		myController.getWorkspaces().add(workspace);
		myController.setActiveWorkspace(workspace);
		Tab newTab = new Tab((myResources.getString(GUIconstants.NEW_WORKSPACE_TITLE) + (myController.getWorkspaceTabs().getTabPane().getTabs()
				.size() + 1)));
		newTab.setContent(workspace.display());
		newTab.setOnClosed((new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				myController.getWorkspaces().remove(workspace);
			}
		}));
		newTab.setOnSelectionChanged(new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				myController.setActiveWorkspace(workspace);
			}
		});
		myController.getWorkspaceTabs().getTabPane().getTabs().add(newTab);
	}



}
