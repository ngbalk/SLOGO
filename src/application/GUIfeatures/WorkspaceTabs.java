package application.GUIfeatures;

import javafx.scene.control.TabPane;

public class WorkspaceTabs extends AbstractGUIFeature{
	private TabPane myTabPane;
	public WorkspaceTabs (){
		myTabPane = new TabPane();
		this.getChildren().add(myTabPane);
	}
	public TabPane getTabPane(){
		return myTabPane;
	}


	
	
}
