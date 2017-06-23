package controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.CRUDDAO;

public class InsertBookAction extends ActionSupport implements Action
{
	private static final long serialVersionUID = 821666488366596527L;
	private String name;
	private double price;
	private int num;

	@Override
	public String execute() throws Exception
	{
		CRUDDAO dao = new CRUDDAO();
		
		if(dao.insertBook(name, price, num))
		{
			return "success";
		} else 
		{
			return "error";
		}
	}
	
	// 验证，要与前面的方法相对应
	public void validateExecute()
	{
		if(name.equals(""))
		{
			this.addFieldError("name", "书名不能为空");
		}
	}

	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public double getPrice()
	{
		return price;
	}

	public void setPrice(double price)
	{
		this.price = price;
	}

	public int getNum()
	{
		return num;
	}

	public void setNum(int num)
	{
		this.num = num;
	}
	
}
