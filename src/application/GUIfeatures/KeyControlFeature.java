package application.GUIfeatures;

import javafx.event.EventHandler;
import javafx.scene.control.Button;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyEvent;

public class KeyControlFeature extends AbstractGUIFeature{
	private Button myButton;
	public KeyControlFeature(){
		myButton = new Button("Activate Key Controls");
		myButton.setOnAction(event -> behavior());
		this.getChildren().add(myButton);
	}
	
	private void behavior(){
		EventHandler<KeyEvent> keyHandler = new EventHandler<KeyEvent>(){
			
			@Override
			public void handle(KeyEvent event) {
				System.out.println("Key Pressed");
				if(event.getCode() == KeyCode.RIGHT){
					myController.getActiveWorkspace().getCurrentTurtle().rotateRight(5);
				}
				if(event.getCode() == KeyCode.LEFT){
					myController.getActiveWorkspace().getCurrentTurtle().rotateLeft(5);
				}
				if(event.getCode() == KeyCode.UP){
					myController.getActiveWorkspace().getCurrentTurtle().move(5);
				}
				if(event.getCode() == KeyCode.DOWN){
					myController.getActiveWorkspace().getCurrentTurtle().move(-5);
				}
				if(event.getCode() == KeyCode.SPACE){
					if(myController.getActiveWorkspace().getCurrentTurtle().isPenDown()){
						myController.getActiveWorkspace().getCurrentTurtle().penUp();
					}
					else{
						myController.getActiveWorkspace().getCurrentTurtle().penDown();
					}
				}
				myButton.requestFocus();
			}
		};
		myButton.setFocusTraversable(true);
		myButton.requestFocus();
		myButton.addEventHandler(KeyEvent.KEY_PRESSED, keyHandler);
	}

}
