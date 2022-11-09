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
<fmt:bundle basename="com.java.jstl.Simple1" prefix="Color.">
<fmt:message key="red"/><br>
<fmt:message key="green"/><br>
<fmt:message key="yellow"/><br>
</fmt:bundle>
</body>
</html>