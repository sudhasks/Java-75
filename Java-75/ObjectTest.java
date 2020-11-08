class Employee 
{
	int empno;
	String name;
	float sal;

	void setDetails(){
		name = "Sachin";
		sal = 5000;
	}

	void displayDetails(){
		System.out.println(empno + " | "+ name+" | "+sal);
	}
} //Employee

class ObjectTest
{
	public static void main(String[] args) 
	{
		//creating an Employee object
		Employee emp = new Employee();
		System.out.println(emp.empno + " | "+ emp.name+" | "+emp.sal);
		
		//to change the state of object with reference
		emp.empno = 101;
		emp.name = "Sunil";
		emp.sal = 2500.5f;
		emp.displayDetails();	
		
		//to change the state of object with method
		emp.setDetails();
		emp.displayDetails();
	}
}
