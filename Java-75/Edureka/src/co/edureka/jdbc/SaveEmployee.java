package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class SaveEmployee {

	public static void main(String[] args) throws Exception{		
		Class.forName("com.mysql.jdbc.Driver");		
		
		Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/edureka","root","");
				
		Statement st = con.createStatement();
		
		String sql = "insert into emp values(101,'Sunil',25000.5)";
		
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
	}//main
}//class
