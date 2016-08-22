package test;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBManager {
	public static Connection getConnection() {
		Connection con =null;
		try {
			Class.forName("com.mysql.jdbc.Driver").newInstance();
            // MySQLに接続
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/db1", "root", "Ateam");
			return con;
		}
		catch (Exception e) {
			throw new IllegalStateException(e);
		}
	}

	public static void main (String[] args) throws Exception {
		Connection con = getConnection();
		System.out.println("con =" + con);
		con.close();
	}
}
