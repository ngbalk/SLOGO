package application.GUIfeatures;

import application.Controller;
import application.View;
import javafx.scene.control.Button;
import javafx.scene.control.TextArea;
import javafx.scene.layout.HBox;
import javafx.event.Event;
import javafx.event.EventHandler;

public class SubmitTextButtonAndField extends GUIFeature implements GUIButtonFeature {
	private HBox myContainer;
	private TextArea myInputText;
	private Button myButton;

	public SubmitTextButtonAndField() {
		super();
		myContainer = new HBox();
		myInputText = new TextArea();
		myButton = new Button();
		myButton.setText("Submit");
		myButton.setOnAction(event -> behavior());
		myContainer.getChildren().addAll(myInputText, myButton);
		this.getChildren().add(myContainer);
	}

	public void behavior() {
		//I am not sure if this line of code fits into our idea of MVC...
		myController.getView().updateTurtle(myController.getModel().parseInput(myInputText.getText()));
		myInputText.clear();
	}

}
