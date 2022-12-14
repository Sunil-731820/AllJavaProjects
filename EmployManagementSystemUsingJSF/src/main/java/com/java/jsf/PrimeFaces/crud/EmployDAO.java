package com.java.jsf.PrimeFaces.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class EmployDAO {
	
	Connection connection;
	PreparedStatement pst ;
	
	public Employ[] showEmploy() throws SQLException, ClassNotFoundException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select *from student17";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		List<Employ> employList = new ArrayList<Employ>();
		Employ employ = null;
		while(res.next()) {
			employ = new Employ();
			employ.setFirstName(res.getString("firstName"));
			employ.setLastName(res.getString("lastName"));
			employ.setAge(res.getInt("age"));
			employ.setLocation(res.getString("location"));
			employList.add(employ);
		}
		
		return employList.toArray(new Employ[employList.size()]);
	}

}
