package week1.Homeassignment.Day1;

public class Car {
	
	public void driveCar()
	{
		System.out.println("Drive Car Carefully");
		
	}
	public void applyBrake()
	{
		System.out.println("Apply brake if necessary");
	}
	public void soundHorn()
	{
		System.out.println("Warning - sound horn");

	}
	public void isPuncture()
	{
		System.out.println("Is Puncture go to Workshop");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Car C=new Car();
		C.driveCar();
		C.applyBrake();
		C.soundHorn();
		C.isPuncture();
		

		
	}

}
