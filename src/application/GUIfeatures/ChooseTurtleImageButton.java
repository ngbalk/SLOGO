package application.GUIfeatures;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import application.Turtle;
import application.View;
import application.Constants.GUIconstants;
import static application.View.myResources;

public class ChooseTurtleImageButton extends GenericGUIFeature implements
		GUIButtonFeature {
	private HBox myContainer;
	private TextArea myInputText;
	private Button myButton;

	public ChooseTurtleImageButton() {
		super();
		myContainer = new HBox();
		myInputText = new TextArea();
		myInputText.setMaxHeight(20);
		myInputText.setMaxWidth(500);
		myButton = new Button();
		myButton.setText(myResources
				.getString(GUIconstants.TURTLE_IMAGE_BUTTON_TITLE));
		myButton.setOnAction(event -> behavior());
		myContainer.getChildren().addAll(myInputText, myButton);
		this.getChildren().add(myContainer);
	}

	@Override
	public void behavior() {
		for (Turtle turtle : myController.getActiveWorkspace()
				.getCurrentTurtles().getTurtles()) {
			turtle.setImage(myInputText.getText());
		}
	}

}
