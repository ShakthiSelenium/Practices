package week1.Homeassignment.day3;

public class ReverseEvenWords {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String test = "I am a software tester"; 
		String[] split = test.split(" ");
		for (int i = 0; i < split.length; i++) 
		{
			System.out.print(" ");
			if(i%2!=0)
			{
				String[] split2 = split[i].split("");
				for (int j = split2.length-1; j >=0 ; j--) 
				{
					System.out.print(split2[j]);
				}
			}
			else
				System.out.print(split[i]);
			
		}
		

	}

}
