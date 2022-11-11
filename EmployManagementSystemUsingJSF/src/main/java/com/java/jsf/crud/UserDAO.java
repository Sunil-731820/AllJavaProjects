package com.java.jsf.crud;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import com.java.jsf.ConnectionHelper;

public class UserDAO {
	Connection connection;
	PreparedStatement pst;
	
//	Fetch All Details 
	
	public User[] showUser() throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.geConnection();
		String cmd = "select *from users";
		pst = connection.prepareStatement(cmd);
		ResultSet res = pst.executeQuery();
		List<User> userList = new ArrayList<User>();
		User user = null;
		while(res.next()) {
			user = new User();
			user.setId(res.getInt("id"));
			user.setName(res.getString("name"));
			user.setEmail(res.getString("email"));
			user.setPassword(res.getString("password"));
			user.setGender(res.getString("gender"));
			user.setAddress(res.getString("address"));
			userList.add(user);
		}	
		return userList.toArray(new User[userList.size()]);
	}

}
