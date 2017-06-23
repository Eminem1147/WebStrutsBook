package controller;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.interceptor.ServletRequestAware;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionSupport;

import dao.CRUDDAO;

/*
 * �Ѳ�������request��������������Ҫ�ķ���
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
	
	// ��֤��Ҫ��ǰ��ķ������Ӧ
	public void validateExecute()
	{
		if(bookname.equals(""))
		{
			this.addFieldError("bookname", "��������Ϊ��");
		}
	}

	@Override
	public void setServletRequest(HttpServletRequest request)
	{
		this.request = request;
	}
	
}
