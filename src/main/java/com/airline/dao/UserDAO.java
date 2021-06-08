package com.airline.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDAO {
	public static boolean validate(String username, String password) {
		Connection con = DBConnection.getConnection();
		try {
			PreparedStatement stmt = con.prepareStatement("select * from user where username=? and password=?");
			stmt.setString(1, username);
			stmt.setString(2, password);
			
			ResultSet result = stmt.executeQuery();
			
			if(result.next()) {
				return true;
			} else {
				return false;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
		return false;
	}
}
