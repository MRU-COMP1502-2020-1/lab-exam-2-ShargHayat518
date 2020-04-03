package lsystems;

public class LSystemSymbolException extends Exception
{
	
	public String getSymbol()
	{
		return "Wrong Symbol Type! Please check your rules!";
	}
}
