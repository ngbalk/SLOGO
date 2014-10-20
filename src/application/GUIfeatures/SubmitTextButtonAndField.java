package application.GUIfeatures;

import application.Controller;
import application.View;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.event.Event;
import javafx.event.EventHandler;

public class SubmitTextButtonAndField extends GUIFeature implements GUIButtonFeature {
	TextArea myInputText;
	Button myButton;

	public SubmitTextButtonAndField() {
		super();
		myInputText = new TextArea();
		myButton = new Button();
		myButton.setText("Submit");
		this.getChildren().add(myInputText);
		this.getChildren().add(myButton);
		myButton.setOnAction(event -> behavior());
	}

	public void behavior() {
		myController.getView().updateTurtle(myController.getView().getModel().parseInput(myInputText.getText()));
		myInputText.clear();
		
	}

}
