package application.GUIfeatures;

import application.Controller;
import javafx.scene.Group;
import javafx.scene.control.Button;

/**
 * All GUI features store a Controller that will handle the transfer of data
 * throughout the GUI and Model.
 * 
 * @author Wesley Valentine
 * @author Nick Balkisoon
 *
 */
public class GenericGUIFeature extends Group{
	
	protected Controller myController;
	
	public void setController(Controller controller){
		myController = controller;
	}
	
}
