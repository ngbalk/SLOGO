package application;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

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
