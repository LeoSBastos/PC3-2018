<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Teste</title>
</head>
<body>
<%@ page import="java.util.Date,java.text.SimpleDateFormat"%>
<%! Date now; %>
<%
	for(int i = 1; i <= 5; i++){%>
	<h<%=i%>> Tamanho da fonte = <%=i%></h<%=i%>>
	<br>	
	<%}
%>
<br>
<% now = new Date();
SimpleDateFormat f = new SimpleDateFormat("dd/MM/yyyy");
out.print(f.format(now));
%>

</body>
</html>