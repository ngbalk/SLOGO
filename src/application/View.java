package application;

import java.util.List;



public class View {

	public View() {
		// TODO Auto-generated constructor stub
	}
	
	
	/**
	 * Pass in a List of Actions, which the API will apply to the current Turtle.  These Actions need to take in a Turtle
	 * as a parameter and must know how to call Turtle.move(double distance) and Turtle.rotate(double degrees);
	 * @param actionChain a List<Action> of Actions which will be applied in succession to our current Turtle.
	 *
	 */
	public void updateTurtle(List<Action> actionChain){
		
	}
	/**
	 * Call displayErrors(String errorString) in order to tell the View to display an error to the user.  The model can use
	 * this method in its error handling process, calling this part of the API and allow the View to handle displaying errors 
	 * nicely to the user.
	 * @param errorString
	 */
	public void displayError(String errorString){
		
	}

}


