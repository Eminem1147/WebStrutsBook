<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>

<%@taglib prefix="s" uri="/struts-tags"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>showbook</title>
</head>
<body>
	<h3>所查的图书信息为：</h3>
	<!-- 也可以使用{name}{price}{num} -->
	ID: <s:property value="#request.book.ID"/> <br>
	Name: <s:property value="#request.book.Name"/> <br>
	Price: <s:property value="#request.book.Price"/> <br>
	Num: <s:property value="#request.book.Num"/> <br>
</body>
</html>