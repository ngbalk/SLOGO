package application.GUIfeatures;


import application.Workspace;
import application.Constants.GUIconstants;
import application.Errors.InvalidSLogoSyntax;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;
import static application.Controller.myResources;

public class NewWorkspaceButton extends AbstractGUIFeature implements GUIButtonFeature {
	private Button myButton;
	

	public NewWorkspaceButton() {
		super();
		myButton = new Button();
		myButton.setText(myResources.getString(GUIconstants.ADD_WORKSPACE_BUTTON_TITLE));
		myButton.setOnAction(event -> behavior());
		
				
		this.getChildren().add(myButton);
	}

	
	public void behavior() {
		System.out.println("Building behavior");
		Workspace workspace = new Workspace();
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
				myController.getHistoryFeature().update();
				//Testing
				myController.getView().displayError(new InvalidSLogoSyntax());
			}
		});
		myController.getWorkspaceTabs().getTabPane().getTabs().add(newTab);
	}



}
