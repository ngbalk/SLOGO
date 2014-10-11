package application;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import application.Actions.AbstractAction;
import application.Constants.UI;
import javafx.geometry.Point2D;
import javafx.scene.Group;

public class Workspace {
	
	Turtle myCurrentTurtle;
	SLogoCanvas myCanvas;
	List<AbstractAction> myHistory;
	Map myCommands;
	Group myRoot;

	public Workspace(int width, int height) {
		myCurrentTurtle = new Turtle(width/2, height/2);
		myCurrentTurtle.setImage(UI.DEFUALT_TURTLE_IMAGE);
		myCanvas = new SLogoCanvas(width, height);
		myHistory = new ArrayList<AbstractAction>();
		myRoot = new Group();
	}
	/**
	 * pass the Workspace the List<Action> of Actions, and the Workspace will handle applying these Actions to the member
	 * Turtle.These Actions need to take in a Turtle as a parameter and must know how to call Turtle.move(double distance) 
	 * and Turtle.rotate(double degrees);
	 * @param actionChain a List<Action> of Actions which will be applied in succession to our current Turtle.
	 */
	public void updateTurtle(List<AbstractAction> actionChain){
		for (AbstractAction action : actionChain){
			action.update(myCurrentTurtle, myCanvas);
			myHistory.add(action);
		}
	}
	/**
	 * This method handles displaying this specific Workspace, pushing it to the front of the display and making it the current 
	 * Workspace.
	 * @return
	 */
	public Group display(){
		myRoot.getChildren().add(myCurrentTurtle.display());
		myRoot.getChildren().add(myCanvas.display());
		return myRoot;
	}
	/**
	 * This method hides this specific Workspace, pushing it to the back and make the next Workspace in the Queue the current 
	 * Workspace.
	 * @return
	 */
	public void hide(){
		myRoot.getChildren().clear();
	}

}