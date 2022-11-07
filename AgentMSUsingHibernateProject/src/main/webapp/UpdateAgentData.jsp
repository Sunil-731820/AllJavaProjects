<%@page import="com.java.hib.AgentDAO"%>
<%@page import="com.java.hib.Gender"%>
<%@page import="com.java.hib.Agent"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="UpdateAgentData.jsp" method="get">
	Agent Number : 
	<input type="number" name="agentId"><br>
	Agent Name :
	<input type="text" name="name"><br>
	Agent City :
	<input type ="text" name=city><br>
	Gender :
	<input type="text" name ="gender"><br>
	Marital Status:
	<input type="text" name="maritalStatus"><br>
	Premium :
	<input type="number" name="premium"><br>
	<input type="submit" value="Update agent">
</form>

<%
	if(request.getParameter("agentId")!=null && request.getParameter("premium")!=null){
		Agent agent = new Agent();
		agent.setAgentId(Integer.parseInt(request.getParameter("agentId")));
		agent.setName(request.getParameter("name"));
		agent.setCity(request.getParameter("city"));
		agent.setGender(Gender.valueOf(request.getParameter("gender")));
		agent.setMaritalStatus(Integer.parseInt(request.getParameter("maritalStatus")));
		agent.setPremium(Double.parseDouble(request.getParameter("premium")));
		AgentDAO dao = new AgentDAO();
		dao.updateAgent(agent);
		
	}

%>

</body>
</html>