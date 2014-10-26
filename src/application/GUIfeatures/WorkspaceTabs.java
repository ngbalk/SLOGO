package application.GUIfeatures;

import javafx.scene.control.TabPane;

public class WorkspaceTabs extends GenericGUIFeature{
	private TabPane myTabPane;
	public WorkspaceTabs (){
		myTabPane = new TabPane();
		this.getChildren().add(myTabPane);
	}
	public TabPane getTabPane(){
		return myTabPane;
	}


	
	
}
