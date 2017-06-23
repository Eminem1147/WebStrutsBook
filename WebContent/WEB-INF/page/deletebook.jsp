<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>deletebook</title>
</head>
<body>
	<form action="DeleteBook.action" method="post" name="form1">
		所要删除的书名：
		<input type="text" id="bookname" name="bookname" />
		&nbsp;&nbsp;
		<s:fielderror fieldName="name" /> <br><br>
		<input type="submit" name="submit" value="删除" />
	</form>
</body>
</html>