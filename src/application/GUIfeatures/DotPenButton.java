package application.GUIfeatures;

import application.Constants.GUIconstants;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import static application.Controller.myResources;

public class DotPenButton extends AbstractGUIFeature implements
		GUIButtonFeature {
	private Button myButton;

	public DotPenButton() {
		super();

		myButton = new Button();
		myButton.setText(myResources.getString(GUIconstants.DOTTED_PEN_TITLE));
		myButton.setOnAction(event -> behavior());

		this.getChildren().add(myButton);

	}

	@Override
	public void behavior() {
		myController.getActiveWorkspace().getCurrentTurtle().getPen()
				.setDottedLine();
	}
}
