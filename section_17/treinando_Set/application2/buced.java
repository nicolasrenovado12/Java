package application2;

import java.io.FileInputStream;
import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;

import section_19_Jdbc.DbException;

public class buced {

	private static Connection conn = null;
	
	public static Connection getConnection() {
		if (conn == null) {
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			try {
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;

		}
		return conn;
		
	}
	public static void closeConnection() {
		if (conn != null) {
			try {
				conn.close();	
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	} 

	private static Properties loadProperties() {
		try(FileInputStream fs = new FileInputStream("/mnt/DECC06C3CC0695C5/Java/section_19_Jdbc/src/section_19_Jdbc/db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch(IOException e) {
			throw new DbException("Ocorreu um erro: " + e);
		}
		
		 
	}
}
