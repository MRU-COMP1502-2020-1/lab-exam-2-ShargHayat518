package lsystems;

public class B_A extends LRule
{
	
	//Declare Variables
	
	private final char input = 'B';
	private final char[] output = {'A'};
	
	public char getMatch()
	{
		return input;
	}
	
	public char[] getBody()
	{
		return output;
	}
}
