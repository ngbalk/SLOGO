/**
 *  @author Pranava Raparla
 *  Created: October 4th, 2014
 *  Modified: October 4th, 2014
 */

package application;

import java.io.*;
import java.nio.file.Files;
import java.util.*;

import javafx.geometry.Point2D;



public class Model {
	
	public Model(){
		
	}
	
	/**
	 * pass parseInput the input string, and parseInput will return a List of AbstractActions to the View, which the
	 * View will handle applying to the correct AbstractDrawer. List can have NullActions if the input is parsed 
	 * to create no Actions. 
	 * @param inputString
	 * @return
	 */
	
	public List<AbstractAction> parseInput(String inputString){
		List<AbstractAction> listOfActions = new ArrayList<AbstractAction>();
		String[] inputStringArray = inputString.split("//s+");
		
		for(String str: inputStringArray) {
			
		}
		
		return listOfActions;
	}
	
	/**
	 * Similar to parseInput, but the input String is contained within a File.  Parse accordingly, and and return a List of AbstractActions.
	 * We will have NullActions to represent if the input is parsed and returns a non Action.
	 * @param inputFile
	 * @return
	 */
	public List<AbstractAction> parseFile(File inputFile){
		Scanner myScanner;
		String inputString = "";
		try {
			myScanner = new Scanner(inputFile);
			inputString = myScanner.useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(myScanner != null)
				myScanner.close();
		}
		return parseInput(inputString);
	}
	
	
	/**
	 * Pass in a workspace and store it in the Model
	 * @param workspace
	 */
	public void storeWorkspace(Workspace workspace){
		
	}
	
	/**
	 * Change the language the the back-end parser for parsing.
	 * @param language
	 */
	public void setLanguage(String language){
		
	}
	
	/**
	 * If a point on the Canvas is clicked, make the Drawer go to this point.  Pass in the start location, the end location,
	 * and the starting orientation and a List of Actions will be returned to correctly complete this Action.
	 * @param action
	 */
	public List<AbstractAction> handleManualDrawerClickEvent(Point2D start, double orientation, Point2D end){
		return null;
		
	}

}