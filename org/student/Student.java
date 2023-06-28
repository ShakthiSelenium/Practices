package org.student;

import org.department.Department;

public class Student extends Department
{
public void studentName()
{
	System.out.println("Shakthi");
}
public void studentDept()
{
	System.out.println("Information Technology");
}

public void studentID()
{
	System.out.println("9011558");
}
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Student s = new Student();
		s.collegeName();
		s.collegecode();
		s.collegeRank();
		s.deptName();
		s.studentName();
		s.studentDept();
		s.studentID();

	}

}
