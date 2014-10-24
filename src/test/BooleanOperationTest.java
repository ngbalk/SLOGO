package test;

import static org.junit.Assert.*;

import org.junit.Test;

import application.slogonode.*;
import application.slogonode.BooleanOperations.*;
import application.slogonode.Number.*;

public class BooleanOperationTest {

	@Test
	public void testAndNode(){
		SLogoNode node = new AndNode();
		SLogoNode childA = new ConstantNode(1);
		SLogoNode childB = new ConstantNode(0);
		
		node.addChild(childA);
		node.addChild(childB);
		assertEquals(0.0, node.evaluate().get(0).getValue(), 0.0);
	}
	
	@Test
	public void testEqualToNode(){
		SLogoNode node = new EqualToNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(5);
		
		node.addChild(childA);
		node.addChild(childB);
		assertEquals(0.0, node.evaluate().get(0).getValue(), 0.0); 
	}
	
	@Test
	public void testGreaterThanNode(){
		SLogoNode node = new GreaterThanNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(5);
		
		node.addChild(childA);
		node.addChild(childB);
		assertEquals(1.0, node.evaluate().get(0).getValue(), 0.0); 
	}
	
	@Test 
	public void testLessThanNode(){
		SLogoNode node = new LessThanNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(5);
		
		node.addChild(childA);
		node.addChild(childB);
		assertEquals(0.0, node.evaluate().get(0).getValue(), 0.0); 
	}
	
	@Test
	public void testNotEqualToNode(){
		SLogoNode node = new NotEqualToNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(5);
		
		node.addChild(childA);
		node.addChild(childB);
		assertEquals(1.0, node.evaluate().get(0).getValue(), 0.0); 
	}
	
	@Test
	public void testNotNode(){
		SLogoNode nodeA = new NotNode();
		SLogoNode childA = new ConstantNode(1);
		nodeA.addChild(childA);
		
		SLogoNode nodeB = new NotNode();
		SLogoNode childB = new ConstantNode(0);
		nodeB.addChild(childB);
		
		assertEquals(0.0, nodeA.evaluate().get(0).getValue(), 0.0); 
		assertEquals(1.0, nodeB.evaluate().get(0).getValue(), 0.0);
		
	}
	
	@Test
	public void testOrNode(){
		SLogoNode node = new OrNode();
		SLogoNode childA = new ConstantNode(0);
		SLogoNode childB = new ConstantNode(1);
		
		node.addChild(childA);
		node.addChild(childB);
		assertEquals(1.0, node.evaluate().get(0).getValue(), 0.0); 
	}
}
