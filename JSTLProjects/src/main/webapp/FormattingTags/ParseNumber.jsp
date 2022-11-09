<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>   
 <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>  
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'I  am using parseNumber() in formatting Tags'}"></c:out>
<c:set var="Amount" value="786.970"></c:set>
	<fmt:parseNumber var="j" type="number" value="${Amount}" />
	<p>
		The Amount is Before  Parsing To Number is 
		<c:out value="${j}"></c:out>
	</p>
	
	<fmt:parseNumber var="j" integerOnly="true" type="number" value="${Amount}"/>
	<p>
	Amount is After Parsing The Double To Integer  : 
	<c:out value="${j}"></c:out>
	</p>
	
</body>
</html>