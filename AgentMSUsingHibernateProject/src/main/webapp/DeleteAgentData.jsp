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
<form action="DeleteAgentData.jsp" method="get">
	Enter the Agent Id :
	<input type="number" name="agentId"><br>
	<input type="submit" value="delete">

</form>
<%
	if(request.getParameter("agentId")!=null){
		AgentDAO dao = new AgentDAO();
		int agentId = Integer.parseInt(request.getParameter("agentId"));
		out.println(dao.deleteAgent(agentId));
	}

%>

</body>
</html>