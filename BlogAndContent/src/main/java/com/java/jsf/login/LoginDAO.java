package com.java.jsf.login;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.java.jsf.Connection.ConnectionHelper;

public class LoginDAO {
	
	
	
	Connection connection;
	PreparedStatement pst;
	
	DecryptionOfPinCode dec1 = new DecryptionOfPinCode();
	
	public int loginUsingPinCode(String userName , String password) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "select count(*) cnt from login where userName = ? and password = ?";
		pst = connection.prepareStatement(cmd);
		pst.setString(1, userName);
//		EncrptionOfPinCode erc1 = new EncrptionOfPinCode();
//		String pin11 = erc1.encrypt(pinCode);
//		String pin12 = dec1.decrypt(pin11);
//		pst.setString(2, pin12);
//		String plain = DecryptionOfPinCode.decrypt(pinCode);
//		pst.setString(2, plain);
		pst.setString(2, password);
		ResultSet res = pst.executeQuery();
		res.next();
		int count = res.getInt("cnt");
		String plain1 = EncrptionOfPinCode.encrypt(password);
//		System.out.println(plain1);
		String plainText = DecryptionOfPinCode.decrypt(plain1);
//		System.out.println(plainText);
		return count;
	}
	
	
	public String RegisterUsingPinCode(Register register) throws ClassNotFoundException, SQLException {
		connection = ConnectionHelper.getConnection();
		String cmd = "insert into login(userName , password)"+
				" values (?,?)";
		pst = connection.prepareStatement(cmd);
		pst.setString(1,register.getUserName());
		pst.setString(2, register.getPassword());
		pst.executeUpdate();
		return "Register SuccessFully";
	}

}
