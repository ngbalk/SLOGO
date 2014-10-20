package application.GUIfeatures;

import application.Controller;
import application.View;
import application.Workspace;
import application.Constants.UI;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

public class NewWorkspaceButton extends GUIButtonFeature {
	Controller myController;
	View myView;

	public NewWorkspaceButton() {
		super();
		System.out.println("button built");
	}

	@Override
	public void behavior() {
		System.out.println("Building behavior");
		myView = myController.getView();
		Workspace workspace = new Workspace(UI.DEFAULT_WORKSPACE_WIDTH,
				UI.DEFUALT_WORKSPACE_HEIGHT);

		myView.myWorkspaces.add(workspace);
		myView.myActiveWorkspace = workspace;
		Tab newTab = new Tab(("Workspace #" + (myView.myWorkspaceTabs.getTabs()
				.size() + 1)));
		newTab.setContent(workspace.display());
		newTab.setOnClosed((new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				myView.myWorkspaces.remove(workspace);
			}
		}));
		newTab.setOnSelectionChanged(new EventHandler<Event>() {
			@Override
			public void handle(Event arg0) {
				myView.myActiveWorkspace = workspace;
			}
		});
		myView.myWorkspaceTabs.getTabs().add(newTab);
	}
	public void setView(View view){
		this.myView = view;
	}
	public void setController(Controller controller){
		this.myController = controller;
	}

}
