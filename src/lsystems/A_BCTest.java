package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class A_BCTest {

	@Test
	public void testMatches() 
	{
		char symbol = 'A';
		
		A_BC rule = new A_BC ();
		char correct = rule.getMatch();
		
		assertEquals(symbol,correct);
	}
	
	@Test
	public void testBodies() 
	{
		char [] symbols = {'B','C'};
		
		A_BC rule = new A_BC ();
		char [] correct = rule.getBody();
		
		assertEquals(Arrays.toString(symbols),Arrays.toString(correct));
	}

}