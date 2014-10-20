package application.GUIfeatures;

import application.Controller;
import application.View;
import application.Workspace;
import application.Constants.UI;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.Group;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import javafx.scene.layout.Pane;

public class NewWorkspaceButton extends GUIFeature implements GUIButtonFeature {
	View myView;
	Button myButton;

	public NewWorkspaceButton() {
		super();
		myButton = new Button();
		myButton.setText("Add Workspace");
		myButton.setOnAction(event -> behavior());
		
				
		this.getChildren().add(myButton);
		System.out.println("button built");
	}

	
	public void behavior() {
		System.out.println("Building behavior");
		Workspace workspace = new Workspace(UI.DEFAULT_WORKSPACE_WIDTH,
				UI.DEFUALT_WORKSPACE_HEIGHT);
		myController.getWorkspaces().add(workspace);
		myController.setActiveWorkspace(workspace);
		Tab newTab = new Tab(("Workspace #" + (myController.getWorkspaceTabs().getTabPane().getTabs()
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
