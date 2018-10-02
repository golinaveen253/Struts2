package org.websparrow.dao;

import java.sql.Connection;
import java.sql.DriverManager;

public class BaseDao {

	// method for create connection
		public static Connection getConnection() throws Exception {
			try {
				Class.forName("com.mysql.jdbc.Driver");
				return DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/ravi", "root", "root");
			} catch (Exception e) {
				e.printStackTrace();
				return null;
			}
		}

}
