<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'The Use of The Parse date in JSTL' }"></c:out>
<c:set var="date" value="12-08-2022"></c:set>
<fmt:parseDate value="${date}" var="parsedDate" pattern="dd-MM-yyyy" />
<p>
	The Date is :
	<c:out value="${parsedDate}"/>
</p>


</body>
</html>