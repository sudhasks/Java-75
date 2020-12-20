package co.edureka.services;

import java.util.ArrayList;
import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;

import co.edureka.Employee;

@Path("employee")
public class EmployeesDetails {
 @GET
 @Produces("application/json")
 @Path("/getall")
 public List<Employee> getAllEmployees() 
 {
    ArrayList<Employee> employeesList = new ArrayList<Employee>();
     	     
    employeesList.add(new Employee(101, "Sunil Joseph"));
    employeesList.add(new Employee(201, "Anirudh"));
    employeesList.add(new Employee(301, "Jefferey"));	     
 	    
    return employeesList;
 }
}
