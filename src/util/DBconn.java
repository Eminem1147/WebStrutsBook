package util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/*
 * ����MySQL
 */
public class DBconn
{
	public static String driver;// ��������
	public static String url;// ��������URL

	public static String username;// �������ݿ��û���
	public static String password;// �������ݿ�����
	public static Connection connection;// ��������
	public static Statement statement;// ����statement
	public static ResultSet result;// ��������

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
