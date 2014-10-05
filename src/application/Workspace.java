package application;

import java.util.List;

import javafx.scene.Group;

public class Workspace {

	public Workspace() {
		// TODO Auto-generated constructor stub
	}
	/**
	 * pass the Workspace the List<Action> of Actions, and the Workspace will handle applying these Actions to the member
	 * Turtle.These Actions need to take in a Turtle as a parameter and must know how to call Turtle.move(double distance) 
	 * and Turtle.rotate(double degrees);
	 * @param actionChain a List<Action> of Actions which will be applied in succession to our current Turtle.
	 */
	public void updateTurtle(List<AbstractAction> actionChain){
		
	}
	/**
	 * This method handles displaying this specific Workspace, pushing it to the front of the display and making it the current 
	 * Workspace.
	 * @return
	 */
	public Group display(){
		return new Group();
	}
	/**
	 * This method hides this specific Workspace, pushing it to the back and make the next Workspace in the Queue the current 
	 * Workspace.
	 * @return
	 */
	public void hide(){
		
	}

}