    <%@page import="java.util.Date"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:set var="date" value="<%=new java.util.Date()%>" />  
<p><b>Date and Time in Indian Standard Time(IST) Zone:</b> 

<fmt:formatDate value="${date}"  
             type="both" timeStyle="long" dateStyle="long" /></p>  
<fmt:setTimeZone value="GMT-10" />  

<p><b>Date and Time in GMT-10 time Zone: </b><fmt:formatDate value="${date}"  
             type="both" timeStyle="long" dateStyle="long" /></p>  
</body>
</html>