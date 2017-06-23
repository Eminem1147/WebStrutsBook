package controller;

import java.text.SimpleDateFormat;
import java.util.Date;

import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.Interceptor;

/*
 * 自定义拦截器
 */
public class TimeInterceptor implements Interceptor
{
	private static final long serialVersionUID = 494152659769385257L;

	@Override
	public void destroy()
	{
		
	}

	@Override
	public void init()
	{
		
	}

	@Override
	public String intercept(ActionInvocation invocation) throws Exception
	{
		String result = invocation.invoke();
	    Date date=new Date();
	    SimpleDateFormat format=new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
	    System.out.println("有用户登录："+format.format(date));
	    return result;
	}

}
