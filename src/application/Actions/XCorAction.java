package application.Actions;

import javafx.geometry.Point2D;
import application.SLogoCanvas;
import application.Turtle;

public class XCorAction extends Action{

	public XCorAction(){
		myValue = 0; 
		myName = "XCor";
	}
	
	@Override
	public void update(Turtle turtle, SLogoCanvas canvas){
		Point2D location = turtle.getLocation();
		myValue = location.getX();
	}
}
