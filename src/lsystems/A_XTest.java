package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class A_XTest {

	@Test
	public void testMatches() 
	{
		char symbol = 'A';
		
		A_X rule = new A_X ();
		char correct = rule.getMatch();
		
		assertEquals(symbol,correct);
	}
	
	@Test
	public void testBodies() 
	{
		char [] symbols = new char [0];
		
		A_X rule = new A_X ();
		char [] correct = rule.getBody();
		
		assertEquals(Arrays.toString(symbols),Arrays.toString(correct));
	}

}