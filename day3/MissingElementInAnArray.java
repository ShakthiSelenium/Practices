package week1.Homeassignment.day3;

import java.util.Arrays;

public class MissingElementInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arr = {1,2,3,4,7,6,8};
		Arrays.sort(arr);
		for (int i = arr[0]; i < arr.length; i++) 
		{
			if(i!=arr[i-1])
			{
				System.out.println("The missisng number in the array is = " + i);
				break;
			}
			else
				continue;
		}

	}

}
