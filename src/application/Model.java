/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 4th, 2014
 *  Modified: October 26th, 2014
 */

package application;

import java.io.*;
import java.util.*;

import application.Actions.AbstractAction;
import application.Constants.GUIconstants;
import application.slogonode.SLogoNode;
import application.slogonode.Number.*;
import application.slogonode.TurtleCommands.*;
import javafx.collections.ObservableList;
import javafx.geometry.Point2D;
import static application.View.myResources;

public class Model {
	private List<Workspace> myWorkspaces;
	private Workspace myActiveWorkspace;
	public Map<String, String> myCommands;
	public Map<String, String> myVariables;
	
	public Model() throws IOException {
		System.out.println("Model Created");
		myActiveWorkspace = new Workspace();
		myWorkspaces =  new ArrayList<Workspace>();
		myVariables = new HashMap<String, String>();
		myVariables.put("slogo", "100");
		System.out.println(myVariables);
		PropertiesFactory factory = new PropertiesFactory();
		
		try {
			myCommands = factory.getCommandsMap(myResources);
			System.out.println("Factory loaded");
			System.out.println(myCommands);
		} catch (Exception e) {
			System.out.println("An Error occured in the loading of the properties File!");
		}
	}
	public List<Workspace> getWorkspaces(){
		return myWorkspaces;
	}
	public Workspace getActiveWorkspace(){
		return myActiveWorkspace;
	}
	public void setActiveWorkspace(Workspace workspace){
		myActiveWorkspace = workspace;
	}
	
	/**
	 * pass parseInput the input string, and parseInput will return a List of
	 * AbstractActions to the View, which the View will handle applying to the
	 * correct AbstractDrawer. List can have NullActions if the input is parsed
	 * to create no Actions.
	 * 
	 * @param inputString
	 * @return
	 */
	
	public List<AbstractAction> parseInput(String inputString) {
		List<AbstractAction> listOfActions = new ArrayList<AbstractAction>();
		List<String> splitList = Arrays.asList(inputString.split("\\s+")); //fixed size
		List<String> inputStringParsedIntoWords = new ArrayList<String>(); //list wrapper which can dynamically change
		inputStringParsedIntoWords.addAll(splitList); //list that we can work with
		SLogoNodeFactory nodeFactory = new SLogoNodeFactory();
		List<SLogoNode> listOfSLogoNodeTrees = new ArrayList<SLogoNode>();
		
		System.out.println("Input String: " + inputString);
		System.out.println("Split input: " + inputStringParsedIntoWords);
		System.out.println("My Commands: " + myCommands);
		if(inputString.isEmpty())
			return listOfActions;
		
		listOfSLogoNodeTrees = makeListOfSLogoNodeTrees(nodeFactory, inputStringParsedIntoWords);
				
		System.out.println("\n\n\n*****List: " + listOfSLogoNodeTrees + "\n\n****");
		for(SLogoNode subTree: listOfSLogoNodeTrees)
			listOfActions.addAll(subTree.evaluate());
		System.out.println("Action List: " + listOfActions);
		return listOfActions;
	}
	
	public List<SLogoNode> makeListOfSLogoNodeTrees(SLogoNodeFactory nodeFactory, List<String> remainingInput) {
		List<SLogoNode> listOfSLogoNodeTrees = new ArrayList<SLogoNode>();
		if (remainingInput.size() > 0) {
			String nextCommand = convertInputToCommandOrVariable(remainingInput.remove(0));
			SLogoNode root = nodeFactory.getSLogoNodeFromString(nextCommand);
			listOfSLogoNodeTrees.add(root);
			SLogoNode currentNode = root;
			if (currentNode.needsMoreChildrenForEvaluation())
				makeListOfSLogoNodeTreesHelper(root,currentNode,nodeFactory,remainingInput);
			listOfSLogoNodeTrees.addAll(makeListOfSLogoNodeTrees(nodeFactory,remainingInput));
		}
		return listOfSLogoNodeTrees;
	}
	public void makeListOfSLogoNodeTreesHelper(SLogoNode root, SLogoNode currentNode, SLogoNodeFactory nodeFactory, List<String> remainingInput) {
		if(currentNode == null || remainingInput.size() <= 0)
			return;
		while (currentNode.needsMoreChildrenForEvaluation() && remainingInput.size() > 0) {
			SLogoNode nodeToBeAdded = null;
			nodeToBeAdded = nodeFactory.getSLogoNodeFromString(convertInputToCommandOrVariable(remainingInput.remove(0)));
			currentNode.addChild(nodeToBeAdded);
			makeListOfSLogoNodeTreesHelper(root, nodeToBeAdded, nodeFactory, remainingInput);				
		}
	}
	
	public String convertInputToCommandOrVariable(String nextCommand) {
		System.out.print("YOYOYO: " + nextCommand);
		if(myCommands.containsKey(nextCommand)){
			System.out.println("YAY! IT CONTAINS THE KEY!");
			System.out.println("Previos: " + nextCommand);
			nextCommand = myCommands.get(nextCommand);
			System.out.println("FINAL: " + nextCommand);
		}
		else if(myVariables.containsKey(nextCommand))
			nextCommand = myVariables.get(nextCommand);
		else
			System.out.println("Nope!"); //TODO: GOTO ERROR PAGE!!
		System.out.println(": " + nextCommand);
		return nextCommand;
	}
	
	/**
	 * Similar to parseInput, but the input String is contained within a File.
	 * Parse accordingly, and and return a List of AbstractActions. We will have
	 * NullActions to represent if the input is parsed and returns a non Action.
	 * 
	 * @param inputFile
	 * @return
	 */
	public List<AbstractAction> parseFile(File inputFile) {
		Scanner myScanner = null;
		String inputString = "";
		try {
			myScanner = new Scanner(inputFile);
			inputString = myScanner.useDelimiter("\\Z").next();
		} catch (FileNotFoundException e) {
			// TODO update this block to not have print stack trace()
			e.printStackTrace();
		} finally {
			if (myScanner != null)
				myScanner.close();
		}
		return parseInput(inputString);
	}

	/**
	 * If a point on the Canvas is clicked, make the Drawer go to this point.
	 * Pass in the start location, the end location, and the starting
	 * orientation and a List of Actions will be returned to correctly complete
	 * this Action.
	 * 
	 * @param action
	 */
	public List<AbstractAction> handleManualDrawerClickEvent(Point2D start,
			double orientation, Point2D end) {
		double difX = end.getX() - start.getX();
		double difY = end.getY() - start.getY();
		double distToMove = Math.sqrt(Math.pow(difX, 2) + Math.pow(difY, 2));
		
		double newOrien = Math.atan(difY/difX);
		
		double changeOrientation = orientation - newOrien; 
		SLogoNode rotNode = new RightNode();
		SLogoNode moveNode = new ForwardNode();
		SLogoNode rotateDegNode = new ConstantNode((int) changeOrientation);
		SLogoNode moveDistNode = new ConstantNode((int) distToMove);
		rotNode.addChild(rotateDegNode);
		moveNode.addChild(moveDistNode);
			
		return null;
	}
}