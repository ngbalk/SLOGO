package application.GUIfeatures;

import application.Controller;
import application.Workspace;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class WorkspaceTabs extends GUIFeature{
	private TabPane myTabPane;
	public WorkspaceTabs (){
		myTabPane = new TabPane();
		this.getChildren().add(myTabPane);
	}
	public TabPane getTabPane(){
		return myTabPane;
	}


	
	
}
