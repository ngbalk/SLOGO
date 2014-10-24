package application.GUIfeatures;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class ShowAndHideTurtleButton extends AbstractGUIFeature implements
		GUIButtonFeature {
	private Button myButton;

	public ShowAndHideTurtleButton() {
		super();

		myButton = new Button();
		myButton.setText("Show/Hide Turtle");
		myButton.setOnAction(event -> behavior());

		this.getChildren().add(myButton);
	}

	@Override
	public void behavior() {
		if (myController
				.getActiveWorkspace()
				.getRoot()
				.getChildren()
				.contains(
						myController.getActiveWorkspace().getCurrentTurtle()
								.display())) {
			myController
					.getActiveWorkspace()
					.getRoot()
					.getChildren()
					.remove(myController.getActiveWorkspace()
							.getCurrentTurtle().display());
		} else {
			myController
					.getActiveWorkspace()
					.getRoot()
					.getChildren()
					.add(myController.getActiveWorkspace().getCurrentTurtle()
							.display());
		}
	}

}
