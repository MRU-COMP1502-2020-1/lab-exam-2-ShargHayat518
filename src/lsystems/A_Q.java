package lsystems;

public class A_Q extends LRule
{
	
	//Declare Variables
	
	private final char input = 'A';
	private final char[] output = {'Q'};
	
	public char getMatch()
	{
		return input;
	}
	
	public char[] getBody()
	{
		return output;
	}
}
