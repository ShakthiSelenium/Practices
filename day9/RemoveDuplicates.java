package week3.homeassignment.day9;

import java.util.LinkedHashSet;
import java.util.Set;

public class RemoveDuplicates 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String a = "PayPal India";
		char[] ch = a.toCharArray();
		Set <Character> charSet  = new LinkedHashSet <Character> ();
		Set <Character> dupCharSet  = new LinkedHashSet <Character> ();
		for (int i = 0; i < ch.length; i++) 
		{
			boolean bool=charSet.add(ch[i]);
			if(!bool)
				dupCharSet.add(ch[i]); //if the character is already in the charSet then, add it to the dupCharSet
					
		}
		System.out.println("Initial CharSet Set :"+charSet);
		for (Character i : dupCharSet) 
		{
			charSet.remove(i); //Check the dupCharSet elements and remove those in the charSet
		}
		
		System.out.println("Duplicates Removed CharSet Set :"+charSet);
		System.out.println("Duplicate dupCharSet Set :"+dupCharSet);

	}

}
