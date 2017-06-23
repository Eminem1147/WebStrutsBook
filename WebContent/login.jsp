<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>登录界面</title>
<body>
	用户名：admin<br><br>
	密码：123456<br><br>
	<form action="login.action" method="post" name="form1" onsubmit="return check();">
		用户名： 
		<input type="text" id="name" name="name" />
		&nbsp;&nbsp;
		<s:fielderror fieldName="name" /> <br><br>
		密码：&nbsp;
		<input type="password" id="password" name="password" />
		&nbsp;&nbsp;
		<s:fielderror fieldName="password" /> <br><br>
		<input type="submit" name="submit" value="登陆" />
		&nbsp;&nbsp;
		<input type="reset" name="reset" value="重置" />
	</form>
</body>
</html>