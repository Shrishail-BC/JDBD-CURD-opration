package comjavajdbc.com;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class Read_value {
	public static void main(String[] args) {
		
		Connection connection=null;
		Statement statement=null;
		ResultSet rs=null;
		
		ConnectDB obj_ConnectDB=new ConnectDB();
		
		connection=(obj_ConnectDB.get_connection());
		
		try {
			
			String query="select * from country";
			statement=connection.createStatement();
			rs=statement.executeQuery(query);
			
					while(rs.next()) {
						System.out.println(rs.getString("countryId"));
						System.out.println(rs.getString("name"));
					}
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		
	}
}
