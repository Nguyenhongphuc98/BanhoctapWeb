<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
		<h1> ${account}</h1>
		<%
			String ac = (String) request.getAttribute("account");
		%>
		
		<%= ac %>
</body>
</html>