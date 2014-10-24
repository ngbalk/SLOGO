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
		SLogoNode childC = new ConstantNode(2);
		node.addChild(childA);
		node.addChild(childB); 
		node.addChild(childC);
		assertEquals(3.0, node.evaluate().get(0).getValue(), 0.0);
		
	}
	@Test
	public void testLogNode(){
		SLogoNode node = new LogNode();
		SLogoNode childA = new ConstantNode(10);
		node.addChild(childA);
		assertEquals(Math.log(10), node.evaluate().get(0).getValue(), 0.0);
		
	}
	
	@Test
	public void testMinusNode(){
		SLogoNode node = new MinusNode();
		SLogoNode childA = new ConstantNode(10);
		node.addChild(childA);
		assertEquals(-10.0, node.evaluate().get(0).getValue(), 0.0);
	}
	
	@Test
	public void testPowNode(){
		SLogoNode node = new PowNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(2);
		node.addChild(childA);
		node.addChild(childB);
		assertEquals(100.0, node.evaluate().get(0).getValue(), 0.0);
	}
	
	@Test
	public void testProductNode(){
		SLogoNode node = new ProductNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(2);
		SLogoNode childC = new ConstantNode(7);
		node.addChild(childA);
		node.addChild(childB);
		node.addChild(childC);
		assertEquals(140.0, node.evaluate().get(0).getValue(), 0.0);
	}
	
	@Test
	public void testQuotientNode(){
		SLogoNode node = new QuotientNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(2);
		node.addChild(childA);
		node.addChild(childB);
		assertEquals(5.0, node.evaluate().get(0).getValue(), 0.0);	
	}
	
	@Test
	public void testRandomNode(){
		SLogoNode node = new RandomNode();
		SLogoNode childA = new ConstantNode(10);
		node.addChild(childA);
		assertEquals(true, node.evaluate().get(0).getValue() < 10);
	}
	
	@Test
	public void testRemainderNode(){
		SLogoNode node = new RemainderNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(3);
		node.addChild(childA);
		node.addChild(childB);
		assertEquals(1.0, node.evaluate().get(0).getValue(), 0.0);
	}
	
	@Test
	public void testSinNode(){
		SLogoNode node = new SinNode();
		SLogoNode childA = new ConstantNode(10);
		node.addChild(childA);
		assertEquals(Math.sin(10.0), node.evaluate().get(0).getValue(), 0.0);
	}
	
	@Test
	public void testSumNode(){
		SLogoNode node = new SumNode();
		SLogoNode childA = new ConstantNode(10);
		SLogoNode childB = new ConstantNode(5);
		SLogoNode childC = new ConstantNode(-3);
		node.addChild(childA);
		node.addChild(childB);
		node.addChild(childC);
		assertEquals(12.0, node.evaluate().get(0).getValue(), 0.0);
	}
	
	@Test
	public void testTanNode(){
		SLogoNode node = new TanNode();
		SLogoNode childA = new ConstantNode(10);
		node.addChild(childA);
		assertEquals(Math.tan(10.0), node.evaluate().get(0).getValue(), 0.0);
	}
}
