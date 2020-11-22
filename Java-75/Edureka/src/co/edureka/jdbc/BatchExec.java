package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class BatchExec {

	public static void main(String[] args) throws Exception {
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:XE","java75","password");		
		
		Statement st = con.createStatement();
		
		//adding DML queries to batch
		st.addBatch("insert into emp values(101,'Sunil',25000)");
		st.addBatch("insert into emp values(102,'Anil',15000)");
		//st.addBatch("insert into emp values(101,'Praveen',25000)");
		st.addBatch("insert into emp values(103,'Praveen',25000)");
		st.addBatch("update emp set sal = 20000");
		
		con.setAutoCommit(false);
		
		try {
			int[] rows = st.executeBatch();
			for(int x : rows) {
				System.out.println("Rows affected = "+ x);
			}
			con.commit();
		}
		catch(Exception ex) {
			System.out.println(ex.toString());
			con.rollback();
		}
		
		st.close();
		con.close();
	}
}
