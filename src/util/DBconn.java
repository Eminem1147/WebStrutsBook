package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * 连接MySQL
 */
public class DBconn
{
	public static String driver;// 定义驱动
	public static String url;// 定义链接URL

	public static String username;// 定义数据库用户名
	public static String password;// 定义数据库密码
	public static Connection connection;// 定义链接
	public static Statement statement;// 定义statement
	public static ResultSet result;// 定义结果集

	public static Connection getConnection() throws ClassNotFoundException, SQLException
	{
		driver = "com.mysql.jdbc.Driver";
		url = "jdbc:mysql://localhost:3306/strutsbook";
		username = "root";
		password = "zhangjian";
		connection = DriverManager.getConnection(url, username, password);
		
		Class.forName(driver);
		if(connection==null) 
			connection=DriverManager.getConnection(url, username, password);
		return connection;
	}
	
}
