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
<h1>The Use Of The Choose , When & Otherwise</h1>
<c:set var="income" value="${100*100}" scope="session"></c:set>
<p>Your Income Is : 
<c:out value="${income}"></c:out>
</p>
<c:choose>
	<c:when test="${income<=10000}">
	<p>Your Income is Not Good</p>
   </c:when>
   
   <c:when test="${income>=12000}">
   <p>Your Income Is Very Good</p>
   </c:when>
   <c:otherwise>
   	<p>No Income You Have </p>
   </c:otherwise>
</c:choose>

<h2>Checking Whether Number is Even Or Odd number</h2>

<c:set var="number" value="${1001}" scope="session"></c:set>
<p>the Number is 
<c:out value="${number}"></c:out>
</p>

<c:choose>
	<c:when test="${number%2==0}">
	<p>Number is Even Number </p>
	</c:when>
	<c:otherwise>
	<p>Number is Odd Number</p>
	</c:otherwise>

</c:choose>

<h3>Checking the Number is Positive Integer or Not Using JSTL</h3>

<c:set var="givenNumber" value="${-1}" scope="session"></c:set>
<c:out value="${givenNumber}"></c:out>

<c:choose>
	<c:when test="${givenNumber>0}">
	<h1>Given Number is Positive Number</h1>
	</c:when>
	<c:otherwise>
	<h2>Given Number is Negative Number</h2>
	</c:otherwise>
</c:choose>

</body>
</html>