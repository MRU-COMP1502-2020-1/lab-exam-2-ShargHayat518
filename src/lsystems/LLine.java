package lsystems;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class LLine 
{

	char line[];
	Set <LRule> rules;
	
	public LLine (char[] start, Set <LRule> rules) 
	{
		this.rules = rules;
		this.line = start;
	}
	
	public void process() throws LSystemSymbolException, LSystemLengthException 
	{
		ArrayList <Character> charStore = new ArrayList <Character> ();
		
		for (int i = 0; i < line.length; i++)
		{
			for (LRule a: rules)
			{
				if (line[i] == a.getMatch())
				{
					for (char x: a.getBody())
					{
						charStore.add(x);
					}
					break;
				}
			}
		}
		
		line = listToArray(charStore);
	}
	
	/**
	 * Converts the ArrayList of characters to an array of chars
	 * @param list
	 * @return
	 */
	
	private char[] listToArray(List <Character> list) 
	{
		char[] newChars = new char[list.size()];
		
		for (int i = 0; i < list.size(); i++) 
		{
			newChars[i] = list.get(i);
		}
		
		return newChars;
	}

	public String toString() 
	{
		return new String(line);
	}
	
}
