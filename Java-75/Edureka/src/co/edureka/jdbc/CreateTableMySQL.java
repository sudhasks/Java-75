package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class CreateTableMySQL {

	public static void main(String[] args) throws Exception {
		//initialize an appropriate jdbc driver
		Class.forName("com.mysql.jdbc.Driver");
		
		//Connect to MySQL DB
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
		System.out.println("<<<Connected to MySQL DB - edureka");
		
		//create an object for passing SQL queries to connected DB
		Statement st = con.createStatement();
		
		String sql = "create table emp(empno int(5),ename varchar(25), sal float(10,2), primary key(empno))";
		
		try {
			st.execute(sql);
			System.out.println(">>>DB Table Created!");
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		finally {
			st.close();
			con.close();
		}
	}
}
