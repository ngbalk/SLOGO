package application.GUIfeatures;

import application.Turtle;
import application.Constants.GUIconstants;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import static application.View.myResources;

public class SolidPenButton extends GenericGUIFeature implements
		GUIButtonFeature {

	private Button myButton;

	public SolidPenButton() {
		super();

		myButton = new Button();
		myButton.setText(myResources.getString(GUIconstants.SOLID_PEN_TITLE));
		myButton.setOnAction(event -> behavior());

		this.getChildren().add(myButton);

	}

	@Override
	public void behavior() {
		for (Turtle turtle : myController.getActiveWorkspace()
				.getCurrentTurtles().getTurtles()) {
			turtle.getPen().setSolidLine();
		}
	}
}
