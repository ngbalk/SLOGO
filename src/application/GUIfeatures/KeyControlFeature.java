package application.GUIfeatures;

import java.util.ArrayList;
import java.util.List;

import static application.View.myResources;
import application.Turtle;
import application.Actions.AbstractAction;
import application.Actions.BackwardAction;
import application.Actions.ForwardAction;
import application.Actions.LeftAction;
import application.Actions.RightAction;
import application.Actions.RotateAction;
import application.Constants.GUIconstants;
import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;
import javafx.scene.layout.HBox;

public class KeyControlFeature extends AbstractGUIFeature implements GUIButtonFeature {
	private HBox myContainer;
	private Button myButton;
	public KeyControlFeature(){
		myContainer = new HBox();
		myButton = new Button(myResources.getString(GUIconstants.DEFAULT_KEY_CONTROLLER_BUTTON_TITLE));
		myButton.setOnAction(event -> behavior());
		myContainer.getChildren().addAll(new Label(myResources.getString(GUIconstants.DEFAULT_KEY_CONTROLLER_MESSAGE), myButton));
		this.getChildren().add(myContainer);
	}
	
	public void behavior(){
		EventHandler<KeyEvent> keyHandler = new EventHandler<KeyEvent>(){
			
			@Override
			public void handle(KeyEvent event) {
				myButton.requestFocus();
				if(event.getCode() == KeyCode.D){
					List<AbstractAction> actionChain = new ArrayList<AbstractAction>();
					actionChain.add(new RotateAction(-GUIconstants.DEFAULT_MANUAL_TURTLE_ROTATE));
					updateTurtle(actionChain);
					
				}
				if(event.getCode() == KeyCode.A){
					List<AbstractAction> actionChain = new ArrayList<AbstractAction>();
					actionChain.add(new RotateAction(GUIconstants.DEFAULT_MANUAL_TURTLE_ROTATE));
					updateTurtle(actionChain);
					
				}
				if(event.getCode() == KeyCode.W){
					List<AbstractAction> actionChain = new ArrayList<AbstractAction>();
					actionChain.add(new ForwardAction(GUIconstants.DEFAULT_MANUAL_TURTLE_MOVE_DISTANCE));
					updateTurtle(actionChain);
					
				}
				if(event.getCode() == KeyCode.S){
					List<AbstractAction> actionChain = new ArrayList<AbstractAction>();
					actionChain.add(new ForwardAction(-GUIconstants.DEFAULT_MANUAL_TURTLE_MOVE_DISTANCE));
					updateTurtle(actionChain);
					
				}
				if(event.getCode() == KeyCode.SHIFT){
					for (Turtle turtle : myController.getActiveWorkspace()
							.getCurrentTurtles().getTurtles()) {
					if(turtle.isPenDown()){
						turtle.penUp();
					}
					else{
						turtle.penDown();
					}
				}
				}
			}
		};
		myController.getView().getScene().addEventHandler(KeyEvent.KEY_PRESSED, keyHandler);
	}
	private void updateTurtle(List<AbstractAction >actionChain){
		myController.getActiveWorkspace().updateTurtle(actionChain);
	}

}
