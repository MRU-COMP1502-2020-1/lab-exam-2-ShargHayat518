package lsystems;

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
		
		char input = line[0];
		
		switch(input)
		{
		
		case 'A':
			LRule rule = new A_A();
			break;
		
		case '
		
		
		}
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		LRule rule = new A_A();
		
		char check = rule.getMatch();
		
		if (input == check)
		{
			line = rule.getBody();
		}
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
