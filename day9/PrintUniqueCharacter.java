package week3.homeassignment.day9;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintUniqueCharacter 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		String name = "RajaShakthi";
		String output ="";
		char[] ch = name.toCharArray();
		Set <Character> data1 = new LinkedHashSet <Character> ();
		for (char i : ch) 
		{
			if (data1.add(i))
				output = output+i;
		}
		System.out.println(data1);
		System.out.println(output);

	}

}
