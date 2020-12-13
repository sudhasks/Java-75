package co.edureka.dao;

import java.util.List;

import co.edureka.entity.Employee;

public interface EmployeeDao {
 public void saveEmp(Employee emp);
 public void updateEmp(Employee emp);
 public void deleteEmp(int eno);
 public List<Employee> getEmployees();
}
