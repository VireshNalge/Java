package oops;

public class Employee {
	// Variables
	int eid;
	String ename; 
	String job;
	int sal;
	
	
	// Methods
	void  display()
	{
		System.out.println(eid);
		System.out.println(ename);
		System.out.println(job);
		System.out.println(sal);
		
	}
	
	
// This is main method
	public static void main(String[] args) 
	{
		Employee emp1 = new Employee(); // object
		
		emp1.eid = 101;
		emp1.ename = "Joy";
		emp1.job = "IT";
		emp1.sal = 10000;
		emp1.display();
		

	}

}
