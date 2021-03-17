package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletContext;

public class DatabaseManager 
{

	
	
	
	public static void loadDriver(String dbDriver)
	{
		try {
			Class.forName(dbDriver);
		} catch (ClassNotFoundException e) {
			
			e.printStackTrace();
		}
	}
	
	public static Connection getConnection(String dburl,String dbuname, String dbpassword) 
	{
		Connection con=null;
		
		try {
			con=DriverManager.getConnection(dburl,dbuname,dbpassword);
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		return con;
	}
		
	public static PreparedStatement getPreparedStatement(Connection con,String sql)
	{
		PreparedStatement ps=null;
		try {
			ps = con.prepareStatement(sql);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return ps;
	}
		
		
	
	
	
	
	
	
}
