package week1.Homeassignment.day3;

import java.util.Arrays;

public class FindSecondLargestInArray {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		int[] data = {3,2,11,4,6,7};
		Arrays.sort(data);
		int length = data.length;
		System.out.println("The second Largest number in the array is --- "+data[length-2]);

		
	}

}
