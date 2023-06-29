package week2.homeassignment.day8;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class FindMissingElementsInArray 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		List <Integer> list1 = new ArrayList <Integer> ();
		for (int i = 0; i < arr.length; i++) 
		{
			list1.add(arr[i]);
		}
		Collections.sort(list1);
		for (int i = 1; i < list1.size(); i++) 
		{
		if(list1.get(i-1)!=i)
		{
			System.out.println("The missing number is " + i);
			break;
		}
		}

	}

}
