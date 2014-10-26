package application.GUIfeatures;

import application.Controller;
import javafx.scene.Group;
import javafx.scene.control.Button;

public class GenericGUIFeature extends Group{
	
	protected Controller myController;
	
	public void setController(Controller controller){
		myController = controller;
	}
	
}
