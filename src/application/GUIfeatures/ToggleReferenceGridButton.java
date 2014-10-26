package application.GUIfeatures;

import static application.View.myResources;
import javafx.scene.control.Button;
import application.Constants.GUIconstants;

public class ToggleReferenceGridButton extends GenericGUIFeature implements GUIButtonFeature {
	Button myButton;
	
	public ToggleReferenceGridButton(){
		super();
		myButton = new Button();
		myButton.setText(myResources.getString(GUIconstants.TOGGLE_GRID_LINES_BUTTON));
		myButton.setOnAction(event -> behavior());		
		this.getChildren().add(myButton);
	}

	@Override
	public void behavior() {
		myController.getActiveWorkspace().getCanvas().toggleGridLines();
	}
	
	

}
