package test;

import static application.View.myResources;
import static org.junit.Assert.assertEquals;

import java.util.*;

import org.junit.Test;

import application.PropertiesFactory;
import application.slogonode.SLogoNode;
import application.slogonode.MathOperations.AtanNode;
import application.slogonode.Number.ConstantNode;

public class CommandsTest {

	
	@Test
	public void testCommandsMap(){
		PropertiesFactory factory = new PropertiesFactory();
		Map<String,String> myCommands = new HashMap<String,String>();
		myCommands = factory.getCommandsMap(myResources);
		myCommands.put("slogo", "100");
		
		System.out.println(myCommands);
		assertEquals("100","100");
	}


}
