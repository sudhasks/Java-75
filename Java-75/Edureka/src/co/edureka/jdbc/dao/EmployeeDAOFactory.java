package co.edureka.jdbc.dao;

public class EmployeeDAOFactory {
  private static EmployeeDao empDao = null;
  public static EmployeeDao getEmployeeDao() throws Exception{
	  if(empDao == null) {
		  empDao = new EmployeeDaoImpl();
	  }
	  return empDao;
  }
}
