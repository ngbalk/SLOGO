package application;

import java.util.*;

public abstract class AbstractModel {
	
	/**
	 * 
	 * @param inputString
	 * @return
	 */
	public abstract List<Action> parseInput(String inputString);
	
	/**
	 * 
	 * @param inputFile
	 * @return
	 */
	public abstract List<Action> parseFile(File inputFile);
	
	/**
	 * 
	 * @param commands
	 */
	public abstract void storeCommands(String commands);
	
	/**
	 * 
	 * @param workspace
	 */
	public abstract void storeWorkspace(Workspace workspace);
	
	/**
	 * 
	 * @return
	 */
	public abstract Object getCommandHelpPage();
	
	/**
	 * 
	 * @param language
	 */
	public abstract void setLanguage(String language);
	
	/**
	 * 
	 * @param action
	 */
	public abstract void appendAction(Action action);

}
