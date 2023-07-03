package week3.homeassignment.day9;

import java.util.LinkedHashSet;
import java.util.Set;

public class PrintDuplicateNumbers 
{
		public static void main(String[] args) 
		{
		// TODO Auto-generated method stub
			int[] data = {4,3,6,8,29,1,2,4,7,8};
			
			 
			Set <Integer> data1 = new LinkedHashSet <Integer> ();
			Set <Integer> Dup = new LinkedHashSet <Integer> ();
			
			for (Integer i : data) 
			{
				
					boolean add = data1.add(i);
					if(!add)
						Dup.add(i);
			
									
			}
			
			System.out.println("The unique values in the set is "+data1);

			System.out.println("The duplicates in the set is "+Dup);

	}

}
