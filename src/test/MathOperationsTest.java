package test;

import static org.junit.Assert.*;

import org.junit.Test;

import application.slogonode.SLogoNode;
import application.slogonode.MathOperations.*;
import application.slogonode.Number.ConstantNode;

public class MathOperationsTest {

	@Test
	public void testAtanNode(){
		SLogoNode node = new AtanNode();
		SLogoNode childA = new ConstantNode(5); 
		node.addChild(childA);
		assertEquals(Math.atan(5), node.evaluate().get(0).getValue(), 0.0);
	}
	
	@Test
	public void testCosNode(){
		SLogoNode node = new CosNode();
		SLogoNode childA = new ConstantNode(10);
		node.addChild(childA);
		assertEquals(Math.cos(10), node.evaluate().get(0).getValue(), 0.0);
	}
	
	@Test
	public void testDifferenceNode(){
		SLogoNode node = new DifferenceNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(5); 
		node.addChild(childA);
		node.addChild(childB); 
		assertEquals(5.0, node.evaluate().get(0).getValue(), 0.0);
		
	}
	@Test
	public void testLogNode(){
		SLogoNode node = new LogNode();
		SLogoNode childA = new ConstantNode(10);
		node.addChild(childA);
		assertEquals(Math.log(10), node.evaluate().get(0).getValue(), 0.0);
		
	}
}
