package lsystems;

public class A_AA extends LRule
{
	
	//Declare Variables
	
	private final char input = 'A';
	private final char[] output = {'A','A'};
	
	public char getMatch()
	{
		return input;
	}
	
	public char[] getBody()
	{
		return output;
	}
}
