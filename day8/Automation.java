package week2.homeassignment.day8;

public class Automation extends MultipleLanguage implements TestTool,Language
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Automation a = new Automation();
		a.Java();
		a.Selenium();
		a.pyhton();
		a.ruby();

	}

	public void Java() {
		// TODO Auto-generated method stub
		System.out.println("Automation defines Java method");
		
	}

	public void Selenium() {
		// TODO Auto-generated method stub
		System.out.println("Automation defines Selenium method");
		
	}

	@Override
	public void ruby() {
		// TODO Auto-generated method stub
		System.out.println("Automation defines ruby method");
		
	}

}
