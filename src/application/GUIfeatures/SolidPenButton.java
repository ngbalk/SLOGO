package application.GUIfeatures;

import javafx.scene.control.Button;
import javafx.scene.layout.HBox;

public class SolidPenButton extends AbstractGUIFeature implements
		GUIButtonFeature {

	private HBox myContainer;
	private Button myButton;

	public SolidPenButton() {
		super();
		myContainer = new HBox();

		myButton = new Button();
		myButton.setText("Solid Pen");
		myButton.setOnAction(event -> behavior());

		myContainer.getChildren().addAll(myButton);
		this.getChildren().add(myContainer);

	}

	@Override
	public void behavior() {
		myController.getActiveWorkspace().getCurrentTurtle().getPen().setSolidLine();
	}
}
