package dao;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import util.DBconn;

public class CheckUser
{
	public boolean checkUsers(String name, String password) throws SQLException, ClassNotFoundException
	{
		if (name != null && password != null)
		{
			Connection conn = DBconn.getConnection();
			ResultSet rs = null;
			Statement st=conn.createStatement();
			rs = st.executeQuery("select name, password from user where name='" + name + "';");
			try
			{
				while (rs.next())
				{
					if(name.equals(rs.getString(1))&& password.equals(rs.getString(2)))
					{
						return true;
					}
				}
			} catch (SQLException e)
			{
				e.printStackTrace();
			}

		}
		return false;
	}
}
