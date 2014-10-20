package application.GUIfeatures;

import application.View;
import application.Workspace;
import application.Constants.UI;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Tab;

public class NewWorkspaceButton extends GUIButtonFeature {
	View myView;

	public NewWorkspaceButton(double x, double y, View v) {
		super(x, y);
		this.setText("New Workspace");
		myView = v;
	}

	@Override
	public void behavior() {
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

}
