package week1.Homeassignment.Day2;

public class FibonacciSeries {

	public static void main(String[] args) {
		
		int range = 8;
		int sum=0;
		int firstNum=0;
		int secondNum = 1;
		for(int i=1;i<=range;i++)
		{
			System.out.println(" "+firstNum );
			sum = firstNum+secondNum;
			firstNum=secondNum;
			secondNum=sum;
		}
		// TODO Auto-generated method stub

	}

}
