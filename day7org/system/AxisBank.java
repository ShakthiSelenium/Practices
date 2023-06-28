package week2.homeassignment.day7org.system;

public class AxisBank extends BankInfo
{
	public void deposit()
	{
		System.out.println("Method - Overriding achieved");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		AxisBank ab = new AxisBank();
		ab.deposit();
		ab.saving();
		ab.fixed();

	}

}
