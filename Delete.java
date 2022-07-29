package comjavajdbc.com;

import java.sql.Connection;
import java.sql.Statement;

public class Delete {
	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		
		ConnectDB obj_ConnectDB=new ConnectDB();
		
		connection=(obj_ConnectDB.get_connection());
		
		try {
			
			String query="delete from organization where orgid='49169'";
			statement=connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("Deleted succesfully");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
