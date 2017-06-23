package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.CRUDDAO;

/*
 * 把参数放入request！！！！！！重要的方法
 */
public class SearchBookAction extends ActionSupport implements Action, ServletRequestAware
{
	private static final long serialVersionUID = 821666488366596527L;
	private String bookname;
	private HttpServletRequest request;

	public String getBookname()
	{
		return bookname;
	}

	public void setBookname(String bookname)
	{
		this.bookname = bookname;
	}

	@Override
	public String execute() throws Exception
	{
		CRUDDAO dao = new CRUDDAO();
		
		Book book = dao.searchBook(bookname);
		
		if(book == null)
		{
			return "error";
		} else 
		{
			request.setAttribute("book", book);
			return "success";
		}
	}
	
	// 验证，要与前面的方法相对应
	public void validateExecute()
	{
		if(bookname.equals(""))
		{
			this.addFieldError("bookname", "书名不能为空");
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest request)
	{
		this.request = request;
	}
	
}
