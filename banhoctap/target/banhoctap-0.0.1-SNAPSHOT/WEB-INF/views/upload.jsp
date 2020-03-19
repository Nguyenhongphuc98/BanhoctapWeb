<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	
 	  <form method="post" action="${pageContext.request.contextPath}/documents/upload" enctype="multipart/form-data">
        
        Select file to upload 

 		<input type="text" name="title" />
        <input type="file" name="file" />
        <br />

        <br />
        <input type="submit" value="Upload" />
    </form>
    
</body>
</html>