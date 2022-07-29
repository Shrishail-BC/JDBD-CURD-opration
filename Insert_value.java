package comjavajdbc.com;

import java.sql.Connection;
import java.sql.Statement;

public class Insert_value {
	public static void main(String[] args) {
		Connection connection=null;
		Statement statement=null;
		
		ConnectDB obj_ConnectDB=new ConnectDB();
		
		connection=(obj_ConnectDB.get_connection());
		
		try {
			
			String query="insert into organization(userId,name,countryId) values('40','wipro','32')";
			statement=connection.createStatement();
			statement.executeUpdate(query);
			System.out.println("value inserted");
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
