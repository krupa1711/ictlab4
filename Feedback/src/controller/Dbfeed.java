package controller;

import java.sql.*;

public class Dbfeed {
	
	private static Connection cn;
	private static Statement st;
	private  static ResultSet rs;
	
	static String un="b2500aa45f7708",
			up="aeec684b",
		url="jdbc:mysql://au-cdbr-sl-syd-01.cleardb.net:3306/ibmx_9386c257e3d0331";
	
	
	
	static{
		
		try {
			Class.forName("com.mysql.jdbc.Driver");
			cn=DriverManager.getConnection(url,un,up);
			
		} 
		catch (Exception e) {
		
			e.printStackTrace();
		}
		
	}
	
	
	public static int register(String sql) throws SQLException {
		PreparedStatement ps=cn.prepareStatement(sql);
		int i=ps.executeUpdate();
		return i;		
	}
	

	public static ResultSet validate( String sql) throws SQLException {
		PreparedStatement ps=cn.prepareStatement(sql);
		ResultSet rs= ps.executeQuery();
		return rs;
	}
}