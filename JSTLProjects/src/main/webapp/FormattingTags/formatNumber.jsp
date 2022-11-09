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
<h3>This is The Example of The Formatting Number</h3>

<c:set var="Amount" value="9850.14115"></c:set>
<p>Formatted Number  1 is </p>
<fmt:formatNumber value="${Amout}" type="currency"/>
<c:out value="${Amount}"></c:out>
<p>The use Of The GroupingUsed</p>
<fmt:formatNumber value="${Amount}" groupingUsed="true" type="number" />
<p>After the Use Of The maxIntegerDigit</p>
<fmt:formatNumber value="${Amount}" type="number" maxIntegerDigits="1" />
<p>The use Of The maxFractionDigits</p>
<fmt:formatNumber  value="${Amount}" type="number" maxFractionDigits="1"/>
<p>After the Use Of Pattern </p>
<fmt:formatNumber type="number" pattern="###.###$" value="${Amount}" /></p>
</body>
</html>