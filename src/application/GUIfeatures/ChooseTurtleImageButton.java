package application.GUIfeatures;

import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import application.View;
import application.Constants.GUIconstants;
import static application.View.myResources;


public class ChooseTurtleImageButton extends AbstractGUIFeature implements GUIButtonFeature {
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
		myButton.setText(myResources.getString(GUIconstants.TURTLE_IMAGE_BUTTON_TITLE));
		myButton.setOnAction(event -> behavior());
		myContainer.getChildren().addAll(myInputText, myButton);
		this.getChildren().add(myContainer);
	}

	@Override
	public void behavior() {
		myController
		.getActiveWorkspace().getCurrentTurtle().setImage(myInputText.getText());
	}

}
