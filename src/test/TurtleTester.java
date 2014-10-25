package test;

import static org.junit.Assert.*;

import org.junit.Test;

import javafx.geometry.Point2D;
import application.Turtle;

public class TurtleTester {

	@Test
	public void testTurtleMove(){
		Turtle turt = new Turtle(0,0);
		turt.move(100);
		assertEquals(new Point2D(100,0), turt.getLocation());
		turt.move(-250);
		assertEquals(new Point2D(-150, 0), turt.getLocation());
	}
	
	
//	@Test 
//	public void testTurtleRotatesRightAndLeft(){
//		Turtle turt = new Turtle(0,0);
//		turt.rotateRight(90);
//		assertEquals(270.0, turt.getOrientation(), 0.001);
//		turt.rotateLeft(180);
//		assertEquals(90.0, turt.getOrientation(), 0.001);
//	}
	
	@Test 
	public void testTurtlePenUp(){
		Turtle turt = new Turtle(0,0);
		assertEquals(true, turt.isPenDown());
		turt.penUp();
		assertEquals(false, turt.isPenDown());
	}
	
}
