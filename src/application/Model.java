/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 4th, 2014
 *  Modified: October 23rd, 2014
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
	private List<Workspace> myWorkspaces =  new ArrayList<Workspace>();;
	private Workspace myActiveWorkspace = new Workspace();

	public Map<String, String> myCommands;
	public Model() throws IOException {
		System.out.println("Starting constructor");
		PropertiesFactory factory = new PropertiesFactory();
		System.out.println("Initialized Factory");
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
	
	// TODO: deprecated, must delete
	public void loadCommandsbyLanguage2(String fileName) {
		Properties languageProperties = new Properties();
		Scanner myScanner = null;
		try {
			System.out.println("Loading another language");
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
			languageProperties.load(inputStream);
			myScanner = new Scanner(new File(fileName));
			System.out.println(myScanner);
			while (myScanner.hasNextLine()) {
				String str = myScanner.nextLine();
				System.out.println("Current string: " + str);
				if (str.substring(0, 1).equalsIgnoreCase("#"))
					continue;
				else if (str.startsWith("\\s+"))
					continue;
				else {
					System.out.println("Adding?");
					String keyword = myScanner.next() + "Node";
					String equalsSign = myScanner.next();
					String commandReference1 = myScanner.next();
					String commandReference2 = myScanner.next();
					myCommands.put(commandReference1, keyword);
					myCommands.put(commandReference2, keyword);
				}
			}
			System.out.println("Done loading new language");
		} catch (Exception e) {
			System.out.println("Error occured in loading a new language");
		} finally {
			if (myScanner != null)
				myScanner.close();
		}
	}

	
	// TODO: deprecated, must delete
	public void loadCommandsbyLanguage3(String fileName) {
		Properties languageProperties = new Properties();
		Scanner myScanner = null;
		try {
			System.out.println("Loading another language");
			InputStream inputStream = getClass().getClassLoader().getResourceAsStream(fileName);
			languageProperties.load(inputStream);
			myScanner = new Scanner(new File(fileName));
			System.out.println(myScanner);
			while (myScanner.hasNextLine()) {
				String str = myScanner.nextLine();
				System.out.println("Current string: " + str);
				if (str.substring(0, 1).equalsIgnoreCase("#"))
					continue;
				else if (str.startsWith("//s+"))
					continue;
				else {
					System.out.println("Adding?");
					String keyword = myScanner.next() + "Node";
					String equalsSign = myScanner.next();
					String commandReference1 = myScanner.next();
					String commandReference2 = myScanner.next();
					myCommands.put(commandReference1, keyword);
					myCommands.put(commandReference2, keyword);
				}
			}
			System.out.println("Done loading new language");
		} catch (Exception e) {
			System.out.println("Error occured in loading a new language");
		} finally {
			if (myScanner != null)
				myScanner.close();
		}
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
			String nextCommand = myCommands.get(remainingInput.remove(0));
			SLogoNode root = nodeFactory.getSLogoNodeFromString(nextCommand,myResources);
			listOfSLogoNodeTrees.add(root);
			SLogoNode currentNode = root;
			if (nextCommand.substring(0).equals("[")){
				System.out.println("Hit begining of list of inputs");
				makeTreeGivenList(remainingInput, nodeFactory, currentNode, root);
			}
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
			if(remainingInput.size() > 0)
				nodeToBeAdded = nodeFactory.getSLogoNodeFromString(remainingInput.remove(0), myResources);
			else break;
			currentNode.addChild(nodeToBeAdded);
			makeListOfSLogoNodeTreesHelper(root, nodeToBeAdded, nodeFactory, remainingInput);				
		}
	}

	public void makeTreeGivenList(List<String> remainingInput, SLogoNodeFactory nodeFactory, SLogoNode currentNode, SLogoNode root){
		
	}
	
	// TODO: deprecated, must delete
//	public List<AbstractAction> parseInput2(String inputString) {
//		List<AbstractAction> listOfActions = new ArrayList<AbstractAction>();
//		SLogoNode root = null;
//		String[] inputStringArray = inputString.split("\\s+");
//		SLogoNodeFactory nodeFactory = new SLogoNodeFactory();
//		
//		System.out.println("Input String: " + inputString);
//		System.out.println("Split input: " + inputStringArray);
//		System.out.println("My Commands: " + myCommands);
//		if(inputString.isEmpty())
//			return listOfActions;
//
//		for(String str : inputStringArray) {
//			System.out.println("\tSTR: " + str);
//			String command = myCommands.get(str);
//			SLogoNode node = null;
//			if(command == null)
//				node = nodeFactory.getSLogoNodeFromString(str);
//			else
//				node = nodeFactory.getSLogoNodeFromString(command);
//			
//			System.out.println("Node: " + node);
//			if(root == null)
//				root = node;
//			else
//				root.addChild(node);
//			
//			node.setActionList(listOfActions);
//		}
//		
//		System.out.println("Root: " + root);
//		int result = root.evaluate();
//		System.out.println("Action List: " + listOfActions);
//		return listOfActions;
//	}

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
	 * Pass in a workspace and store it in the Model
	 * 
	 * @param workspace
	 */

//	public void storeWorkspace(Workspace workspace) {
//		for (Workspace wk : workspaces)
//			if (wk.equals(workspace))
//				return;
//			else
//				workspaces.add(workspace);
//	}


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
		List<AbstractAction> actionsList = new ArrayList<AbstractAction>();
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