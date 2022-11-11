<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>  
<%@ taglib uri="http://java.sun.com/jsp/jstl/sql" prefix="sql"%>  
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost/test"
user="root"
password="root"
/>

<c:set var="StudentId" value="${100}" />
<sql:update dataSource="${db}" var="count">
DELETE FROM STUDENTS WHERE id = ?
<sql:param value="${StudentId}"/>
</sql:update>

<sql:query dataSource="${db}" var="rs">
SELECT *FROM STUDENTS
</sql:query>

<table border="10px" align="center">
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name</th>
		<th>Age</th>
	</tr>
	
	<c:forEach var="table" items="${rs.rows}">
		<tr>
			<td>
				<c:out value="${table.id}"></c:out>
			</td>
			<td>
				<c:out value="${table.First_Name}"></c:out>
			</td>
			<td>
				<c:out value="${table.Last_Name}"></c:out>
			</td>
			<td>
				<c:out value="${table.Age}"></c:out>
			</td>
		</tr>
	
	
	</c:forEach>

</table>
</body>
</html>