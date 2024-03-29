package application.GUIfeatures;

import application.Controller;
import static application.View.myResources;
import application.View;
import application.Constants.GUIconstants;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.event.Event;
import javafx.event.EventHandler;

public class SubmitTextButtonAndField extends GenericGUIFeature implements GUIButtonFeature {
	private HBox myContainer;
	private TextArea myInputText;
	private Button myButton;

	public SubmitTextButtonAndField() {
		super();
		myContainer = new HBox();
		myInputText = new TextArea();
		myButton = new Button();
		myButton.setText(myResources.getString(GUIconstants.SUBMIT_BUTTON_TITLE));
		myButton.setOnAction(event -> behavior());
		myContainer.getChildren().addAll(myInputText, myButton);
		this.getChildren().add(myContainer);
	}

	public void behavior() {
		//I am not sure if this line of code fits into our idea of MVC...
		String text = myInputText.getText();
		myController.getView().updateTurtle(myController.getModel().parseInput(text));
		myController.getActiveWorkspace().getHistory().add(text);
		myInputText.clear();
	}

}
