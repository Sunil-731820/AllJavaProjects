<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<c:out value="${'The Use of The For Token '}"></c:out>
	<c:forTokens items="Sunil-Abhisek-Harish-Arti" delims="-" var="name">
		<c:out value="${name}"></c:out><br>
	</c:forTokens>
</body>
</html>