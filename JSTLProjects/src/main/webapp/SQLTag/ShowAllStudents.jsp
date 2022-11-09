<%@ page import="java.io.*,java.util.*,java.sql.*"%>  
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
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from Students;  
</sql:query>  

<h2>The List of The Student is </h2>
<table border="10px" align="center">
	<tr>
		<th>Id</th>
		<th>First Name</th>
		<th>Last Name </th>
		<th>Age</th> 
	</tr>
	
	<c:forEach var="table" items="${rs.rows}">
		<tr>
			<th>
			<c:out value="${table.id}"></c:out>
			<td><c:out value="${table.First_Name}"/></td>  
			<td><c:out value="${table.Last_Name}"/></td>  
			<td><c:out value="${table.Age}"/></td>  
			</th>
		
		</tr>
	
	</c:forEach>
</table>




</body>
</html>