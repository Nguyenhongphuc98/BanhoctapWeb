<%@page import="java.util.List"%>
<%@ taglib uri = "http://java.sun.com/jsp/jstl/core" prefix = "c" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h1>All documents:</h1>
	<ul>
		<c:forEach var="doc" items="${documents}">
					<li> <a href="${pageContext.request.contextPath}/documents/detail/${doc.getPublicUrl()}">${doc.getTitle()}</a> <br/>
					- mô tả: ${doc.getDescription() }<br/>
					- tác giả: ${doc.getUploader().getUsername()}<br/>
					- views: ${doc.getViews()}<br/>
					- downloads: ${doc.getDownloads()}<br/>
					- hoc ky: ${doc.getSemeter().getNo()} - nam hoc: ${doc.getSemeter().getYear()}<br/>
					- subject: ${doc.getSubject().getName()}<br/>
					</li>
		</c:forEach>
	</ul>
</body>
</html>