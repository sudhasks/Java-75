package co.edureka;

import java.util.List;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import co.edureka.dao.EmployeeDao;
import co.edureka.entity.Employee;

public class Main {

	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext("context.xml");
		
		EmployeeDao dao = (EmployeeDao)context.getBean("empdao");
		
		//to save an employee		
		Employee emp = new Employee(110,"edureka",2500f);
		dao.saveEmp(emp);
		
		
		//to update an Employee
		emp = new Employee(101,"Sunil",2500f);
		dao.updateEmp(emp);
		
		//to delete an employee
		dao.deleteEmp(109);
		
		//to list all Employees
		List<Employee> emps = dao.getEmployees();
		for(Employee e: emps) {
			System.out.println(e);
		}
	}
}
