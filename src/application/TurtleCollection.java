package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import application.Workspace;

import application.Constants.GUIconstants;

public class TurtleCollection implements Iterator<Turtle> {
	private List<Turtle> myTurtles;
	private int index;
	
	public TurtleCollection(){
		myTurtles = new ArrayList<Turtle>();
	}
	
	public List<Turtle> getTurtles(){
		return myTurtles;
	}
	
	public void add(Turtle turtle){
		myTurtles.add(turtle);
		turtle.display().setOnMouseClicked(event -> updateMouseClick(turtle));
	}
	public void updateMouseClick(Turtle turtle) {
		if (myTurtles.contains(turtle)){
			myTurtles.remove(turtle);
			turtle.setImage(GUIconstants.DEFAULT_TURTLE_IMAGE);
			//IMAGE ISNT UPDATING TRY TO FIX THIS
		}else{
			myTurtles.add(turtle);
			turtle.setImage(GUIconstants.HIGHLIGHTED_TURTLE_IMAGE);
		}
	}

	public void remove(Turtle turtle){
		myTurtles.remove(turtle);
	}

	@Override
	public boolean hasNext() {
		return !(myTurtles.size() == index);
	}

	@Override
	public Turtle next() {
		if(hasNext()) {
            return myTurtles.get(index++);
        } else {
            try {
				throw new Exception("There are no elements size = " + myTurtles.size());
			} catch (Exception e) {
				// TODO Write some error here
				return null;
			}
        }
	}
}
