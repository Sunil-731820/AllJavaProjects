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
<c:out value="${'Display Data From the Database '}"></c:out>
<sql:setDataSource var="db" driver="com.mysql.jdbc.Driver"  
     url="jdbc:mysql://localhost/upload_image_using_jstl"  
     user="root"  password="root"/>  
  
<sql:query dataSource="${db}" var="rs">  
SELECT * from sample;  
</sql:query>  


<table width="100%" border="1">
<tr>
	<th>idpicture</th>
	<th>caption</th>
	<th>img </th>
</tr>
    <c:forEach var="row" items="${rs.rows}">
        <tr>
            <td>${row.idpicture}</td>
            <td>${row.caption}</td>
            <td>
            	<c:out value="${row.img}"></c:out>
            </td>
        </tr>
    </c:forEach>
</table>

</body>
</html>