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
<c:out value="${'The Information Of the Employ is '}"></c:out>
<jsp:useBean id="dao" class="com.java.jstl.EmployDAO"/>

<%
int id = Integer.parseInt(request.getParameter("id"));

%>


<c:if test="${param.id!=null}">
	<c:set var="empId" value="${param.id}"/>
	<c:set var="employ" value="${dao.searchEmployById(empId)}"/>
	
	<h2> Employ Details is </h2>
	Employ Id : 
	<c:out value="${empId}"></c:out><br>
	Employ Name is :
	<c:out value="${employ.name}"></c:out><br>
	Gender : 
	<c:out value="${employ.gender}"></c:out><br>
	Department : 
	<c:out value="${employ.dept}"></c:out><br>
	Designation :
	<c:out value="${employ.desig}"></c:out><br>
	Basic :
	<c:out value="${employ.basic}"></c:out>
</c:if>

</body>
</html>