package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import application.Constants.GUIconstants;

/**
 * Stores a collection of single turtles. (Attempted) Iterator object.
 * 
 * @author Wesley Valentine
 * 
 */

public class TurtleCollection implements Iterator<Turtle> {
	private List<Turtle> myTurtles;
	private int index;

	public TurtleCollection() {
		myTurtles = new ArrayList<Turtle>();
	}

	/**
	 * Return list of stored turtles.
	 * 
	 * @return
	 */
	public List<Turtle> getTurtles() {
		return myTurtles;
	}

	/**
	 * Add a new turtle to the list of stored turtles.
	 * 
	 * @param turtle
	 *            added turtle is given actionEvent to allow removal/addition to
	 *            active turtles via mouse click
	 */
	public void add(Turtle turtle) {
		myTurtles.add(turtle);
		turtle.display().setOnMouseClicked(event -> updateMouseClick(turtle));
	}

	/**
	 * Add/remove a turtle from this list by clicking on it
	 * 
	 * @param turtle
	 */
	public void updateMouseClick(Turtle turtle) {
		if (myTurtles.contains(turtle)) {
			myTurtles.remove(turtle);
			turtle.setImage(GUIconstants.DEFAULT_TURTLE_IMAGE);
		} else {
			myTurtles.add(turtle);
			turtle.setImage(GUIconstants.HIGHLIGHTED_TURTLE_IMAGE);
		}
	}

	/**
	 * Remove specified turtle from this collection.
	 * 
	 * @param turtle
	 */
	public void remove(Turtle turtle) {
		myTurtles.remove(turtle);
	}

	/**
	 * Check if collection has another turtle.
	 */
	@Override
	public boolean hasNext() {
		return !(myTurtles.size() == index);
	}

	/**
	 * Iterate to next turtle in collection.
	 */
	@Override
	public Turtle next() {
		if (hasNext()) {
			return myTurtles.get(index++);
		} else {
			try {
				throw new Exception("There are no elements size = "
						+ myTurtles.size());
			} catch (Exception e) {
				// TODO Write some exception here
				return null;
			}
		}
	}
}
