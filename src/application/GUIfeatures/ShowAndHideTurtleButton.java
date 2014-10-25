package application.GUIfeatures;

import application.Constants.GUIconstants;
import static application.View.myResources;
import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ShowAndHideTurtleButton extends AbstractGUIFeature implements
		GUIButtonFeature {
	private Button myButton;

	public ShowAndHideTurtleButton() {
		super();

		myButton = new Button();
		myButton.setText(myResources.getString(GUIconstants.SHOW_TURTLE_BUTTON_TITLE));
		myButton.setOnAction(event -> behavior());

		this.getChildren().add(myButton);
	}

	@Override
	public void behavior() {
		if (myController
				.getActiveWorkspace()
				.getCanvas()
				.display()
				.getChildren()
				.contains(
						myController.getActiveWorkspace().getCurrentTurtle()
								.display())) {
			myController
					.getActiveWorkspace()
					.getCanvas()
					.display()
					.getChildren()
					.remove(myController.getActiveWorkspace()
							.getCurrentTurtle().display());
		} else {
			myController
					.getActiveWorkspace()
					.getCanvas()
					.display()
					.getChildren()
					.add(myController.getActiveWorkspace().getCurrentTurtle()
							.display());
		}
	}

}
