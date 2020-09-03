<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Primeira página JSP</title>
</head>
<body>
<h3>Primeira página JSP</h3>
Hoje é o dia: <font color="blue"> <%=new java.util.Date()%></font>
Host cliente: <font color="blue"><%=request.getRemoteHost()%></font>
</body>
</html>