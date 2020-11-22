package co.edureka.jdbc;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class PreparedTest {
	
	public static void main(String[] args) throws Exception{
		Connection con = ConnectionFactory.getDatabaseConnection();
		PreparedStatement pst = con.prepareStatement("insert into emp values(?,?,?)");
		
		Scanner sc = new Scanner(System.in);
		String req = "Y";
		
		while(req.equalsIgnoreCase("Y")) {
		 try {	
			System.out.println("Enter Employee Details (empno, name, sal");
			int eno = sc.nextInt();
			String name = sc.next();
			float sal = sc.nextFloat();
			
			pst.setInt(1, eno);
			pst.setString(2, name);
			pst.setFloat(3, sal);
			
			int n = pst.executeUpdate();
			if(n>0)
				System.out.println("employee saved!");
		 }
		 catch(Exception ex) {System.out.println(ex.toString());}
  		 System.out.print("Do you want to save more employee[Y/N]: ");
		 req=sc.next();
		}//while
	}
}
