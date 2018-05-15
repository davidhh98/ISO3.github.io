package dao.connection;

import java.sql.Connection;
import java.sql.DriverManager;

public class MySQLConnection {		
		private static final String url = "jdbc:mysql://localhost:3306/";
		private static final String dbName = "tienda";
		private static final String driver = "com.mysql.jdbc.Driver";
		private static final String userName = "root";
		private static final String password = "";

		public static Connection getConexion() {
			try {
				Class.forName(driver).newInstance();
				Connection conn = (Connection) DriverManager.getConnection(url + dbName, userName, password);
				return conn;
			} catch (Exception sqle) {
				sqle.printStackTrace();
			}
			return null;
		}
	}

