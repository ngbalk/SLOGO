package application.GUIfeatures;

import static application.View.myResources;
import application.Turtle;
import application.Constants.GUIconstants;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class DashPenButton extends GenericGUIFeature implements
		GUIButtonFeature {
	private Button myButton;

	public DashPenButton() {
		super();

		myButton = new Button();
		myButton.setText(myResources.getString(GUIconstants.DASHED_PEN_TITLE));
		myButton.setOnAction(event -> behavior());

		this.getChildren().add(myButton);

	}

	@Override
	public void behavior() {
		for (Turtle turtle : myController.getActiveWorkspace()
				.getCurrentTurtles().getTurtles()) {
			turtle.getPen().setDashedLine();
		}
	}

}
