<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
	<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
	<title>主界面</title>
</head>
<body>
	<!-- name获取到前一个Action的参数值 -->
	<h1>${name}，欢迎您！</h1><br>
	<a href="To_searchbook.action">查询图书</a><br><br>
	<a href="To_insertbook.action">添加图书</a><br><br>
	<a href="To_deletebook.action">删除图书</a><br><br>
</body>
</html>