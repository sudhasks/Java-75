package co.edureka.except;

import java.sql.SQLException;

public class ThrowsTest {
	public static void main(String[] args) throws SQLException {
		Edureka edu = new Edureka();
		//try {
			edu.getDetails();
		//}catch(Exception ex) {}
	}
}
