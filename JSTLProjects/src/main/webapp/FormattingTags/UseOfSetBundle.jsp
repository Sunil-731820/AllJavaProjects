<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<c:out value="${'The Use Of The Set Bundle '}"></c:out>
<fmt:setBundle basename="com.java.jstl.setBundleExample" var="lang"/>
<fmt:message bundle="${lang}" key="Vegetable.Potato"/>
<fmt:message bundle="${lang}" key="Vegatable.Tomato"/>
<fmt:message bundle="${lang}" key="Vegetable.Carrot" />S


</body>
</html>