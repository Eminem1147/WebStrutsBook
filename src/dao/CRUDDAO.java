package dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import controller.Book;
import util.DBconn;

public class CRUDDAO
{
	public Book searchBook(String bookname) throws SQLException, ClassNotFoundException
	{
		Connection conn = DBconn.getConnection();
		ResultSet rs = null;
		Statement st = conn.createStatement();
		rs = st.executeQuery("select ID, Name, Price, Num from book where Name='" + bookname + "';");

		Book book = null;

		while (rs.next())
		{
			book = new Book(rs.getInt(1), rs.getString(2), rs.getDouble(3), rs.getInt(4));
			// System.out.println(book.getID() + " " + book.getName() + " " +
			// book.getPrice() + " " + book.getNum());
		}

		return book;
	}

	public boolean insertBook(String name, double price, int num) throws ClassNotFoundException, SQLException
	{
		Connection conn = DBconn.getConnection();
		String sql = "insert into book(Name, Price, Num) values (?,?,?);";
		PreparedStatement ps;
		try
		{
			ps = conn.prepareStatement(sql);
			ps.setString(1, name);
			ps.setDouble(2, price);
			ps.setFloat(3, num);
			ps.executeUpdate();
			ps.close();
			return true;
		} catch (SQLException e)
		{
			e.printStackTrace();
			System.out.println("error");
			return false;
		}
	}

	public boolean deleteBook(String bookname) throws ClassNotFoundException, SQLException
	{
		Connection conn = DBconn.getConnection();
		String sql = "delete from book where Name='" + bookname + "';";
		PreparedStatement ps;
		try
		{
			ps = conn.prepareStatement(sql);
			ps.executeUpdate();
			ps.close();
			conn.close();
			return true;
		} catch (SQLException e)
		{
			e.printStackTrace();
			return false;
		}
	}
}
