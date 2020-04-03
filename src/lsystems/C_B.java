package lsystems;

public class C_B extends LRule
{
	
	//Declare Variables
	
	private final char input = 'C';
	private final char[] output = {'B'};
	
	public char getMatch()
	{
		return input;
	}
	
	public char[] getBody()
	{
		return output;
	}
}
