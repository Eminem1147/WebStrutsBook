<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>insertbook</title>
</head>
<body>
	<form action="InsertBook.action" method="post" name="form1">
		书名：<input type="text" id="name" name="name" />
		&nbsp;&nbsp;
		<s:fielderror fieldName="name" /> <br><br>
		价格：<input type="text" id="price" name="price" /> <br><br>
		数量：<input type="text" id="num" name="num" /> <br><br>
		<input type="submit" value="添加" />
	</form>
</body>
</html>