package comjavajdbc.com;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectDB {
	
	public static void main(String[] args) {
		
		ConnectDB obj_ConnectDB=new ConnectDB();
		
		System.out.println(obj_ConnectDB.get_connection());
	}
	
		public Connection get_connection() {
			
			Connection connection=null;
			
			try {
				
				Class.forName("org.postgresql.Driver");
				connection=DriverManager.getConnection("jdbc:postgresql://localhost:5432/axx_custom","postgres","axxonet");
				
				if(connection!=null) {
					System.out.println("connection is ok");
				}else {
					System.out.println("connection is Fail");
				}
				
				
			} catch (Exception e) {
				System.out.println(e);
			}
		
			return connection;
		}
		
		
}


 