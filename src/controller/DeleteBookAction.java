package controller;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.CRUDDAO;

public class DeleteBookAction extends ActionSupport implements Action
{
	private static final long serialVersionUID = 821666488366596527L;
	private String bookname;

	@Override
	public String execute() throws Exception
	{
		CRUDDAO dao = new CRUDDAO();
		
		if(dao.deleteBook(bookname))
		{
			return "success";
		} else 
		{
			return "error";
		}
	}
	
	// ��֤��Ҫ��ǰ��ķ������Ӧ
	public void validateExecute()
	{
		if(bookname.equals(""))
		{
			this.addFieldError("bookname", "��������Ϊ��");
		}
	}

	public String getBookname()
	{
		return bookname;
	}

	public void setBookname(String bookname)
	{
		this.bookname = bookname;
	}
	
}
