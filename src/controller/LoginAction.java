package controller;

import java.sql.SQLException;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.CheckUser;

/*
 * 通过属性驱动式获取表单中的数据
 */
public class LoginAction extends ActionSupport implements Action
{
	private static final long serialVersionUID = -8060767165088942217L;
	private int id;
	private String name;
	private String password;
	private String email;
	
	public int getId()
	{
		return id;
	}
	public void setId(int id)
	{
		this.id = id;
	}
	public String getName()
	{
		return name;
	}
	public void setName(String name)
	{
		this.name = name;
	}
	public String getPassword()
	{
		return password;
	}
	public void setPassword(String password)
	{
		this.password = password;
	}
	public String getEmail()
	{
		return email;
	}
	public void setEmail(String email)
	{
		this.email = email;
	}

	@Override
	public String execute() throws Exception
	{
		CheckUser checkUser = new CheckUser();
        boolean flag = false;
        try
		{
			flag = checkUser.checkUsers(name, password);
		} catch (SQLException e)
		{
			e.printStackTrace();
		} catch (ClassNotFoundException e)
		{
			e.printStackTrace();
		}
        
        if(flag) return "success";
        else return "error";
	}
	
	// 验证，要与前面的方法相对应
	public void validateExecute()
	{
		if(name.equals(""))
		{
			this.addFieldError("name", "用户名不能为空");
		} else if(password.equals(""))
		{
			this.addFieldError("password", "密码不能为空");
		}
	}
	
}
