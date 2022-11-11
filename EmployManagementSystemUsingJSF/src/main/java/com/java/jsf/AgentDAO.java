package com.java.jsf;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AgentDAO {
	 Connection connection;
	PreparedStatement pst;
	
//	Show All Agent database
	public  Agent[] showAllAgent() throws ClassNotFoundException, SQLException{
		connection = ConnectionHelper.geConnection();
		String cmd = "select *from agent";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		List<Agent> listOfAgent = new ArrayList<Agent>();
		Agent agent = null;
		while(res.next()) {
			agent = new Agent();
			agent.setAgentId(res.getInt("agentId"));
			agent.setName(res.getString("name"));
			agent.setCity(res.getString("city"));
			agent.setGender(Gender.valueOf(res.getString("gender")));
			agent.setMaritalStatus(res.getInt("maritalStatus"));
			agent.setPremium(res.getDouble("premium"));
			listOfAgent.add(agent);
			
		}
		return listOfAgent.toArray(new Agent[listOfAgent.size()]);
		
	}

}
