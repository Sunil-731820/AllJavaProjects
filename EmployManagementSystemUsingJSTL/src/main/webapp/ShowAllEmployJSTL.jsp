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

<c:out value="${'The Employ Table is '}"></c:out>
<jsp:useBean id="dao" class="com.java.jstl.EmployDAO"/>
<table border="10px" align="center">
	<tr>
		<th>Employ Id</th>
		<th>Employ Name</th>
		<th>Gender</th>
		<th>Department</th>
		<th>Designation</th>
		<th>Basic</th>
		<th>Show Info</th>
	</tr>
	
	<c:forEach var="table" items="${dao.showAllEmploy()}">
		<tr>
			<td>
				<c:out value="${table.empNo}"></c:out>
			</td>
			
			<td>
				<c:out value="${table.name}"></c:out>
			</td>
			<td>
				<c:out value="${table.gender}"></c:out>
			</td>
			
			<td>
				<c:out value="${table.dept}"></c:out>
			</td>
			
			<td>
				<c:out value="${table.desig}"></c:out>
			</td>
			
			<td>
				<c:out value="${table.basic}"></c:out>
			</td>
			<td>
			
				<td><a href="ShowInfo.jsp?id=${id}">show info</a></td>
			</td>
		</tr>
	
	</c:forEach>
	<a href="AddEmploy.jsp">
		Add EMploy
	</a>

</table>

</body>
</html>