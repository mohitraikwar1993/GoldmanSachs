package Practice;

import java.beans.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

public class DB_SElenium_Connection 

{

	static Connection con;
	static String DBurl="";
	static String username="";
	static String password="";
	
	public static void main(String[] args) throws SQLException {
		
		
		try
		{
			con=DriverManager.getConnection(DBurl,username,password);
			
		}
		catch(Exception e)
		{
			e.printStackTrace();
		}
		
		java.sql.Statement st=con.createStatement();
		ResultSet res=st.executeQuery("");
		int i=0;
		while(res.next())
		{
			res.getString(0);
		}
	}
	
}
