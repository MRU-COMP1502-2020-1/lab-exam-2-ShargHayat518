package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class A_ATest {

	@Test
	public void testMatches() 
	{
		char symbol = 'A';
		
		A_A rule = new A_A ();
		char correct = rule.getMatch();
		
		assertEquals(symbol,correct);
	}
	
	@Test
	public void testBodies() 
	{
		char [] symbols = {'A'};
		
		A_A rule = new A_A ();
		char [] correct = rule.getBody();
		
		assertEquals(Arrays.toString(symbols),Arrays.toString(correct));
	}

}
