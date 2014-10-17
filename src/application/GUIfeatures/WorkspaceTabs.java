package application.GUIfeatures;

import application.Workspace;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.scene.control.Tab;
import javafx.scene.control.TabPane;

public class WorkspaceTabs extends TabPane {
	
	public WorkspaceTabs (double x, double y){
		this.setLayoutX(x);
		this.setLayoutY(y);
		
	}
	
	
}
