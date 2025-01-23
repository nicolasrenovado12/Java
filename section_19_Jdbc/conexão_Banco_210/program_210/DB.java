package program_210;
import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.Properties;
public class DB {

	private static Connection conn = null;
	
	public static Connection getConnection() throws DbException  {
		if (conn == null) {
			Properties props = loadProperties();
			String url = props.getProperty("dburl");
			try {
				conn = DriverManager.getConnection(url, props);
			} catch (SQLException e) {
				throw new DbException("SQLException: " + e);

			}
			return conn;

		}
		return conn;
		
	}
	public static void closeConnection() throws DbException {
		if (conn != null) {
			try {
				conn.close();	
			}
			catch (SQLException e) {
				throw new DbException(e.getMessage());
			}
		}
	} 

	private static Properties loadProperties() throws DbException {
		try(FileInputStream fs = new FileInputStream("/home/nicolas-guilherme/Documents/db.properties")) {
			Properties props = new Properties();
			props.load(fs);
			return props;
		} catch(Exception e) {
			throw new DbException("Ocorreu um erro: " + e);
		}
		
		 
	}
	
}
