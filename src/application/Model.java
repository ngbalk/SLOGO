/**
 *  @author Pranava Raparla, Monica Choe
 *  Created: October 4th, 2014
 *  Modified: October 9th, 2014
 */

package application;

import java.io.*;
import java.util.*;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;
import javafx.geometry.Point2D;

public class Model {

	public List<Workspace> workspaces;
	public Map<String, String> myCommands;

	public Model() throws IOException {
		System.out.println("Starting constructor");
		PropertiesFactory factory = new PropertiesFactory();
		System.out.println("Initialized Factory");
		try {
			myCommands = factory
					.getPropertyValues("resources/languages/English.properties");
			// loadCommandsbyLanguage("Chinese.properties");
			System.out.println("Factory loaded");
			System.out.println(myCommands);
		} catch (Exception e) {
			System.out.println("An Error occured in the loading of the properties File!");
		}
	}

	public void loadCommandsbyLanguage(String fileName) {
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
					String keyword = myScanner.next();
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
		List<SLogoNode> listOfNodes = new ArrayList<SLogoNode>();
		String[] inputStringArray = inputString.split("//s+");
		SLogoNodeFactory nodeFactory = new SLogoNodeFactory();

		if (inputString.isEmpty())
			return listOfActions;

		for (String str : inputStringArray) {
			SLogoNode node = nodeFactory.getSLogoNodeFromString(str);
			listOfNodes.add(node);
		}

		for (int i = 0; i < listOfNodes.size(); i++) {
			listOfNodes.get(i).addChild(listOfNodes.get(i + 1));
		}

		return listOfActions;
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
			// TODO Auto-generated catch block
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
	public void storeWorkspace(Workspace workspace) {
		for (Workspace wk : workspaces)
			if (wk.equals(workspace))
				return;
			else
				workspaces.add(workspace);
	}

	/**
	 * Change the language the the back-end parser for parsing.
	 * 
	 * @param language
	 */
	public void setLanguage(String language) {

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
		return null;

	}

}