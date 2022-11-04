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

<h1>The Use Of The Param Variable</h1>
<c:url value="/index1.jsp" var="completeURL">  
 <c:param name="trackingId" value="786"/><br>
 <c:param name="user" value="Nakul"/><br>
 <c:param name="password" value="Sunil@123"/>
</c:url>  
${completeURL}
</html>