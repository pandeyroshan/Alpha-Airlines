package com.airline.dao;

import java.sql.Connection;

public class UserDAO {
	public static boolean validate(String username, String password) {
		Connection con = DBConnection.getConnection();
		if(con!=null) {
			System.out.println("Connected");
		}
		return true;
	}
}
