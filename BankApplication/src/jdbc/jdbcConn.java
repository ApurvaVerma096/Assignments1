package jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;



public class jdbcConn {

	Connection dbConn;
	
	public Connection connectdb(){
		
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			
			dbConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/bankdetails", "root", "");
			
			if(dbConn == null) {
				System.out.println("Some issue ");
				
			}else {
				System.out.println("Database connected");
			}
		}catch(SQLException | ClassNotFoundException e) {
			System.out.println("Some issue occured "+ e);
		}
		return dbConn;
	}
	
}
