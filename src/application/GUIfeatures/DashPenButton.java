package application.GUIfeatures;

import static application.Controller.myResources;
import application.Constants.GUIconstants;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;

public class DashPenButton extends AbstractGUIFeature implements
		GUIButtonFeature {
	private HBox myContainer;
	private Button myButton;

	public DashPenButton() {
		super();
		myContainer = new HBox();

		myButton = new Button();
		myButton.setText("Dashed Pen");
		myButton.setOnAction(event -> behavior());

		myContainer.getChildren().addAll(myButton);
		this.getChildren().add(myContainer);

	}

	@Override
	public void behavior() {
		myController.getActiveWorkspace().getCurrentTurtle().getPen()
				.setDashedLine();
	}

}
