package test;

import static org.junit.Assert.*;
import javafx.scene.canvas.Canvas;

import org.junit.Test;

import application.SLogoCanvas;
import application.Turtle;
import application.Actions.LeftAction;
import application.Actions.RightAction;

public class ActionTest {
	
	@Test
	public void testRtAction(){
		SLogoCanvas c = new SLogoCanvas(100,100);
		Turtle turt = new Turtle(0,0);
		RightAction rt = new RightAction(90);
		rt.update(turt, c);
		assertEquals(270.0, turt.getOrientation(), 0.001);
		assertEquals(180, turt.display().getRotate(), 0.001);
	}
	
	@Test
	public void testLftAction(){
		SLogoCanvas c = new SLogoCanvas(100,100);
		Turtle turt = new Turtle(0,0);
		LeftAction lft = new LeftAction(90);
		lft.update(turt, c);
		assertEquals(90.0, turt.getOrientation(), 0.001);
		assertEquals(0.0, turt.display().getRotate(), 0.001);
	}
}
