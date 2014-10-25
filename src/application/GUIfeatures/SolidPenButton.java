package application.GUIfeatures;

import application.Constants.GUIconstants;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;
import static application.View.myResources;

public class SolidPenButton extends AbstractGUIFeature implements
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
		myController.getActiveWorkspace().getCurrentTurtle().getPen().setSolidLine();
	}
}
