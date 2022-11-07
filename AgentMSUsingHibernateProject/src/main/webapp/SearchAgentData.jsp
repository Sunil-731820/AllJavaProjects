<%@page import="com.java.hib.Agent"%>
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
<form action="SearchAgentData.jsp" method="get">

Enter the Agent Id : 
	<input type="number" name="agentId"><br>
	<input type="submit" value="Search">
	

</form>

<%
	if(request.getParameter("agentId")!=null){
		int agentId = Integer.parseInt(request.getParameter("agentId"));
		AgentDAO dao = new AgentDAO();
		Agent agent = dao.searchAgent(agentId);
		
		if(agent!=null){
			out.println("The Agent Data is ");
			out.println("Agent Id  "+agent.getAgentId()+"<br>");
			out.println("Agent Name is  "+agent.getName()+"<br>");
			out.println("Agent City  "+ agent.getCity()+"<br>");
			out.println("Gender is "+agent.getGender()+"<br>");
			out.println("Marital Status  "+ agent.getMaritalStatus()+"<br>");
			out.println("Premium is  "+agent.getPremium()+"<br>");
		}
		else{
			out.println("Agent Records Does not Exist");
		}
	}

%>

</body>
</html>