package application.slogonode.ControlStructures;

import java.util.ArrayList;
import java.util.List;

import application.Actions.AbstractAction;
import application.slogonode.SLogoNode;

public class ForNode extends ControlStructuresNode{
	
	public ForNode() {
		super();
		myCommand = "For";
		myMaxPossibleChildren = 2;
	}
	
	@Override
	public List<AbstractAction> evaluate(){
		SLogoNode information = myChildren.get(0);
		SLogoNode child = myChildren.get(1);
		double start = information.getChildren().get(0).evaluate().get(0).getValue();
		double end = information.getChildren().get(1).evaluate().get(0).getValue();
		double step = information.getChildren().get(2).evaluate().get(0).getValue();
		System.out.println(child.evaluate());
		for (double i = start; i < end ; i += step){
			myActions.addAll(child.evaluate());
			
		}


		
		return myActions;
	}
}
