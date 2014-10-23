/**
 *  @author Pranava Raparla
 *  @author Monica Choe
 *  Created: October 9th, 2014
 *  Modified: October 11th, 2014
 */
package application;

import java.io.*;
import java.util.*;

import application.slogonode.*;
import application.slogonode.BooleanOperations.*;
import application.slogonode.ControlStructures.*;
import application.slogonode.MathOperations.*;
import application.slogonode.Number.*;
import application.slogonode.TurtleCommands.*;
import application.slogonode.TurtleQueries.*;
import application.slogonode.Variables.*;

public class SLogoNodeFactory {

	/**
	 * 
	 * @param nodeName
	 * @return
	 */
	
	public SLogoNode getSLogoNodeFromString(String nodeName, ResourceBundle myResources) {
		SLogoNode commandNode = null;
		try {
			commandNode = (SLogoNode) Class.forName(nodeName+"Node").newInstance();
		} catch (Exception e) {
			
		} finally {
			if (commandNode == null)
				commandNode = new ForwardNode();
		}
		return commandNode;
	}
	
	// TODO: deprecated class, delete this one
	public SLogoNode getSLogoNodeFromString(String nodeName) {
		SLogoNode myNode = null;
		try {
			int value = Integer.parseInt(nodeName);
			myNode = new ConstantNode(value);
		}
		catch (Exception e) {
			try {
				if (nodeName.equalsIgnoreCase("Forward"))
					myNode = new ForwardNode();
				else if (nodeName.equalsIgnoreCase("Backward"))
					myNode = new BackwardNode();
				else if (nodeName.equalsIgnoreCase("Left"))
					myNode = new LeftNode();
				else if (nodeName.equalsIgnoreCase("Right"))
					myNode = new RightNode();
	/*			else if (nodeName.equalsIgnoreCase("SetHeading"))
					myNode = new SetHeadingNode();
				else if (nodeName.equalsIgnoreCase("SetTowards"))
					myNode = new SetTowardsNode();
				else if (nodeName.equalsIgnoreCase("SetPosition"))
					myNode = new SetPositionNode();
				else if (nodeName.equalsIgnoreCase("PenDown"))
					myNode = new SetPenDownNode();
				else if (nodeName.equalsIgnoreCase("PenUp"))
					myNode = new SetPenUpsNode();
				else if (nodeName.equalsIgnoreCase("ShowTurtle"))
					myNode = new ShowTurtleNode();
				else if (nodeName.equalsIgnoreCase("HideTurtle"))
					myNode = new HideTurtleNode();
				else if (nodeName.equalsIgnoreCase("Home"))
					myNode = new HomeNode();
				else if (nodeName.equalsIgnoreCase("ClearScreen"))
					myNode = new ClearScreenNode();
				else if (nodeName.equalsIgnoreCase("XCoordinate"))
					myNode = new XCoordinateNode();
				else if (nodeName.equalsIgnoreCase("YCoordinate"))
					myNode = new YCoordinateNode();
				else if (nodeName.equalsIgnoreCase("Heading"))
					myNode = new HeadingNode();
				else if (nodeName.equalsIgnoreCase("IsPenDown"))
					myNode = new IsPenDownNode();
				else if (nodeName.equalsIgnoreCase("IsShowing"))
					myNode = new IsShowingNode();
				else if (nodeName.equalsIgnoreCase("Sum"))
					myNode = new SumNode();
				else if (nodeName.equalsIgnoreCase("Difference"))
					myNode = new DifferenceNode();
				else if (nodeName.equalsIgnoreCase("Product"))
					myNode = new ProductNode();
				else if (nodeName.equalsIgnoreCase("Quotient"))
					myNode = new QuotientNode();
				else if (nodeName.equalsIgnoreCase("Remainder"))
					myNode = new RemainderNode();
				else if (nodeName.equalsIgnoreCase("Minus"))
					myNode = new MinusNode();
				else if (nodeName.equalsIgnoreCase("Random"))
					myNode = new RandomNode();
				else if (nodeName.equalsIgnoreCase("Sine"))
					myNode = new SinNode();
				else if (nodeName.equalsIgnoreCase("Cosine"))
					myNode = new CosNode();
				else if (nodeName.equalsIgnoreCase("Tangent"))
					myNode = new TanNode();
				else if (nodeName.equalsIgnoreCase("ArcTangent"))
					myNode = new AtanNode();
				else if (nodeName.equalsIgnoreCase("NaturalLog"))
					myNode = new LogNode();
				else if (nodeName.equalsIgnoreCase("Power"))
					myNode = new PowNode();
				else if (nodeName.equalsIgnoreCase("LessThan"))
					myNode = new LessThanNode();
				else if (nodeName.equalsIgnoreCase("GreaterThan"))
					myNode = new GreaterThanNode();
				else if (nodeName.equalsIgnoreCase("Equal"))
					myNode = new EqualToNode();
				else if (nodeName.equalsIgnoreCase("NotEqual"))
					myNode = new NotEqualToNode();
				else if (nodeName.equalsIgnoreCase("And"))
					myNode = new AndNode();
				else if (nodeName.equalsIgnoreCase("Or"))
					myNode = new OrNode();
				else if (nodeName.equalsIgnoreCase("Not"))
					myNode = new NotNode();
				else if (nodeName.equalsIgnoreCase("MakeVariable"))
					myNode = new MakeVariableNode();
				else if (nodeName.equalsIgnoreCase("Repeat"))
					myNode = new RepeatNode();
				else if (nodeName.equalsIgnoreCase("DoTimes"))
					myNode = new DoTimesNode();
				else if (nodeName.equalsIgnoreCase("For"))
					myNode = new ForNode();
				else if (nodeName.equalsIgnoreCase("If"))
					myNode = new IfNode();
				else if (nodeName.equalsIgnoreCase("IfElse"))
					myNode = new IfElseNode();
				else if (nodeName.equalsIgnoreCase("MakeUserInstruction"))
					myNode = new MakeUserInstructionNode();
				else if (nodeName.equalsIgnoreCase("SetBackground"))
					myNode = new SetBackgroundNode();
				else if (nodeName.equalsIgnoreCase("SetPenColor"))
					myNode = new SetPenColorNode();
				else if (nodeName.equalsIgnoreCase("SetPenSize"))
					myNode = new SetPenSizeNode();
				else if (nodeName.equalsIgnoreCase("SetShape"))
					myNode = new SetShapeNode();
				else if (nodeName.equalsIgnoreCase("SetPalette"))
					myNode = new SetPaletteNode();
				else if (nodeName.equalsIgnoreCase("GetPenColor"))
					myNode = new GetPenColorNode();
				else if (nodeName.equalsIgnoreCase("GetShape"))
					myNode = new GetShapeNode();
				else if (nodeName.equalsIgnoreCase("Stamp"))
					myNode = new StampNode();
				else if (nodeName.equalsIgnoreCase("ClearStamps"))
					myNode = new ClearStampsNode();
				else if (nodeName.equalsIgnoreCase("ID"))
					myNode = new IDNode();
				else if (nodeName.equalsIgnoreCase("Tell"))
					myNode = new TellNode();
				else if (nodeName.equalsIgnoreCase("Ask"))
					myNode = new AskNode();
				else if (nodeName.equalsIgnoreCase("AskWith"))
					myNode = new AskWithNode();
				else if (nodeName.equalsIgnoreCase("Comment"))
					myNode = new CommentNode();
				else if (nodeName.equalsIgnoreCase("Constant"))
					myNode = new ConstantNode();
				else if (nodeName.equalsIgnoreCase("Variable"))
					myNode = new VariableNode();
				else if (nodeName.equalsIgnoreCase("Command"))
					myNode = new CommandNode();
				else if (nodeName.equalsIgnoreCase("ListStart"))
					myNode = new ListStartNode();
				else if (nodeName.equalsIgnoreCase("ListEnd"))
					myNode = new ListEndNode();
				else if (nodeName.equalsIgnoreCase("GroupStart"))
					myNode = new GroupStartNode();
				else if (nodeName.equalsIgnoreCase("GroupEnd"))
					myNode = new GroupEndNode();
	*/			else
					myNode = new ForwardNode();
			} catch (Exception exc) {
	
			}
		}
		
		return myNode;
	}

}
