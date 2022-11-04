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
<%
out.println("Hello Welcome to My JSTL Tags");
%>


<c:out value="${'welcome To Java JSTL Tag'}"></c:out>
<c:out value="${'Hello Sunil Today i Am going start my Sesion' }"></c:out>
</body>
</html>