package application.GUIfeatures;

import static application.View.myResources;
import application.Turtle;
import application.Constants.GUIconstants;
import javafx.scene.control.Button;

public class AddTurtleToWorkspaceButton extends AbstractGUIFeature implements
		GUIButtonFeature {
	private Button myButton;

	public AddTurtleToWorkspaceButton() {
		super();

		myButton = new Button();
		myButton.setText(myResources.getString(GUIconstants.ADD_TURTLE_TITLE));
		myButton.setOnAction(event -> behavior());

		this.getChildren().add(myButton);
	}

	@Override
	public void behavior() {
		Turtle newTurtle = new Turtle(GUIconstants.DEFAULT_TURTLE_X_LOCATION,
				GUIconstants.DEFAULT_TURTLE_Y_LOCATION);
		newTurtle.setImage(GUIconstants.HIGHLIGHTED_TURTLE_IMAGE);
		myController.getActiveWorkspace().getCurrentTurtles().add(newTurtle);
		myController.getActiveWorkspace().getRoot().getChildren()
				.add(newTurtle.display());
	}

}
