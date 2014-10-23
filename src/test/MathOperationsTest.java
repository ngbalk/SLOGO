package test;

import static org.junit.Assert.*;

import org.junit.Test;

import application.slogonode.SLogoNode;
import application.slogonode.MathOperations.AtanNode;
import application.slogonode.MathOperations.CosNode;
import application.slogonode.Number.ConstantNode;

public class MathOperationsTest {

	@Test
	public void testAtanNode(){
		SLogoNode node = new AtanNode();
		SLogoNode integer = new ConstantNode(5); 
		node.addChild(integer);
		assertEquals(Math.atan(5), node.evaluate());
	}
	
	@Test
	public void testCosNode(){
		SLogoNode cosNode = new CosNode();
		SLogoNode integer = new ConstantNode(10);
		cosNode.addChild(integer);
		assertEquals(Math.cos(10), cosNode.evaluate());
	}
	
	@Test
	public void testDifferenceNode(){
		
	}
	@Test
	public void testLogNode(){
		
	}
}
