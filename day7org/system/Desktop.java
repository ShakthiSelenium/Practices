package week2.homeassignment.day7org.system;

public class Desktop extends Computer
{
	public void desktopSize()
	{
		System.out.println("From Child Class - HP Touch pad - 15 inches");
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Desktop d = new Desktop();
		d.computerModel();
		d.desktopSize();
		System.out.println("Both the methods are accessible from child class - Simple inheritance achieved");

	}

}
