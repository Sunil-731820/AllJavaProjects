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
<form action="AddEmploy.jsp" method="get">
  Employ number:
  <input type="number" name="empNo" /><br/><br/>
  Employ name:
  <input type="text" name="name" /><br/><br/>
  Gender:
  <input type="radio" name="gender" value="MALE" />Male
  <input type="radio" name="gender" value="FEMALE" />Female
  <br/><br/>
  Department:
  <input type="text" name="dept" /><br/><br/>
  Designation :
   <input type="text" name="desig" /><br/><br/>
   Basic :
    <input type="number" name="basic" /><br/><br/>
  <input type="submit" name="Add"/><br/><br/>

</form>
<c:if test="${param.empNo != null }">
    <jsp:useBean id="employ" class="com.java.jstl.Employ"  />
    <jsp:setProperty property="*" name="employ"/>
    <jsp:useBean id="dao" class="com.java.jstl.EmployDAO" />
    <c:out value="${dao.addEmpoy(employ)}" />
</c:if>



</body>
</html>