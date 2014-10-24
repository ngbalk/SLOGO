package application.GUIfeatures;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class DotPenButton extends AbstractGUIFeature implements GUIButtonFeature {
	private HBox myContainer;
	private Button myButton;

	public DotPenButton() {
		super();
		myContainer = new HBox();

		myButton = new Button();
		myButton.setText("Dotted Pen");
		myButton.setOnAction(event -> behavior());

		myContainer.getChildren().addAll(myButton);
		this.getChildren().add(myContainer);

	}

	@Override
	public void behavior() {
		myController.getActiveWorkspace().getCurrentTurtle().getPen()
				.setDottedLine();
	}
}
