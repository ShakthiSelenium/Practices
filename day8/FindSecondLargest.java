package week2.homeassignment.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindSecondLargest {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		List <Integer> list1 = new ArrayList <Integer> ();
		for (int i = 0; i < data.length; i++) 
		{
			list1.add(data[i]);
		}
		Collections.sort(list1);
		int length = list1.size();
		System.out.println("The second Largest number is --"+ data[length-1]);

	}

}
