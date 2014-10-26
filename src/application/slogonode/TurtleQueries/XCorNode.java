package application.slogonode.TurtleQueries;

import java.util.*;
import application.Actions.*;

public class XCorNode extends TurtleQueriesNode{
	
	public XCorNode(){
		super();
		myCommand = "XCor"; 
	}

	@Override
	public List<AbstractAction> evaluate() {
		List<AbstractAction> actionList = new ArrayList<AbstractAction>();
		AbstractAction action = new XCorAction();
		actionList.add(action);
		return actionList;
	}
}
