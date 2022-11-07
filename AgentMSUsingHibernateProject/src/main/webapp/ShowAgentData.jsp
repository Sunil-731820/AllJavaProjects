<%@page import="com.java.hib.Agent"%>
<%@page import="java.util.List"%>
<%@page import="com.java.hib.AgentDAO"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<table>
	<tr>
		<th>Agent Number</th>
		<th>Agent Name</th>
		<th>City</th>
		<th>Gender</th>
		<th>Marital Status</th>
		<th>Premium</th>
	</tr>
	
	<%
		AgentDAO dao = new AgentDAO();
		List<Agent> listOfAgent = dao.showAgent();
		
		for(Agent agent :listOfAgent){
	%>
		<tr>
			<th><%=agent.getAgentId()%></th>
			<th><%=agent.getName() %></th>
			<th><%=agent.getCity() %></th>
			<th><%=agent.getGender() %></th>
			<th><%=agent.getMaritalStatus() %></th>
			<th><%=agent.getPremium() %></th>
		
		</tr>
	
	<%
		}
	%>
	

</table>
</body>
</html>