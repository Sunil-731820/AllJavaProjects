<%@ page import="javax.servlet.http.*,javax.servlet.*" %>  
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
     user="root"  password="root"/>  
  

<sql:update dataSource="${db}" var="count">
INSERT INTO students Values(100,'Harish','kumar',19);
</sql:update>

<sql:query var="rs" dataSource="${db}">
SELECT *FROM students;
</sql:query>

<table border="10px" align="center">
	<tr>
		<th>Student Id </th>
		<th>Student First Name </th>
		<th>Student Last Name</th>
		<th>Student Age</th>
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