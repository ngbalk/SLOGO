package application;

import java.util.ArrayList;
import java.util.List;
import application.Actions.AbstractAction;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import application.Constants.GUIconstants;
import javafx.scene.Group;

/**
 * Workspace will act as the container for all visual components, including
 * turtles, background, and history. Allows user to easily switch between
 * workspaces.
 * 
 * @author Wesley Valentine
 * @author Nick Balkisoon
 *
 */
public class Workspace {

	private TurtleCollection myCurrentTurtles;
	private SLogoCanvas myCanvas;
	private ObservableList<String> myHistory;
	private Group myRoot;

	public Workspace() {
		myCurrentTurtles = new TurtleCollection();
		myCurrentTurtles.add(new Turtle(GUIconstants.DEFAULT_TURTLE_X_LOCATION,
				GUIconstants.DEFAULT_TURTLE_Y_LOCATION));
		for (Turtle turtle : myCurrentTurtles.getTurtles()) {
			turtle.setImage(GUIconstants.HIGHLIGHTED_TURTLE_IMAGE);
		}
		myCanvas = new SLogoCanvas(GUIconstants.DEFAULT_CANVAS_WIDTH,
				GUIconstants.DEFAULT_CANVAS_HEIGHT);
		myHistory = FXCollections.observableList(new ArrayList<String>());
		myRoot = new Group();
	}

	/**
	 * pass the Workspace the List<AbstractAction> of Actions, and the Workspace
	 * will handle applying these Actions to all currently active Turtles.These
	 * Actions need to take in a Turtle as a parameter and must know how to call
	 * Turtle.move(double distance) and Turtle.rotate(double degrees);
	 * 
	 * @param actionChain
	 *            a List<Action> of Actions which will be applied in succession
	 *            to our current Turtles.
	 */
	public void updateTurtle(List<AbstractAction> actionChain) {
		for (AbstractAction action : actionChain) {
			for (Turtle turtle : myCurrentTurtles.getTurtles()) {
				action.update(turtle, myCanvas);
			}
		}
	}

	/**
	 * This method handles displaying this specific Workspace, pushing it to the
	 * front of the display and making it the current Workspace.
	 * 
	 * @return
	 */
	public Group display() {
		myRoot.getChildren().add(myCanvas.display());
		for (Turtle turtle : myCurrentTurtles.getTurtles()) {
			myCanvas.display().getChildren().add(turtle.display());
		}
		return myRoot;
	}

	/**
	 * This method hides this specific Workspace, pushing it to the back and
	 * make the next Workspace in the Queue the current Workspace.
	 * 
	 * @return
	 */
	public void hide() {
		myRoot.getChildren().clear();
	}

	/**
	 * Returns this workspace's SLogoCanvas for changes to background, reference
	 * grid
	 * 
	 * @return
	 */
	public SLogoCanvas getCanvas() {
		return myCanvas;
	}

	/**
	 * Returns collection of currently active turtles
	 * 
	 * @return
	 */
	public TurtleCollection getCurrentTurtles() {
		return myCurrentTurtles;
	}

	/**
	 * Returns an observable list of previously parsed commands
	 * 
	 * @return
	 */
	public ObservableList<String> getHistory() {
		return myHistory;
	}

	/**
	 * Returns Group to allow visual updates in the workspace
	 * 
	 * @return
	 */
	public Group getRoot() {
		return myRoot;
	}

}