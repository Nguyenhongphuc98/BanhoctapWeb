<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<form action="http://localhost:8080/banhoctap/posts/create" method="post">
		<input type="text" name="title" placeholder="post title"><br>
		<input type="text" name="contentURL" placeholder="contentURL"><br>
		<input type="text" name="tagID" placeholder="tagID"><br> 
		<input type="text" name="categoryID" placeholder="categoryID"><br>
		<input type="submit" value="Submit">
	</form>
</body>
</html>