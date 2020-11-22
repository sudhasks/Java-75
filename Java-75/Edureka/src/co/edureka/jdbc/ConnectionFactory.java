package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.util.ResourceBundle;

public class ConnectionFactory {
  private static Connection dbCon = null;
  
  public static Connection getDatabaseConnection() throws Exception{
	  if(dbCon == null) {
		  ResourceBundle bundle = ResourceBundle.getBundle("co/edureka/jdbc/dbConfig");
		  
		  String dc = bundle.getString("jdbc.driverClass");
		  String url = bundle.getString("jdbc.url");
		  String uid = bundle.getString("jdbc.userName");
		  String pwd = bundle.getString("jdbc.password");
		  
		  Class.forName(dc);
		  dbCon = DriverManager.getConnection(url,uid,pwd);
	  }
	  return dbCon;
  }
}
