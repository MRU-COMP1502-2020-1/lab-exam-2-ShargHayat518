package lsystems;

public class A_X extends LRule
{
	
	//Declare Variables
	
	private final char input = 'A';
	private final char[] output = {};
	
	public char getMatch()
	{
		return input;
	}
	
	public char[] getBody()
	{
		return output;
	}
}
