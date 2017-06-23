<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>searchbook</title>
</head>
<body>
	<form action="SearchBook.action" method="post" name="form1">
		所要查找的书名：
		<input type="text" id="bookname" name="bookname" />
		&nbsp;&nbsp;
		<s:fielderror fieldName="bookname" /> <br><br>
		<input type="submit" name="submit" value="查询" />
		<!-- 表单重复提交的拦截器！！！！ -->
		<s:token/>
	</form>
</body>
</html>