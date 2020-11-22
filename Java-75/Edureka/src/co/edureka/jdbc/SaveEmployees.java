package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.Statement;

public class SaveEmployees {

	public static void main(String[] args) throws Exception{		
		
		Connection con = ConnectionFactory.getDatabaseConnection();
				
		Statement st = con.createStatement();
		
		//String sql = "insert into emp values(102,'Anil',25000.5)";
		String sql = "insert into emp(empno,ename,sal) values(103,'Rakesh',35000),(104,'Sachin',12500),(105,'Naveen',10000.5)";
		
		try {
			int rows_affected = st.executeUpdate(sql);
			System.out.println("No of Employees Saved = " + rows_affected);
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		finally {
			st.close();
			con.close();
		}

	}

}
