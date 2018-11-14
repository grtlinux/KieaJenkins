<%@ page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<%@ page import="java.util.Date" %>
<%@ page import="java.text.SimpleDateFormat" %>
<%
	String strDate = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss").format(new Date());
%>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>index.jsp</title>
</head>
<body>
	<h2>mvn-web</h2>
	<h3>index.jsp: <%=strDate %></h3>
</body>
</html>


