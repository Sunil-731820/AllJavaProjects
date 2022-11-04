<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/functions" prefix="fn" %>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'The Use Of The Contains'}"></c:out>
<c:set var="String" value="hello I am Going To start My Session"></c:set>
<c:if test="${fn:contains(String,'start')}">
<p>start is FOund in the Given String </p>
</c:if>

<c:if test="${fn:contains(String,'Session')}">
<p>Sesion is Found in the Given String</p>
</c:if>

</body>
</html>