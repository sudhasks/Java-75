package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ListEmployees {

	public static void main(String[] args) throws Exception {
		Connection con = ConnectionFactory.getDatabaseConnection();
		
		Statement st = con.createStatement();
		
		String sql = "select * from emp";
		
		try {
			ResultSet rs = st.executeQuery(sql);
			while(rs.next()) {
				System.out.println(rs.getRow()+" -> "+rs.getInt(1)+" | "+rs.getString(2) + " | "+rs.getFloat("sal"));
				Thread.sleep(2000);
			}
		}catch(Exception ex) {
			System.out.println(ex.toString());
		}
		finally {
			st.close();
			con.close();
		}

	}

}
