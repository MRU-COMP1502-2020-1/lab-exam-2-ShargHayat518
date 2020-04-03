package lsystems;

import static org.junit.Assert.*;

import java.util.Arrays;

import org.junit.Test;

public class C_BTest {

	@Test
	public void testMatches() 
	{
		char symbol = 'C';
		
		C_B rule = new C_B ();
		char correct = rule.getMatch();
		
		assertEquals(symbol,correct);
	}
	
	@Test
	public void testBodies() 
	{
		char [] symbols = {'B'};
		
		C_B rule = new C_B ();
		char [] correct = rule.getBody();
		
		assertEquals(Arrays.toString(symbols),Arrays.toString(correct));
	}

}
