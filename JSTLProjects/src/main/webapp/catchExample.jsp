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
<c:out value="${'I Am Going to Start the Use Of catch In JSTL'}"></c:out>
<c:catch var ="number">
<%
	int x = 2/1;
%>
</c:catch>

<c:if test="${number!=null}">
<p>
	The Type Of The Exception is : ${number}<br>
	
</p>
</c:if>
<c:out value="${'Number is '}"></c:out>
<c:out value="${x}"></c:out>
<c:set value="${x}"></c:set>
</body>
</html>