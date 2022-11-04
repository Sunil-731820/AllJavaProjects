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
<c:out value="${'I am Using the contains Ignore Case In String'}"></c:out>
<c:set var="String" value="I am going to Home"></c:set>
<c:if test="${fn:containsIgnoreCase(String,'home')}">
<p>String home is Found </p>
</c:if>
<c:if test="${fn:containsIgnoreCase(String,'i')}">
<p>I Is Found In The Given String </p>
</c:if>
</body>
</html>