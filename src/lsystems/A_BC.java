package lsystems;

public class A_BC extends LRule
{
	
	//Declare Variables
	
	private final char input = 'A';
	private final char[] output = {'B','C'};
	
	public char getMatch()
	{
		return input;
	}
	
	public char[] getBody()
	{
		return output;
	}
}
