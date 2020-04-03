package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class A_AATest {

	@Test
	public void testMatches() 
	{
		char symbol = 'A';
		
		A_AA rule = new A_AA ();
		char correct = rule.getMatch();
		
		assertEquals(symbol,correct);
	}
	
	@Test
	public void testBodies() 
	{
		char [] symbols = {'A','A'};
		
		A_AA rule = new A_AA ();
		char [] correct = rule.getBody();
		
		assertEquals(Arrays.toString(symbols),Arrays.toString(correct));
	}

}