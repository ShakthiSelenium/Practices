package week2.homeassignment.day7org.system;

public class Students 
{
	public void getStudentInfo(int id)
	{
		System.out.println("The Student ID :"+id);
	}
	public void getStudentInfo(int id, String name)
	{
		System.out.println("The Student ID :"+id+"--Student name :"+name);
	}
	public void getStudentInfo(int id, long phoneno)
	{
		System.out.println("The Student ID :"+id+"--Student Phone number :"+phoneno);
	}

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Students s = new Students();
		s.getStudentInfo(23);
		s.getStudentInfo(23, "Shakthi");
		s.getStudentInfo(23,9659874569L);

	}

}
