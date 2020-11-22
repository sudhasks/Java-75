package co.edureka.jdbc.dao;

import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) throws Exception{		
		EmployeeDao dao = EmployeeDAOFactory.getEmployeeDao();
		
		//to save an Employee
		Employee emp = new Employee(106,"Chris",45000f);
		dao.saveEmp(emp);
		
		//to update and Employee
		emp = new Employee(101,"Sunil Joseph",80000.5f);
		dao.updateEmp(emp);
		
		Scanner sc = new Scanner(System.in);
		System.out.print("enter an employee number: ");
		int eno = sc.nextInt();
		
		emp = dao.searchEmp(eno);
		if(emp != null) {
			System.out.println(emp);
			System.out.print("do you want to delete employee with empno = "+eno+" : [Y/N]: ");
			if(sc.next().equals("Y"))
				dao.deleteEmp(eno);
		}
		System.out.println("---------------------------------");
		
		List<Employee> emps = dao.getEmployees();
		for(Employee e : emps) {
			System.out.println(e);
			Thread.sleep(1000);
		}
	}
}
