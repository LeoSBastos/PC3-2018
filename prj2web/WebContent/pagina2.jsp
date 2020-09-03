<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<h3>Testando a sorte</h3>
<% 
	if(Math.random()>0.5){
		out.print("Tenha um bom dia hoje");
	} else {
		out.print("Amanhã você terá um bom dia.");
	}
%>
</body>
</html>